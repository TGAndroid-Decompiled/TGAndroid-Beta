package org.telegram.ui.Components.Paint;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.Crop.CropView$$ExternalSyntheticLambda1;
import org.telegram.ui.bots.BotBiometry$$ExternalSyntheticLambda8;

public final class ShapeDetector {
    public final Context context;
    public final ShapeDetector$$ExternalSyntheticLambda0 detect;
    public final boolean isLearning;
    public final DialogCell$$ExternalSyntheticLambda6 onShapeDetected;
    public final SharedPreferences preferences;
    public boolean shapeDetected;
    public int templatesUsageScore;
    public static final DispatchQueue queue = new DispatchQueue("ShapeDetector");
    public static final double halfDiagonal = Math.sqrt(125000.0d) / 2.0d;
    public final ArrayList points = new ArrayList();
    public final ArrayList templates = new ArrayList();
    public ArrayList toSave = null;
    public final AtomicBoolean busy = new AtomicBoolean(false);
    public final AtomicBoolean scheduled = new AtomicBoolean(false);

    public final class Point {
        public double x;
        public double y;

        public Point(double d, double d2) {
            this.x = d;
            this.y = d2;
        }

        public final double distance(double d, double d2) {
            return Math.sqrt(Math.pow(d2 - this.y, 2.0d) + Math.pow(d - this.x, 2.0d));
        }
    }

    public final class RectD {
        public double bottom;
        public double left;
        public double right;
        public double top;

        public final String toString() {
            return "RectD{left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
        }
    }

    public final class Template {
        public ArrayList points = new ArrayList();
        public int score;
        public int shapeType;
    }

    public ShapeDetector(Context context, DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6) {
        final int i = 0;
        this.detect = new Runnable(this) {
            public final ShapeDetector f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                Shape shape;
                int iFindAnglePoint;
                double d;
                int i2;
                char c;
                String string;
                int i3;
                switch (i) {
                    case 0:
                        ShapeDetector shapeDetector = this.f$0;
                        if (shapeDetector.busy.get()) {
                            return;
                        }
                        shapeDetector.scheduled.set(false);
                        shapeDetector.busy.set(true);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (shapeDetector) {
                            try {
                                if (shapeDetector.points.size() < 8) {
                                    shapeDetector.busy.set(false);
                                    return;
                                }
                                ArrayList arrayList = shapeDetector.points;
                                ArrayList arrayList2 = new ArrayList();
                                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                    ShapeDetector.Point point = (ShapeDetector.Point) arrayList.get(i4);
                                    arrayList2.add(new ShapeDetector.Point(point.x, point.y));
                                }
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add((ShapeDetector.Point) arrayList2.get(0));
                                double dDistance = 0.0d;
                                for (int i5 = 1; i5 < arrayList2.size(); i5++) {
                                    ShapeDetector.Point point2 = (ShapeDetector.Point) arrayList2.get(i5 - 1);
                                    ShapeDetector.Point point3 = (ShapeDetector.Point) arrayList2.get(i5);
                                    point2.getClass();
                                    dDistance += point2.distance(point3.x, point3.y);
                                }
                                double d2 = dDistance / ((double) 47);
                                int i6 = 1;
                                double d3 = 0.0d;
                                while (i6 < arrayList2.size()) {
                                    int i7 = i6 - 1;
                                    ShapeDetector.Point point4 = (ShapeDetector.Point) arrayList2.get(i7);
                                    ShapeDetector.Point point5 = (ShapeDetector.Point) arrayList2.get(i6);
                                    point4.getClass();
                                    int i8 = i6;
                                    long j = jCurrentTimeMillis;
                                    double dDistance2 = point4.distance(point5.x, point5.y);
                                    double d4 = d3 + dDistance2;
                                    if (d4 >= d2) {
                                        double d5 = (d2 - d3) / dDistance2;
                                        i2 = i8;
                                        ShapeDetector.Point point6 = new ShapeDetector.Point(((((ShapeDetector.Point) arrayList2.get(i2)).x - ((ShapeDetector.Point) arrayList2.get(i7)).x) * d5) + ((ShapeDetector.Point) arrayList2.get(i7)).x, ((((ShapeDetector.Point) arrayList2.get(i2)).y - ((ShapeDetector.Point) arrayList2.get(i7)).y) * d5) + ((ShapeDetector.Point) arrayList2.get(i7)).y);
                                        arrayList3.add(point6);
                                        arrayList2.add(i2, point6);
                                        d3 = 0.0d;
                                    } else {
                                        i2 = i8;
                                        d3 = d4;
                                    }
                                    i6 = i2 + 1;
                                    jCurrentTimeMillis = j;
                                    d2 = d2;
                                }
                                long j2 = jCurrentTimeMillis;
                                if (arrayList3.size() == 47) {
                                    arrayList3.add((ShapeDetector.Point) Fragment$$ExternalSyntheticOutline0.m(1, arrayList2));
                                }
                                ArrayList arrayList4 = new ArrayList();
                                for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                                    ShapeDetector.Point point7 = (ShapeDetector.Point) arrayList3.get(i9);
                                    arrayList4.add(new ShapeDetector.Point(point7.x, point7.y));
                                }
                                ShapeDetector.Point pointCentroid = ShapeDetector.centroid(arrayList4);
                                double dAtan2 = Math.atan2(pointCentroid.y - ((ShapeDetector.Point) arrayList4.get(0)).y, pointCentroid.x - ((ShapeDetector.Point) arrayList4.get(0)).x);
                                ShapeDetector.Point pointCentroid2 = ShapeDetector.centroid(arrayList4);
                                double dCos = Math.cos(dAtan2);
                                double dSin = Math.sin(dAtan2);
                                int i10 = 0;
                                while (i10 < arrayList4.size()) {
                                    ShapeDetector.Point point8 = (ShapeDetector.Point) arrayList4.get(i10);
                                    double d6 = point8.x;
                                    double d7 = pointCentroid2.x;
                                    double d8 = d6 - d7;
                                    double d9 = dSin;
                                    double d10 = point8.y;
                                    double d11 = pointCentroid2.y;
                                    double d12 = d10 - d11;
                                    point8.y = (d12 * dCos) + (d8 * d9) + d11;
                                    point8.x = d7 + ((d8 * dCos) - (d12 * d9));
                                    i10++;
                                    dSin = d9;
                                }
                                ShapeDetector.Point pointCentroid3 = ShapeDetector.centroid(arrayList4);
                                double d13 = -pointCentroid3.x;
                                double d14 = -pointCentroid3.y;
                                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                    ShapeDetector.Point point9 = (ShapeDetector.Point) arrayList4.get(i11);
                                    point9.x += d13;
                                    point9.y += d14;
                                }
                                ShapeDetector.RectD rectDBoundingBox = ShapeDetector.boundingBox(arrayList4);
                                double d15 = rectDBoundingBox.right - rectDBoundingBox.left;
                                double d16 = rectDBoundingBox.bottom - rectDBoundingBox.top;
                                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                                    ShapeDetector.Point point10 = (ShapeDetector.Point) arrayList4.get(i12);
                                    point10.x = (250.0d / d15) * point10.x;
                                    point10.y = (250.0d / d16) * point10.y;
                                }
                                ShapeDetector.Point pointCentroid4 = ShapeDetector.centroid(arrayList4);
                                double d17 = Double.MAX_VALUE;
                                int i13 = -1;
                                int i14 = -1;
                                for (int i15 = 0; i15 < shapeDetector.templates.size(); i15++) {
                                    ArrayList arrayList5 = ((ShapeDetector.Template) shapeDetector.templates.get(i15)).points;
                                    double dSqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                    double d18 = -1.5707963267948966d;
                                    double d19 = 1.0d - dSqrt;
                                    double d20 = 1.5707963267948966d;
                                    double d21 = d17;
                                    double d22 = (d19 * 1.5707963267948966d) + (dSqrt * (-1.5707963267948966d));
                                    double dDistanceAtAngle = ShapeDetector.distanceAtAngle(arrayList4, pointCentroid4, arrayList5, d22);
                                    double d23 = d22;
                                    double d24 = (dSqrt * 1.5707963267948966d) + (d19 * (-1.5707963267948966d));
                                    double dDistanceAtAngle2 = ShapeDetector.distanceAtAngle(arrayList4, pointCentroid4, arrayList5, d24);
                                    double d25 = d24;
                                    double d26 = dDistanceAtAngle;
                                    double d27 = dDistanceAtAngle2;
                                    while (Math.abs(d20 - d18) > 0.06981317007977318d) {
                                        if (d26 < d27) {
                                            double d28 = (d19 * d25) + (dSqrt * d18);
                                            double dDistanceAtAngle3 = ShapeDetector.distanceAtAngle(arrayList4, pointCentroid4, arrayList5, d28);
                                            d = d28;
                                            d27 = d26;
                                            d26 = dDistanceAtAngle3;
                                            d20 = d25;
                                            d25 = d23;
                                        } else {
                                            double d29 = (dSqrt * d20) + (d19 * d23);
                                            double dDistanceAtAngle4 = ShapeDetector.distanceAtAngle(arrayList4, pointCentroid4, arrayList5, d29);
                                            d = d25;
                                            d25 = d29;
                                            d26 = d27;
                                            d27 = dDistanceAtAngle4;
                                            d18 = d23;
                                        }
                                        d23 = d;
                                    }
                                    double dMin = Math.min(d26, d27);
                                    if (dMin < d21) {
                                        i13 = ((ShapeDetector.Template) shapeDetector.templates.get(i15)).shapeType;
                                        d17 = dMin;
                                        i14 = i15;
                                    } else {
                                        d17 = d21;
                                    }
                                }
                                int i16 = 1.0d - (d17 / ShapeDetector.halfDiagonal) < 0.8d ? -1 : i13;
                                if (i16 >= 0) {
                                    List list = Brush.Shape.SHAPES_LIST;
                                    if (i16 >= list.size() || arrayList3.size() < 1) {
                                        shape = null;
                                    } else {
                                        if (i16 < 0 || i16 > list.size()) {
                                            StringBuilder sb = new StringBuilder("Shape type must be in range from 0 to ");
                                            sb.append(list.size() - 1);
                                            sb.append(", but got ");
                                            sb.append(i16);
                                            throw new IndexOutOfBoundsException(sb.toString());
                                        }
                                        shape = new Shape((Brush.Shape) list.get(i16));
                                        if (i16 == 4) {
                                            int iFindAnglePoint2 = ShapeDetector.findAnglePoint(0, arrayList3);
                                            if (iFindAnglePoint2 > 0) {
                                                if (iFindAnglePoint2 > 10) {
                                                    iFindAnglePoint2 -= 2;
                                                }
                                                ShapeDetector.Point point11 = (ShapeDetector.Point) arrayList3.get(iFindAnglePoint2);
                                                ShapeDetector.Point point12 = (ShapeDetector.Point) arrayList3.get(iFindAnglePoint2 / 2);
                                                ShapeDetector.Point point13 = (ShapeDetector.Point) arrayList3.get(0);
                                                shape.centerX = (float) point11.x;
                                                shape.centerY = (float) point11.y;
                                                shape.middleX = (float) point12.x;
                                                shape.middleY = (float) point12.y;
                                                shape.radiusX = (float) point13.x;
                                                shape.radiusY = (float) point13.y;
                                                shape.arrowTriangleLength = 16.0f;
                                            } else {
                                                shape = null;
                                            }
                                        } else {
                                            ShapeDetector.Point pointCentroid5 = ShapeDetector.centroid(arrayList3);
                                            shape.centerX = (float) pointCentroid5.x;
                                            shape.centerY = (float) pointCentroid5.y;
                                            ShapeDetector.RectD rectDBoundingBox2 = ShapeDetector.boundingBox(arrayList3);
                                            shape.radiusX = ((float) (rectDBoundingBox2.right - rectDBoundingBox2.left)) / 2.0f;
                                            shape.radiusY = ((float) (rectDBoundingBox2.bottom - rectDBoundingBox2.top)) / 2.0f;
                                            if (i16 == 2 && (iFindAnglePoint = ShapeDetector.findAnglePoint(1, arrayList3)) > 0) {
                                                ShapeDetector.Point point14 = (ShapeDetector.Point) arrayList3.get(iFindAnglePoint);
                                                shape.rotation = (float) Math.atan2(point14.y - ((double) shape.centerY), point14.x - ((double) shape.centerX));
                                            }
                                        }
                                    }
                                } else {
                                    shape = null;
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    StringBuilder sb2 = new StringBuilder("took ");
                                    sb2.append(System.currentTimeMillis() - j2);
                                    sb2.append("ms to ");
                                    sb2.append(shape != null ? "" : "not ");
                                    sb2.append("detect a shape");
                                    sb2.append(shape != null ? " (template#" + i14 + " shape#" + i16 + ")" : "");
                                    Log.i("shapedetector", sb2.toString());
                                }
                                AndroidUtilities.runOnUIThread(new BotBiometry$$ExternalSyntheticLambda8(shapeDetector, shape, i14, arrayList4));
                                shapeDetector.busy.set(false);
                                return;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    default:
                        ShapeDetector shapeDetector2 = this.f$0;
                        shapeDetector2.getClass();
                        try {
                            InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c = 0;
                                if (inputStreamOpen.available() > 5) {
                                    ShapeDetector.Template template = new ShapeDetector.Template();
                                    template.shapeType = inputStreamOpen.read();
                                    int i17 = inputStreamOpen.read();
                                    int i18 = inputStreamOpen.read() - 64;
                                    int i19 = inputStreamOpen.read() - 64;
                                    if (inputStreamOpen.available() >= i17 * 2) {
                                        for (int i20 = 0; i20 < i17; i20++) {
                                            template.points.add(new ShapeDetector.Point((inputStreamOpen.read() - i18) - 127, (inputStreamOpen.read() - i19) - 127));
                                        }
                                        template.score = shapeDetector2.preferences.getInt("score" + shapeDetector2.templates.size(), 0);
                                        shapeDetector2.templates.add(template);
                                    }
                                }
                            }
                            if (shapeDetector2.isLearning && (string = shapeDetector2.preferences.getString("moretemplates", null)) != null) {
                                String[] strArrSplit = string.split("\\|");
                                int size = shapeDetector2.templates.size();
                                int i21 = 0;
                                while (i21 < strArrSplit.length) {
                                    ShapeDetector.Template template2 = new ShapeDetector.Template();
                                    String[] strArrSplit2 = strArrSplit[i21].split(",");
                                    int i22 = 1;
                                    if (strArrSplit2.length <= 1) {
                                        i3 = i21;
                                    } else {
                                        template2.shapeType = Integer.parseInt(strArrSplit2[c]);
                                        while (i22 < strArrSplit2.length) {
                                            template2.points.add(new ShapeDetector.Point(Double.parseDouble(strArrSplit2[i22]), Double.parseDouble(strArrSplit2[i22 + 1])));
                                            i22 += 2;
                                            i21 = i21;
                                        }
                                        i3 = i21;
                                        template2.score = shapeDetector2.preferences.getInt("score" + (size + i3), 0);
                                        shapeDetector2.templates.add(template2);
                                    }
                                    i21 = i3 + 1;
                                    c = 0;
                                }
                            }
                            inputStreamOpen.close();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        };
        this.context = context;
        this.onShapeDetected = dialogCell$$ExternalSyntheticLambda6;
        SharedPreferences sharedPreferences = context.getSharedPreferences("shapedetector_conf", 0);
        this.preferences = sharedPreferences;
        this.isLearning = sharedPreferences.getBoolean("learning", false);
        this.templatesUsageScore = sharedPreferences.getInt("scoreall", 0);
        final int i2 = 1;
        queue.postRunnable(new Runnable(this) {
            public final ShapeDetector f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                Shape shape;
                int iFindAnglePoint;
                double d;
                int i3;
                char c;
                String string;
                int i4;
                switch (i2) {
                    case 0:
                        ShapeDetector shapeDetector = this.f$0;
                        if (shapeDetector.busy.get()) {
                            return;
                        }
                        shapeDetector.scheduled.set(false);
                        shapeDetector.busy.set(true);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (shapeDetector) {
                            try {
                                if (shapeDetector.points.size() < 8) {
                                    shapeDetector.busy.set(false);
                                    return;
                                }
                                ArrayList arrayList = shapeDetector.points;
                                ArrayList arrayList2 = new ArrayList();
                                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                    ShapeDetector.Point point = (ShapeDetector.Point) arrayList.get(i5);
                                    arrayList2.add(new ShapeDetector.Point(point.x, point.y));
                                }
                                ArrayList arrayList3 = new ArrayList();
                                arrayList3.add((ShapeDetector.Point) arrayList2.get(0));
                                double dDistance = 0.0d;
                                for (int i6 = 1; i6 < arrayList2.size(); i6++) {
                                    ShapeDetector.Point point2 = (ShapeDetector.Point) arrayList2.get(i6 - 1);
                                    ShapeDetector.Point point3 = (ShapeDetector.Point) arrayList2.get(i6);
                                    point2.getClass();
                                    dDistance += point2.distance(point3.x, point3.y);
                                }
                                double d2 = dDistance / ((double) 47);
                                int i7 = 1;
                                double d3 = 0.0d;
                                while (i7 < arrayList2.size()) {
                                    int i8 = i7 - 1;
                                    ShapeDetector.Point point4 = (ShapeDetector.Point) arrayList2.get(i8);
                                    ShapeDetector.Point point5 = (ShapeDetector.Point) arrayList2.get(i7);
                                    point4.getClass();
                                    int i9 = i7;
                                    long j = jCurrentTimeMillis;
                                    double dDistance2 = point4.distance(point5.x, point5.y);
                                    double d4 = d3 + dDistance2;
                                    if (d4 >= d2) {
                                        double d5 = (d2 - d3) / dDistance2;
                                        i3 = i9;
                                        ShapeDetector.Point point6 = new ShapeDetector.Point(((((ShapeDetector.Point) arrayList2.get(i3)).x - ((ShapeDetector.Point) arrayList2.get(i8)).x) * d5) + ((ShapeDetector.Point) arrayList2.get(i8)).x, ((((ShapeDetector.Point) arrayList2.get(i3)).y - ((ShapeDetector.Point) arrayList2.get(i8)).y) * d5) + ((ShapeDetector.Point) arrayList2.get(i8)).y);
                                        arrayList3.add(point6);
                                        arrayList2.add(i3, point6);
                                        d3 = 0.0d;
                                    } else {
                                        i3 = i9;
                                        d3 = d4;
                                    }
                                    i7 = i3 + 1;
                                    jCurrentTimeMillis = j;
                                    d2 = d2;
                                }
                                long j2 = jCurrentTimeMillis;
                                if (arrayList3.size() == 47) {
                                    arrayList3.add((ShapeDetector.Point) Fragment$$ExternalSyntheticOutline0.m(1, arrayList2));
                                }
                                ArrayList arrayList4 = new ArrayList();
                                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                                    ShapeDetector.Point point7 = (ShapeDetector.Point) arrayList3.get(i10);
                                    arrayList4.add(new ShapeDetector.Point(point7.x, point7.y));
                                }
                                ShapeDetector.Point pointCentroid = ShapeDetector.centroid(arrayList4);
                                double dAtan2 = Math.atan2(pointCentroid.y - ((ShapeDetector.Point) arrayList4.get(0)).y, pointCentroid.x - ((ShapeDetector.Point) arrayList4.get(0)).x);
                                ShapeDetector.Point pointCentroid2 = ShapeDetector.centroid(arrayList4);
                                double dCos = Math.cos(dAtan2);
                                double dSin = Math.sin(dAtan2);
                                int i11 = 0;
                                while (i11 < arrayList4.size()) {
                                    ShapeDetector.Point point8 = (ShapeDetector.Point) arrayList4.get(i11);
                                    double d6 = point8.x;
                                    double d7 = pointCentroid2.x;
                                    double d8 = d6 - d7;
                                    double d9 = dSin;
                                    double d10 = point8.y;
                                    double d11 = pointCentroid2.y;
                                    double d12 = d10 - d11;
                                    point8.y = (d12 * dCos) + (d8 * d9) + d11;
                                    point8.x = d7 + ((d8 * dCos) - (d12 * d9));
                                    i11++;
                                    dSin = d9;
                                }
                                ShapeDetector.Point pointCentroid3 = ShapeDetector.centroid(arrayList4);
                                double d13 = -pointCentroid3.x;
                                double d14 = -pointCentroid3.y;
                                for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                                    ShapeDetector.Point point9 = (ShapeDetector.Point) arrayList4.get(i12);
                                    point9.x += d13;
                                    point9.y += d14;
                                }
                                ShapeDetector.RectD rectDBoundingBox = ShapeDetector.boundingBox(arrayList4);
                                double d15 = rectDBoundingBox.right - rectDBoundingBox.left;
                                double d16 = rectDBoundingBox.bottom - rectDBoundingBox.top;
                                for (int i13 = 0; i13 < arrayList4.size(); i13++) {
                                    ShapeDetector.Point point10 = (ShapeDetector.Point) arrayList4.get(i13);
                                    point10.x = (250.0d / d15) * point10.x;
                                    point10.y = (250.0d / d16) * point10.y;
                                }
                                ShapeDetector.Point pointCentroid4 = ShapeDetector.centroid(arrayList4);
                                double d17 = Double.MAX_VALUE;
                                int i14 = -1;
                                int i15 = -1;
                                for (int i16 = 0; i16 < shapeDetector.templates.size(); i16++) {
                                    ArrayList arrayList5 = ((ShapeDetector.Template) shapeDetector.templates.get(i16)).points;
                                    double dSqrt = (Math.sqrt(5.0d) - 1.0d) * 0.5d;
                                    double d18 = -1.5707963267948966d;
                                    double d19 = 1.0d - dSqrt;
                                    double d20 = 1.5707963267948966d;
                                    double d21 = d17;
                                    double d22 = (d19 * 1.5707963267948966d) + (dSqrt * (-1.5707963267948966d));
                                    double dDistanceAtAngle = ShapeDetector.distanceAtAngle(arrayList4, pointCentroid4, arrayList5, d22);
                                    double d23 = d22;
                                    double d24 = (dSqrt * 1.5707963267948966d) + (d19 * (-1.5707963267948966d));
                                    double dDistanceAtAngle2 = ShapeDetector.distanceAtAngle(arrayList4, pointCentroid4, arrayList5, d24);
                                    double d25 = d24;
                                    double d26 = dDistanceAtAngle;
                                    double d27 = dDistanceAtAngle2;
                                    while (Math.abs(d20 - d18) > 0.06981317007977318d) {
                                        if (d26 < d27) {
                                            double d28 = (d19 * d25) + (dSqrt * d18);
                                            double dDistanceAtAngle3 = ShapeDetector.distanceAtAngle(arrayList4, pointCentroid4, arrayList5, d28);
                                            d = d28;
                                            d27 = d26;
                                            d26 = dDistanceAtAngle3;
                                            d20 = d25;
                                            d25 = d23;
                                        } else {
                                            double d29 = (dSqrt * d20) + (d19 * d23);
                                            double dDistanceAtAngle4 = ShapeDetector.distanceAtAngle(arrayList4, pointCentroid4, arrayList5, d29);
                                            d = d25;
                                            d25 = d29;
                                            d26 = d27;
                                            d27 = dDistanceAtAngle4;
                                            d18 = d23;
                                        }
                                        d23 = d;
                                    }
                                    double dMin = Math.min(d26, d27);
                                    if (dMin < d21) {
                                        i14 = ((ShapeDetector.Template) shapeDetector.templates.get(i16)).shapeType;
                                        d17 = dMin;
                                        i15 = i16;
                                    } else {
                                        d17 = d21;
                                    }
                                }
                                int i17 = 1.0d - (d17 / ShapeDetector.halfDiagonal) < 0.8d ? -1 : i14;
                                if (i17 >= 0) {
                                    List list = Brush.Shape.SHAPES_LIST;
                                    if (i17 >= list.size() || arrayList3.size() < 1) {
                                        shape = null;
                                    } else {
                                        if (i17 < 0 || i17 > list.size()) {
                                            StringBuilder sb = new StringBuilder("Shape type must be in range from 0 to ");
                                            sb.append(list.size() - 1);
                                            sb.append(", but got ");
                                            sb.append(i17);
                                            throw new IndexOutOfBoundsException(sb.toString());
                                        }
                                        shape = new Shape((Brush.Shape) list.get(i17));
                                        if (i17 == 4) {
                                            int iFindAnglePoint2 = ShapeDetector.findAnglePoint(0, arrayList3);
                                            if (iFindAnglePoint2 > 0) {
                                                if (iFindAnglePoint2 > 10) {
                                                    iFindAnglePoint2 -= 2;
                                                }
                                                ShapeDetector.Point point11 = (ShapeDetector.Point) arrayList3.get(iFindAnglePoint2);
                                                ShapeDetector.Point point12 = (ShapeDetector.Point) arrayList3.get(iFindAnglePoint2 / 2);
                                                ShapeDetector.Point point13 = (ShapeDetector.Point) arrayList3.get(0);
                                                shape.centerX = (float) point11.x;
                                                shape.centerY = (float) point11.y;
                                                shape.middleX = (float) point12.x;
                                                shape.middleY = (float) point12.y;
                                                shape.radiusX = (float) point13.x;
                                                shape.radiusY = (float) point13.y;
                                                shape.arrowTriangleLength = 16.0f;
                                            } else {
                                                shape = null;
                                            }
                                        } else {
                                            ShapeDetector.Point pointCentroid5 = ShapeDetector.centroid(arrayList3);
                                            shape.centerX = (float) pointCentroid5.x;
                                            shape.centerY = (float) pointCentroid5.y;
                                            ShapeDetector.RectD rectDBoundingBox2 = ShapeDetector.boundingBox(arrayList3);
                                            shape.radiusX = ((float) (rectDBoundingBox2.right - rectDBoundingBox2.left)) / 2.0f;
                                            shape.radiusY = ((float) (rectDBoundingBox2.bottom - rectDBoundingBox2.top)) / 2.0f;
                                            if (i17 == 2 && (iFindAnglePoint = ShapeDetector.findAnglePoint(1, arrayList3)) > 0) {
                                                ShapeDetector.Point point14 = (ShapeDetector.Point) arrayList3.get(iFindAnglePoint);
                                                shape.rotation = (float) Math.atan2(point14.y - ((double) shape.centerY), point14.x - ((double) shape.centerX));
                                            }
                                        }
                                    }
                                } else {
                                    shape = null;
                                }
                                if (BuildVars.LOGS_ENABLED) {
                                    StringBuilder sb2 = new StringBuilder("took ");
                                    sb2.append(System.currentTimeMillis() - j2);
                                    sb2.append("ms to ");
                                    sb2.append(shape != null ? "" : "not ");
                                    sb2.append("detect a shape");
                                    sb2.append(shape != null ? " (template#" + i15 + " shape#" + i17 + ")" : "");
                                    Log.i("shapedetector", sb2.toString());
                                }
                                AndroidUtilities.runOnUIThread(new BotBiometry$$ExternalSyntheticLambda8(shapeDetector, shape, i15, arrayList4));
                                shapeDetector.busy.set(false);
                                return;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    default:
                        ShapeDetector shapeDetector2 = this.f$0;
                        shapeDetector2.getClass();
                        try {
                            InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("shapes.dat");
                            while (true) {
                                c = 0;
                                if (inputStreamOpen.available() > 5) {
                                    ShapeDetector.Template template = new ShapeDetector.Template();
                                    template.shapeType = inputStreamOpen.read();
                                    int i18 = inputStreamOpen.read();
                                    int i19 = inputStreamOpen.read() - 64;
                                    int i110 = inputStreamOpen.read() - 64;
                                    if (inputStreamOpen.available() >= i18 * 2) {
                                        for (int i20 = 0; i20 < i18; i20++) {
                                            template.points.add(new ShapeDetector.Point((inputStreamOpen.read() - i19) - 127, (inputStreamOpen.read() - i110) - 127));
                                        }
                                        template.score = shapeDetector2.preferences.getInt("score" + shapeDetector2.templates.size(), 0);
                                        shapeDetector2.templates.add(template);
                                    }
                                }
                            }
                            if (shapeDetector2.isLearning && (string = shapeDetector2.preferences.getString("moretemplates", null)) != null) {
                                String[] strArrSplit = string.split("\\|");
                                int size = shapeDetector2.templates.size();
                                int i21 = 0;
                                while (i21 < strArrSplit.length) {
                                    ShapeDetector.Template template2 = new ShapeDetector.Template();
                                    String[] strArrSplit2 = strArrSplit[i21].split(",");
                                    int i22 = 1;
                                    if (strArrSplit2.length <= 1) {
                                        i4 = i21;
                                    } else {
                                        template2.shapeType = Integer.parseInt(strArrSplit2[c]);
                                        while (i22 < strArrSplit2.length) {
                                            template2.points.add(new ShapeDetector.Point(Double.parseDouble(strArrSplit2[i22]), Double.parseDouble(strArrSplit2[i22 + 1])));
                                            i22 += 2;
                                            i21 = i21;
                                        }
                                        i4 = i21;
                                        template2.score = shapeDetector2.preferences.getInt("score" + (size + i4), 0);
                                        shapeDetector2.templates.add(template2);
                                    }
                                    i21 = i4 + 1;
                                    c = 0;
                                }
                            }
                            inputStreamOpen.close();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                }
            }
        });
    }

    public static RectD boundingBox(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((Point) arrayList.get(0)).x;
        double d2 = ((Point) arrayList.get(0)).y;
        RectD rectD = new RectD();
        rectD.left = d;
        rectD.top = d2;
        rectD.right = d;
        rectD.bottom = d2;
        for (int i = 1; i < arrayList.size(); i++) {
            Point point = (Point) arrayList.get(i);
            double d3 = point.x;
            double d4 = point.y;
            if (rectD.left >= d3) {
                rectD.left = d3;
            }
            if (rectD.top >= d4) {
                rectD.top = d4;
            }
            if (rectD.right <= d3) {
                rectD.right = d3;
            }
            if (rectD.bottom <= d4) {
                rectD.bottom = d4;
            }
        }
        return rectD;
    }

    public static Point centroid(ArrayList arrayList) {
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

    public static double distanceAtAngle(ArrayList arrayList, Point point, ArrayList arrayList2, double d) {
        double dCos = Math.cos(d);
        double dSin = Math.sin(d);
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        double dDistance = 0.0d;
        int i = 0;
        while (i < iMin) {
            Point point2 = (Point) arrayList.get(i);
            Point point3 = (Point) arrayList2.get(i);
            double d2 = point2.x;
            double d3 = dCos;
            double d4 = point.x;
            double d5 = d2 - d4;
            double d6 = point2.y;
            double d7 = point.y;
            double d8 = d6 - d7;
            dDistance += point3.distance(((d5 * d3) - (d8 * dSin)) + d4, (d8 * d3) + (d5 * dSin) + d7);
            i++;
            dCos = d3;
        }
        return dDistance / ((double) arrayList.size());
    }

    public static int findAnglePoint(int i, ArrayList arrayList) {
        int iMax = Math.max(1, arrayList.size() / 4);
        while (iMax < arrayList.size() - 1) {
            Point point = (Point) arrayList.get(iMax - 1);
            Point point2 = (Point) arrayList.get(iMax);
            int i2 = iMax + 1;
            Point point3 = (Point) arrayList.get(i2);
            point.getClass();
            double dDistance = point.distance(point2.x, point2.y);
            double dDistance2 = point.distance(point3.x, point3.y);
            double dDistance3 = point2.distance(point3.x, point3.y);
            if ((Math.acos((((dDistance2 * dDistance2) + (dDistance * dDistance)) - (dDistance3 * dDistance3)) / ((dDistance * 2.0d) * dDistance2)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i <= 0) {
                    return iMax;
                }
                i--;
            }
            iMax = i2;
        }
        return -1;
    }

    public final void clear() {
        ArrayList arrayList;
        synchronized (this) {
            this.points.clear();
        }
        queue.cancelRunnable(this.detect);
        this.scheduled.set(false);
        this.shapeDetected = false;
        if (!this.isLearning || (arrayList = this.toSave) == null) {
            return;
        }
        new AlertDialog.Builder(this.context, 0, null).setTitle("Shape?").setItems(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new CropView$$ExternalSyntheticLambda1(1, this, arrayList)).show();
        this.toSave = null;
    }
}
