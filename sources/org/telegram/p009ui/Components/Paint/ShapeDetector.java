package org.telegram.p009ui.Components.Paint;

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
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.Components.Paint.Brush;

public class ShapeDetector {
    private static final double diagonal;
    private static final double halfDiagonal;
    private static DispatchQueue queue = new DispatchQueue("ShapeDetector");
    Context context;
    private boolean isLearning;
    private Utilities.Callback<Shape> onShapeDetected;
    SharedPreferences preferences;
    private boolean shapeDetected;
    private int templatesUsageScore;
    private ArrayList<Point> points = new ArrayList<>();
    private ArrayList<Template> templates = new ArrayList<>();
    private ArrayList<Point> toSave = null;
    private AtomicBoolean busy = new AtomicBoolean(false);
    private AtomicBoolean scheduled = new AtomicBoolean(false);
    private Runnable detect = new Runnable() {
        @Override
        public final void run() {
            ShapeDetector.this.lambda$new$2();
        }
    };

    static {
        double sqrt = Math.sqrt(125000.0d);
        diagonal = sqrt;
        halfDiagonal = sqrt / 2.0d;
    }

    public static class Point {
        public double f1080x;
        public double f1081y;

        public Point(double d, double d2) {
            set(d, d2);
        }

        public void set(double d, double d2) {
            this.f1080x = d;
            this.f1081y = d2;
        }

        public double distance(double d, double d2) {
            return Math.sqrt(Math.pow(d - this.f1080x, 2.0d) + Math.pow(d2 - this.f1081y, 2.0d));
        }

        public double distance(Point point) {
            return distance(point.f1080x, point.f1081y);
        }
    }

    public static class RectD {
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

    public static class Template {
        public ArrayList<Point> points;
        public int score;
        public int shapeType;

        private Template() {
            this.points = new ArrayList<>();
        }
    }

    public ShapeDetector(Context context, Utilities.Callback<Shape> callback) {
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
        SharedPreferences.Editor edit = context.getSharedPreferences("shapedetector_conf", 0).edit();
        if (!z) {
            edit.clear();
        } else {
            edit.putBoolean("learning", true);
        }
        edit.apply();
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
                ShapeDetector.this.lambda$parseTemplates$0();
            }
        });
    }

    public void lambda$parseTemplates$0() {
        C24731 c24731;
        char c;
        String string;
        try {
            InputStream open = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
            while (true) {
                c24731 = null;
                c = 0;
                if (open.available() <= 5) {
                    break;
                }
                Template template = new Template();
                template.shapeType = open.read();
                int read = open.read();
                int read2 = open.read() - 64;
                int read3 = open.read() - 64;
                if (open.available() < read * 2) {
                    break;
                }
                for (int i = 0; i < read; i++) {
                    template.points.add(new Point((open.read() - read2) - 127, (open.read() - read3) - 127));
                }
                template.score = this.preferences.getInt("score" + this.templates.size(), 0);
                this.templates.add(template);
            }
            if (this.isLearning && (string = this.preferences.getString("moretemplates", null)) != null) {
                String[] split = string.split("\\|");
                int size = this.templates.size();
                int i2 = 0;
                while (i2 < split.length) {
                    Template template2 = new Template();
                    String[] split2 = split[i2].split(",");
                    if (split2.length > 1) {
                        template2.shapeType = Integer.parseInt(split2[c]);
                        for (int i3 = 1; i3 < split2.length; i3 += 2) {
                            template2.points.add(new Point(Double.parseDouble(split2[i3]), Double.parseDouble(split2[i3 + 1])));
                        }
                        template2.score = this.preferences.getInt("score" + (size + i2), 0);
                        this.templates.add(template2);
                    }
                    i2++;
                    c24731 = null;
                    c = 0;
                }
            }
            open.close();
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public void lambda$new$2() {
        String str;
        if (this.busy.get()) {
            return;
        }
        this.scheduled.set(false);
        this.busy.set(true);
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (this.points.size() < 8) {
                this.busy.set(false);
                return;
            }
            ArrayList<Point> resample = resample(fullClone(this.points), 48);
            ArrayList<Point> fullClone = fullClone(resample);
            rotate(fullClone, indicativeAngle(fullClone));
            Point centroid = centroid(fullClone);
            translate(fullClone, -centroid.f1080x, -centroid.f1081y);
            scale(fullClone, 250.0d);
            Point centroid2 = centroid(fullClone);
            double d = Double.MAX_VALUE;
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            while (i < this.templates.size()) {
                ArrayList<Point> arrayList = fullClone;
                int i4 = i;
                ArrayList<Point> arrayList2 = fullClone;
                int i5 = i2;
                double distanceAtBestAngle = distanceAtBestAngle(arrayList, centroid2, this.templates.get(i).points, -1.5707963267948966d, 1.5707963267948966d, 0.06981317007977318d);
                if (distanceAtBestAngle < d) {
                    d = distanceAtBestAngle;
                    i3 = this.templates.get(i4).shapeType;
                    i2 = i4;
                } else {
                    i2 = i5;
                }
                i = i4 + 1;
                fullClone = arrayList2;
            }
            final ArrayList<Point> arrayList3 = fullClone;
            final int i6 = i2;
            int i7 = 1.0d - (d / halfDiagonal) < 0.8d ? -1 : i3;
            final Shape constructShape = constructShape(i7, resample);
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb = new StringBuilder();
                sb.append("took ");
                sb.append(System.currentTimeMillis() - currentTimeMillis);
                sb.append("ms to ");
                sb.append(constructShape != null ? "" : "not ");
                sb.append("detect a shape");
                if (constructShape != null) {
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
                    ShapeDetector.this.lambda$new$1(constructShape, i6, arrayList3);
                }
            });
            this.busy.set(false);
        }
    }

    public void lambda$new$1(Shape shape, int i, ArrayList arrayList) {
        boolean z = shape != null;
        this.shapeDetected = z;
        if (z && i >= 0 && i < this.templates.size()) {
            this.templatesUsageScore++;
            this.templates.get(i).score++;
            this.preferences.edit().putInt("score" + i, this.templates.get(i).score).putInt("scoreall", this.templatesUsageScore).apply();
            this.toSave = null;
        } else {
            this.toSave = arrayList;
        }
        this.onShapeDetected.run(shape);
    }

    private ArrayList<Point> resample(ArrayList<Point> arrayList, int i) {
        double d;
        int i2;
        ArrayList<Point> arrayList2 = new ArrayList<>();
        arrayList2.add(arrayList.get(0));
        double pathLength = pathLength(arrayList);
        int i3 = i - 1;
        double d2 = i3;
        Double.isNaN(d2);
        double d3 = pathLength / d2;
        int i4 = 1;
        double d4 = 0.0d;
        while (i4 < arrayList.size()) {
            int i5 = i4 - 1;
            double distance = arrayList.get(i5).distance(arrayList.get(i4));
            double d5 = d4 + distance;
            if (d5 >= d3) {
                double d6 = (d3 - d4) / distance;
                i2 = i3;
                d = d3;
                Point point = new Point(arrayList.get(i5).f1080x + ((arrayList.get(i4).f1080x - arrayList.get(i5).f1080x) * d6), arrayList.get(i5).f1081y + (d6 * (arrayList.get(i4).f1081y - arrayList.get(i5).f1081y)));
                arrayList2.add(point);
                arrayList.add(i4, point);
                d4 = 0.0d;
            } else {
                d = d3;
                i2 = i3;
                d4 = d5;
            }
            i4++;
            i3 = i2;
            d3 = d;
        }
        if (arrayList2.size() == i3) {
            arrayList2.add(arrayList.get(arrayList.size() - 1));
        }
        return arrayList2;
    }

    private double distanceAtBestAngle(ArrayList<Point> arrayList, Point point, ArrayList<Point> arrayList2, double d, double d2, double d3) {
        double sqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
        double d4 = 1.0d - sqrt;
        double d5 = (sqrt * d) + (d4 * d2);
        double d6 = (d4 * d) + (sqrt * d2);
        double distanceAtAngle = distanceAtAngle(arrayList, point, arrayList2, d5);
        double distanceAtAngle2 = distanceAtAngle(arrayList, point, arrayList2, d6);
        double d7 = d5;
        double d8 = d6;
        double d9 = d;
        double d10 = d2;
        while (Math.abs(d10 - d9) > d3) {
            if (distanceAtAngle < distanceAtAngle2) {
                double d11 = (sqrt * d9) + (d4 * d8);
                double d12 = distanceAtAngle;
                distanceAtAngle = distanceAtAngle(arrayList, point, arrayList2, d11);
                distanceAtAngle2 = d12;
                d10 = d8;
                d8 = d7;
                d7 = d11;
            } else {
                double d13 = (d4 * d7) + (sqrt * d10);
                distanceAtAngle = distanceAtAngle2;
                distanceAtAngle2 = distanceAtAngle(arrayList, point, arrayList2, d13);
                double d14 = d7;
                d7 = d8;
                d8 = d13;
                d9 = d14;
            }
        }
        return Math.min(distanceAtAngle, distanceAtAngle2);
    }

    private double distanceAtAngle(ArrayList<Point> arrayList, Point point, ArrayList<Point> arrayList2, double d) {
        Point point2 = point;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d2 = 0.0d;
        int i = 0;
        while (i < min) {
            Point point3 = arrayList.get(i);
            double d3 = point3.f1080x;
            int i2 = i;
            double d4 = point2.f1080x;
            double d5 = point3.f1081y;
            int i3 = min;
            double d6 = point2.f1081y;
            double d7 = cos;
            d2 += arrayList2.get(i).distance((((d3 - d4) * cos) - ((d5 - d6) * sin)) + d4, ((d3 - d4) * sin) + ((d5 - d6) * d7) + d6);
            i = i2 + 1;
            point2 = point;
            min = i3;
            cos = d7;
        }
        double size = arrayList.size();
        Double.isNaN(size);
        return d2 / size;
    }

    private ArrayList<Point> fullClone(ArrayList<Point> arrayList) {
        ArrayList<Point> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            Point point = arrayList.get(i);
            arrayList2.add(new Point(point.f1080x, point.f1081y));
        }
        return arrayList2;
    }

    private void translate(ArrayList<Point> arrayList, double d, double d2) {
        for (int i = 0; i < arrayList.size(); i++) {
            Point point = arrayList.get(i);
            point.f1080x += d;
            point.f1081y += d2;
        }
    }

    private void scale(ArrayList<Point> arrayList, double d) {
        RectD boundingBox = boundingBox(arrayList);
        double d2 = boundingBox.right - boundingBox.left;
        double d3 = boundingBox.bottom - boundingBox.top;
        for (int i = 0; i < arrayList.size(); i++) {
            Point point = arrayList.get(i);
            point.f1080x *= d / d2;
            point.f1081y *= d / d3;
        }
    }

    private void rotate(ArrayList<Point> arrayList, double d) {
        rotate(arrayList, d, centroid(arrayList));
    }

    private void rotate(ArrayList<Point> arrayList, double d, Point point) {
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int i = 0;
        while (i < arrayList.size()) {
            Point point2 = arrayList.get(i);
            double d2 = point2.f1080x;
            double d3 = point.f1080x;
            double d4 = point2.f1081y;
            int i2 = i;
            double d5 = point.f1081y;
            point2.f1081y = ((d2 - d3) * sin) + ((d4 - d5) * cos) + d5;
            point2.f1080x = (((d2 - d3) * cos) - ((d4 - d5) * sin)) + d3;
            i = i2 + 1;
        }
    }

    private RectD boundingBox(ArrayList<Point> arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = arrayList.get(0).f1080x;
        double d2 = arrayList.get(0).f1081y;
        RectD rectD = new RectD(d, d2, d, d2);
        for (int i = 1; i < arrayList.size(); i++) {
            Point point = arrayList.get(i);
            rectD.union(point.f1080x, point.f1081y);
        }
        return rectD;
    }

    private Point centroid(ArrayList<Point> arrayList) {
        Point point = new Point(0.0d, 0.0d);
        for (int i = 0; i < arrayList.size(); i++) {
            Point point2 = arrayList.get(i);
            point.f1080x += point2.f1080x;
            point.f1081y += point2.f1081y;
        }
        double d = point.f1080x;
        double size = arrayList.size();
        Double.isNaN(size);
        point.f1080x = d / size;
        double d2 = point.f1081y;
        double size2 = arrayList.size();
        Double.isNaN(size2);
        point.f1081y = d2 / size2;
        return point;
    }

    private double indicativeAngle(ArrayList<Point> arrayList) {
        Point centroid = centroid(arrayList);
        return Math.atan2(centroid.f1081y - arrayList.get(0).f1081y, centroid.f1080x - arrayList.get(0).f1080x);
    }

    private double pathLength(ArrayList<Point> arrayList) {
        double d = 0.0d;
        for (int i = 1; i < arrayList.size(); i++) {
            d += arrayList.get(i - 1).distance(arrayList.get(i));
        }
        return d;
    }

    private int findAnglePoint(ArrayList<Point> arrayList) {
        return findAnglePoint(arrayList, 0);
    }

    private int findAnglePoint(ArrayList<Point> arrayList, int i) {
        int max = Math.max(1, arrayList.size() / 4);
        int i2 = i;
        while (max < arrayList.size() - 1) {
            Point point = arrayList.get(max - 1);
            Point point2 = arrayList.get(max);
            int i3 = max + 1;
            Point point3 = arrayList.get(i3);
            double distance = point.distance(point2);
            double distance2 = point.distance(point3);
            double distance3 = point2.distance(point3);
            if ((Math.acos((((distance * distance) + (distance2 * distance2)) - (distance3 * distance3)) / ((distance * 2.0d) * distance2)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i2 <= 0) {
                    return max;
                }
                i2--;
            }
            max = i3;
        }
        return -1;
    }

    private Shape constructShape(int i, ArrayList<Point> arrayList) {
        int findAnglePoint;
        if (i < 0 || i >= Brush.Shape.SHAPES_LIST.size() || arrayList.size() < 1) {
            return null;
        }
        Shape shape = new Shape(Brush.Shape.make(i));
        if (i == 4) {
            int findAnglePoint2 = findAnglePoint(arrayList);
            if (findAnglePoint2 <= 0) {
                return null;
            }
            if (findAnglePoint2 > 10) {
                findAnglePoint2 -= 2;
            }
            Point point = arrayList.get(findAnglePoint2);
            Point point2 = arrayList.get(findAnglePoint2 / 2);
            Point point3 = arrayList.get(0);
            shape.centerX = (float) point.f1080x;
            shape.centerY = (float) point.f1081y;
            shape.middleX = (float) point2.f1080x;
            shape.middleY = (float) point2.f1081y;
            shape.radiusX = (float) point3.f1080x;
            shape.radiusY = (float) point3.f1081y;
            shape.arrowTriangleLength = 16.0f;
        } else {
            Point centroid = centroid(arrayList);
            shape.centerX = (float) centroid.f1080x;
            shape.centerY = (float) centroid.f1081y;
            RectD boundingBox = boundingBox(arrayList);
            shape.radiusX = ((float) (boundingBox.right - boundingBox.left)) / 2.0f;
            shape.radiusY = ((float) (boundingBox.bottom - boundingBox.top)) / 2.0f;
            if (i == 2 && (findAnglePoint = findAnglePoint(arrayList, 1)) > 0) {
                Point point4 = arrayList.get(findAnglePoint);
                double d = point4.f1081y;
                double d2 = shape.centerY;
                Double.isNaN(d2);
                double d3 = d - d2;
                double d4 = point4.f1080x;
                double d5 = shape.centerX;
                Double.isNaN(d5);
                shape.rotation = (float) Math.atan2(d3, d4 - d5);
            }
        }
        return shape;
    }

    private void showSaveLearnDialog() {
        final ArrayList<Point> arrayList = this.toSave;
        new AlertDialog.Builder(this.context).setTitle("Shape?").setItems(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                ShapeDetector.this.lambda$showSaveLearnDialog$3(arrayList, dialogInterface, i);
            }
        }).show();
        this.toSave = null;
    }

    public void lambda$showSaveLearnDialog$3(ArrayList arrayList, DialogInterface dialogInterface, int i) {
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i2 = 0; i2 < this.templates.size(); i2++) {
                Template template = this.templates.get(i2);
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
                    Point point = template.points.get(i3);
                    sb.append("[");
                    sb.append(Math.round(point.f1080x));
                    sb.append(",");
                    sb.append(Math.round(point.f1081y));
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
            str = str + "," + Math.round(((Point) arrayList.get(i4)).f1080x) + "," + Math.round(((Point) arrayList.get(i4)).f1081y);
        }
        this.preferences.edit().putString("moretemplates", str).apply();
    }
}
