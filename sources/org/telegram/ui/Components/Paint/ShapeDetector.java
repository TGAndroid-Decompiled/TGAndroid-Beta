package org.telegram.ui.Components.Paint;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;

public class ShapeDetector {
    private static final double diagonal;
    private static final double halfDiagonal;
    private static DispatchQueue queue = new DispatchQueue("ShapeDetector");
    Context context;
    private boolean isLearning;
    private Utilities.Callback onShapeDetected;
    SharedPreferences preferences;
    private boolean shapeDetected;
    private int templatesUsageScore;
    private final int MIN_POINTS = 8;
    private final long TIMEOUT = 150;
    private ArrayList points = new ArrayList();
    private ArrayList templates = new ArrayList();
    private ArrayList toSave = null;
    private AtomicBoolean busy = new AtomicBoolean(false);
    private AtomicBoolean scheduled = new AtomicBoolean(false);
    private Runnable detect = new Runnable() {
        @Override
        public final void run() {
            this.f$0.lambda$new$2();
        }
    };

    static {
        double dSqrt = Math.sqrt(125000.0d);
        diagonal = dSqrt;
        halfDiagonal = dSqrt / 2.0d;
    }

    private static class Point {
        public double x;
        public double y;

        public Point(double d, double d2) {
            set(d, d2);
        }

        public void set(double d, double d2) {
            this.x = d;
            this.y = d2;
        }

        public double distance(double d, double d2) {
            return Math.sqrt(Math.pow(d - this.x, 2.0d) + Math.pow(d2 - this.y, 2.0d));
        }

        public double distance(Point point) {
            return distance(point.x, point.y);
        }
    }

    private static class RectD {
        public double bottom;
        public double left;
        public double right;
        public double top;

        public RectD(double d, double d2, double d3, double d4) {
            this.left = d;
            this.top = d2;
            this.right = d3;
            this.bottom = d4;
        }

        public void union(double d, double d2) {
            if (this.left >= d) {
                this.left = d;
            }
            if (this.top >= d2) {
                this.top = d2;
            }
            if (this.right <= d) {
                this.right = d;
            }
            if (this.bottom <= d2) {
                this.bottom = d2;
            }
        }

        public String toString() {
            return "RectD{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
        }
    }

    private static class Template {
        public ArrayList points;
        public int score;
        public int shapeType;

        private Template() {
            this.points = new ArrayList();
        }
    }

    public ShapeDetector(Context context, Utilities.Callback callback) {
        this.context = context;
        this.onShapeDetected = callback;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        this.preferences = sharedPreferences;
        this.isLearning = sharedPreferences.getBoolean("learning", false);
        this.templatesUsageScore = this.preferences.getInt("scoreall", 0);
        parseTemplates();
    }

    public static boolean isLearning(Context context) {
        return context.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
    }

    public static void setLearning(Context context, boolean z) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("shapedetector_conf", 0).edit();
        if (!z) {
            editorEdit.clear();
        } else {
            editorEdit.putBoolean("learning", true);
        }
        editorEdit.apply();
    }

    public void scheduleDetect(boolean z) {
        if (this.busy.get()) {
            return;
        }
        if (this.scheduled.get() && !this.shapeDetected && z) {
            queue.cancelRunnable(this.detect);
            queue.postRunnable(this.detect, 150L);
        }
        if (this.scheduled.get()) {
            return;
        }
        this.scheduled.set(true);
        queue.postRunnable(this.detect, 150L);
    }

    public void append(double d, double d2, boolean z) {
        boolean z2;
        synchronized (this) {
            this.points.add(new Point(d, d2));
            z2 = this.points.size() >= 8;
        }
        if (z2) {
            scheduleDetect(z);
        }
    }

    public void clear() {
        synchronized (this) {
            this.points.clear();
        }
        queue.cancelRunnable(this.detect);
        this.scheduled.set(false);
        this.shapeDetected = false;
        if (!this.isLearning || this.toSave == null) {
            return;
        }
        showSaveLearnDialog();
    }

    private void parseTemplates() {
        queue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$parseTemplates$0();
            }
        });
    }

    public void lambda$parseTemplates$0() {
        AnonymousClass1 anonymousClass1;
        char c;
        String string;
        try {
            InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
            while (true) {
                anonymousClass1 = null;
                c = 0;
                if (inputStreamOpen.available() <= 5) {
                    break;
                }
                Template template = new Template();
                template.shapeType = inputStreamOpen.read();
                int i = inputStreamOpen.read();
                int i2 = inputStreamOpen.read() - 64;
                int i3 = inputStreamOpen.read() - 64;
                if (inputStreamOpen.available() < i * 2) {
                    break;
                }
                for (int i4 = 0; i4 < i; i4++) {
                    template.points.add(new Point((inputStreamOpen.read() - i2) - 127, (inputStreamOpen.read() - i3) - 127));
                }
                template.score = this.preferences.getInt("score" + this.templates.size(), 0);
                this.templates.add(template);
            }
            if (this.isLearning && (string = this.preferences.getString("moretemplates", null)) != null) {
                String[] strArrSplit = string.split("\\|");
                int size = this.templates.size();
                int i5 = 0;
                while (i5 < strArrSplit.length) {
                    Template template2 = new Template();
                    String[] strArrSplit2 = strArrSplit[i5].split(",");
                    if (strArrSplit2.length > 1) {
                        template2.shapeType = Integer.parseInt(strArrSplit2[c]);
                        for (int i6 = 1; i6 < strArrSplit2.length; i6 += 2) {
                            template2.points.add(new Point(Double.parseDouble(strArrSplit2[i6]), Double.parseDouble(strArrSplit2[i6 + 1])));
                        }
                        template2.score = this.preferences.getInt("score" + (size + i5), 0);
                        this.templates.add(template2);
                    }
                    i5++;
                    anonymousClass1 = null;
                    c = 0;
                }
            }
            inputStreamOpen.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$new$2() {
        String str;
        if (this.busy.get()) {
            return;
        }
        this.scheduled.set(false);
        this.busy.set(true);
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            try {
                if (this.points.size() < 8) {
                    this.busy.set(false);
                    return;
                }
                ArrayList arrayListResample = resample(fullClone(this.points), 48);
                ArrayList arrayListFullClone = fullClone(arrayListResample);
                rotate(arrayListFullClone, indicativeAngle(arrayListFullClone));
                Point pointCentroid = centroid(arrayListFullClone);
                translate(arrayListFullClone, -pointCentroid.x, -pointCentroid.y);
                scale(arrayListFullClone, 250.0d);
                Point pointCentroid2 = centroid(arrayListFullClone);
                double d = Double.MAX_VALUE;
                int i = 0;
                int i2 = -1;
                int i3 = -1;
                while (i < this.templates.size()) {
                    ArrayList arrayList = arrayListFullClone;
                    int i4 = i;
                    ArrayList arrayList2 = arrayListFullClone;
                    int i5 = i2;
                    double dDistanceAtBestAngle = distanceAtBestAngle(arrayList, pointCentroid2, ((Template) this.templates.get(i)).points, -1.5707963267948966d, 1.5707963267948966d, 0.06981317007977318d);
                    if (dDistanceAtBestAngle < d) {
                        d = dDistanceAtBestAngle;
                        i3 = ((Template) this.templates.get(i4)).shapeType;
                        i2 = i4;
                    } else {
                        i2 = i5;
                    }
                    i = i4 + 1;
                    arrayListFullClone = arrayList2;
                }
                final ArrayList arrayList3 = arrayListFullClone;
                final int i6 = i2;
                int i7 = 1.0d - (d / halfDiagonal) < 0.8d ? -1 : i3;
                final Shape shapeConstructShape = constructShape(i7, arrayListResample);
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("took ");
                    sb.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb.append("ms to ");
                    sb.append(shapeConstructShape != null ? "" : "not ");
                    sb.append("detect a shape");
                    if (shapeConstructShape != null) {
                        str = " (template#" + i6 + " shape#" + i7 + ")";
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    Log.i("shapedetector", sb.toString());
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$new$1(shapeConstructShape, i6, arrayList3);
                    }
                });
                this.busy.set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$new$1(Shape shape, int i, ArrayList arrayList) {
        boolean z = shape != null;
        this.shapeDetected = z;
        if (z && i >= 0 && i < this.templates.size()) {
            this.templatesUsageScore++;
            ((Template) this.templates.get(i)).score++;
            this.preferences.edit().putInt("score" + i, ((Template) this.templates.get(i)).score).putInt("scoreall", this.templatesUsageScore).apply();
            this.toSave = null;
        } else {
            this.toSave = arrayList;
        }
        this.onShapeDetected.run(shape);
    }

    private ArrayList resample(ArrayList arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((Point) arrayList.get(0));
        int i2 = i - 1;
        double dPathLength = pathLength(arrayList) / ((double) i2);
        int i3 = 1;
        double d = 0.0d;
        while (i3 < arrayList.size()) {
            int i4 = i3 - 1;
            double dDistance = ((Point) arrayList.get(i4)).distance((Point) arrayList.get(i3));
            double d2 = d + dDistance;
            if (d2 >= dPathLength) {
                double d3 = (dPathLength - d) / dDistance;
                Point point = new Point(((Point) arrayList.get(i4)).x + ((((Point) arrayList.get(i3)).x - ((Point) arrayList.get(i4)).x) * d3), ((Point) arrayList.get(i4)).y + (d3 * (((Point) arrayList.get(i3)).y - ((Point) arrayList.get(i4)).y)));
                arrayList2.add(point);
                arrayList.add(i3, point);
                d = 0.0d;
            } else {
                d = d2;
            }
            i3++;
            i2 = i2;
            dPathLength = dPathLength;
        }
        if (arrayList2.size() == i2) {
            arrayList2.add((Point) arrayList.get(arrayList.size() - 1));
        }
        return arrayList2;
    }

    private double distanceAtBestAngle(ArrayList arrayList, Point point, ArrayList arrayList2, double d, double d2, double d3) {
        double dSqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
        double d4 = 1.0d - dSqrt;
        double d5 = (dSqrt * d) + (d4 * d2);
        double d6 = (d4 * d) + (dSqrt * d2);
        double dDistanceAtAngle = distanceAtAngle(arrayList, point, arrayList2, d5);
        double dDistanceAtAngle2 = distanceAtAngle(arrayList, point, arrayList2, d6);
        double d7 = d5;
        double d8 = d6;
        double d9 = d;
        double d10 = d2;
        while (Math.abs(d10 - d9) > d3) {
            if (dDistanceAtAngle < dDistanceAtAngle2) {
                double d11 = (dSqrt * d9) + (d4 * d8);
                double d12 = dDistanceAtAngle;
                dDistanceAtAngle = distanceAtAngle(arrayList, point, arrayList2, d11);
                dDistanceAtAngle2 = d12;
                d10 = d8;
                d8 = d7;
                d7 = d11;
            } else {
                double d13 = (d4 * d7) + (dSqrt * d10);
                dDistanceAtAngle = dDistanceAtAngle2;
                dDistanceAtAngle2 = distanceAtAngle(arrayList, point, arrayList2, d13);
                double d14 = d7;
                d7 = d8;
                d8 = d13;
                d9 = d14;
            }
        }
        return Math.min(dDistanceAtAngle, dDistanceAtAngle2);
    }

    private double distanceAtAngle(ArrayList arrayList, Point point, ArrayList arrayList2, double d) {
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        double dDistance = 0.0d;
        int i = 0;
        while (i < iMin) {
            Point point2 = (Point) arrayList.get(i);
            Point point3 = (Point) arrayList2.get(i);
            double d2 = point2.x;
            int i2 = i;
            double d3 = point.x;
            double d4 = d2 - d3;
            double d5 = point2.y;
            int i3 = iMin;
            double d6 = point.y;
            double d7 = d5 - d6;
            dDistance += point3.distance(((d4 * dCos) - (d7 * dSin)) + d3, (d4 * dSin) + (d7 * dCos) + d6);
            i = i2 + 1;
            iMin = i3;
        }
        return dDistance / ((double) arrayList.size());
    }

    private ArrayList fullClone(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            Point point = (Point) arrayList.get(i);
            arrayList2.add(new Point(point.x, point.y));
        }
        return arrayList2;
    }

    private void translate(ArrayList arrayList, double d, double d2) {
        for (int i = 0; i < arrayList.size(); i++) {
            Point point = (Point) arrayList.get(i);
            point.x += d;
            point.y += d2;
        }
    }

    private void scale(ArrayList arrayList, double d) {
        RectD rectDBoundingBox = boundingBox(arrayList);
        double d2 = rectDBoundingBox.right - rectDBoundingBox.left;
        double d3 = rectDBoundingBox.bottom - rectDBoundingBox.top;
        for (int i = 0; i < arrayList.size(); i++) {
            Point point = (Point) arrayList.get(i);
            point.x *= d / d2;
            point.y *= d / d3;
        }
    }

    private void rotate(ArrayList arrayList, double d) {
        rotate(arrayList, d, centroid(arrayList));
    }

    private void rotate(ArrayList arrayList, double d, Point point) {
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        int i = 0;
        while (i < arrayList.size()) {
            Point point2 = (Point) arrayList.get(i);
            double d2 = point2.x;
            double d3 = point.x;
            double d4 = d2 - d3;
            double d5 = point2.y;
            int i2 = i;
            double d6 = point.y;
            double d7 = d5 - d6;
            point2.y = (d4 * dSin) + (d7 * dCos) + d6;
            point2.x = ((d4 * dCos) - (d7 * dSin)) + d3;
            i = i2 + 1;
        }
    }

    private RectD boundingBox(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((Point) arrayList.get(0)).x;
        double d2 = ((Point) arrayList.get(0)).y;
        RectD rectD = new RectD(d, d2, d, d2);
        for (int i = 1; i < arrayList.size(); i++) {
            Point point = (Point) arrayList.get(i);
            rectD.union(point.x, point.y);
        }
        return rectD;
    }

    private Point centroid(ArrayList arrayList) {
        Point point = new Point(0.0d, 0.0d);
        for (int i = 0; i < arrayList.size(); i++) {
            Point point2 = (Point) arrayList.get(i);
            point.x += point2.x;
            point.y += point2.y;
        }
        point.x /= (double) arrayList.size();
        point.y /= (double) arrayList.size();
        return point;
    }

    private double indicativeAngle(ArrayList arrayList) {
        Point pointCentroid = centroid(arrayList);
        return Math.atan2(pointCentroid.y - ((Point) arrayList.get(0)).y, pointCentroid.x - ((Point) arrayList.get(0)).x);
    }

    private double pathLength(ArrayList arrayList) {
        double dDistance = 0.0d;
        for (int i = 1; i < arrayList.size(); i++) {
            dDistance += ((Point) arrayList.get(i - 1)).distance((Point) arrayList.get(i));
        }
        return dDistance;
    }

    private int findAnglePoint(ArrayList arrayList) {
        return findAnglePoint(arrayList, 0);
    }

    private int findAnglePoint(ArrayList arrayList, int i) {
        int iMax = Math.max(1, arrayList.size() / 4);
        int i2 = i;
        while (iMax < arrayList.size() - 1) {
            Point point = (Point) arrayList.get(iMax - 1);
            Point point2 = (Point) arrayList.get(iMax);
            int i3 = iMax + 1;
            Point point3 = (Point) arrayList.get(i3);
            double dDistance = point.distance(point2);
            double dDistance2 = point.distance(point3);
            double dDistance3 = point2.distance(point3);
            if ((Math.acos((((dDistance * dDistance) + (dDistance2 * dDistance2)) - (dDistance3 * dDistance3)) / ((dDistance * 2.0d) * dDistance2)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i2 <= 0) {
                    return iMax;
                }
                i2--;
            }
            iMax = i3;
        }
        return -1;
    }

    private Shape constructShape(int i, ArrayList arrayList) {
        int iFindAnglePoint;
        if (i < 0 || i >= Brush.Shape.SHAPES_LIST.size() || arrayList.size() < 1) {
            return null;
        }
        Shape shape = new Shape(Brush.Shape.make(i));
        if (i == 4) {
            int iFindAnglePoint2 = findAnglePoint(arrayList);
            if (iFindAnglePoint2 <= 0) {
                return null;
            }
            if (iFindAnglePoint2 > 10) {
                iFindAnglePoint2 -= 2;
            }
            Point point = (Point) arrayList.get(iFindAnglePoint2);
            Point point2 = (Point) arrayList.get(iFindAnglePoint2 / 2);
            Point point3 = (Point) arrayList.get(0);
            shape.centerX = (float) point.x;
            shape.centerY = (float) point.y;
            shape.middleX = (float) point2.x;
            shape.middleY = (float) point2.y;
            shape.radiusX = (float) point3.x;
            shape.radiusY = (float) point3.y;
            shape.arrowTriangleLength = 16.0f;
        } else {
            Point pointCentroid = centroid(arrayList);
            shape.centerX = (float) pointCentroid.x;
            shape.centerY = (float) pointCentroid.y;
            RectD rectDBoundingBox = boundingBox(arrayList);
            shape.radiusX = ((float) (rectDBoundingBox.right - rectDBoundingBox.left)) / 2.0f;
            shape.radiusY = ((float) (rectDBoundingBox.bottom - rectDBoundingBox.top)) / 2.0f;
            if (i == 2 && (iFindAnglePoint = findAnglePoint(arrayList, 1)) > 0) {
                Point point4 = (Point) arrayList.get(iFindAnglePoint);
                shape.rotation = (float) Math.atan2(point4.y - ((double) shape.centerY), point4.x - ((double) shape.centerX));
            }
        }
        return shape;
    }

    private void showSaveLearnDialog() {
        final ArrayList arrayList = this.toSave;
        new AlertDialog.Builder(this.context).setTitle("Shape?").setItems(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.lambda$showSaveLearnDialog$3(arrayList, dialogInterface, i);
            }
        }).show();
        this.toSave = null;
    }

    public void lambda$showSaveLearnDialog$3(ArrayList arrayList, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i2 = 0; i2 < this.templates.size(); i2++) {
                Template template = (Template) this.templates.get(i2);
                if (i2 > 0) {
                    sb.append(",\n");
                }
                sb.append("\t{\n\t\t\"shape\": ");
                sb.append(template.shapeType);
                sb.append(",\n\t\t\"points\": [");
                for (int i3 = 0; i3 < template.points.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(",");
                    }
                    Point point = (Point) template.points.get(i3);
                    sb.append("[");
                    sb.append(Math.round(point.x));
                    sb.append(",");
                    sb.append(Math.round(point.y));
                    sb.append("]");
                }
                sb.append("],\n\t\t\"freq\": ");
                sb.append(Math.round(((template.score / this.templatesUsageScore) * 100.0f) * 100.0f) / 100.0f);
                sb.append("\n\t}");
            }
            sb.append("\n]");
            Log.i("shapedetector", sb.toString());
            return;
        }
        Template template2 = new Template();
        template2.shapeType = i - 1;
        template2.points = arrayList;
        this.templates.add(template2);
        String string = this.preferences.getString("moretemplates", null);
        String str = string == null ? "" + template2.shapeType : string + "|" + template2.shapeType;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            str = str + "," + Math.round(((Point) arrayList.get(i4)).x) + "," + Math.round(((Point) arrayList.get(i4)).y);
        }
        this.preferences.edit().putString("moretemplates", str).apply();
    }
}
