package org.telegram.ui.Components.Paint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.zxing.common.detector.MathUtils;
import java.util.Vector;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Size;
public class Input {
    private static final CubicBezierInterpolator PRESSURE_INTERPOLATOR = new CubicBezierInterpolator(0.0d, 0.5d, 0.0d, 1.0d);
    private ValueAnimator arrowAnimator;
    private boolean beganDrawing;
    private boolean canFill;
    private boolean clearBuffer;
    private final ShapeDetector detector;
    private long drawingStart;
    private ValueAnimator fillAnimator;
    private boolean hasMoved;
    private boolean ignore;
    private Matrix invertMatrix;
    private boolean isFirst;
    private float lastAngle;
    private boolean lastAngleSet;
    private Point lastLocation;
    private double lastRemainder;
    private Point lastThickLocation;
    private long lastVelocityUpdate;
    private int pointsCount;
    private int realPointsCount;
    private RenderView renderView;
    private Brush switchedBrushByStylusFrom;
    private double thicknessCount;
    private double thicknessSum;
    private float velocity;
    private Point[] points = new Point[3];
    private float[] tempPoint = new float[2];
    private final Runnable fillWithCurrentBrush = new Runnable() {
        @Override
        public final void run() {
            Input.this.lambda$new$1();
        }
    };

    public void setShapeHelper(Shape shape) {
        if (shape != null) {
            float currentWeight = this.renderView.getCurrentWeight();
            shape.thickness = currentWeight;
            double d = this.thicknessSum;
            if (d > 0.0d) {
                double d2 = currentWeight;
                Double.isNaN(d2);
                shape.thickness = (float) (d2 * (d / this.thicknessCount));
            }
            if (shape.getType() == 4) {
                shape.arrowTriangleLength *= shape.thickness;
            }
        }
        this.renderView.getPainting().setHelperShape(shape);
    }

    public Input(RenderView renderView) {
        this.renderView = renderView;
        this.detector = new ShapeDetector(renderView.getContext(), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Input.this.setShapeHelper((Shape) obj);
            }
        });
    }

    public void setMatrix(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        this.invertMatrix = matrix2;
        matrix.invert(matrix2);
    }

    private void fill(Brush brush, final boolean z, final Runnable runnable) {
        if (!this.canFill || this.lastLocation == null) {
            return;
        }
        if (brush == null) {
            brush = this.renderView.getCurrentBrush();
        }
        if ((brush instanceof Brush.Elliptical) || (brush instanceof Brush.Neon)) {
            brush = new Brush.Radial();
        }
        final Brush brush2 = brush;
        this.canFill = false;
        if (brush2 instanceof Brush.Eraser) {
            this.renderView.getPainting().hasBlur = false;
        }
        this.renderView.getPainting().clearStroke();
        this.pointsCount = 0;
        this.realPointsCount = 0;
        this.lastAngleSet = false;
        this.beganDrawing = false;
        if (z) {
            this.renderView.onBeganDrawing();
        }
        Size size = this.renderView.getPainting().getSize();
        Point point = this.lastLocation;
        float distance = MathUtils.distance((float) point.x, (float) point.y, 0.0f, 0.0f);
        Point point2 = this.lastLocation;
        float max = Math.max(distance, MathUtils.distance((float) point2.x, (float) point2.y, size.width, 0.0f));
        Point point3 = this.lastLocation;
        float distance2 = MathUtils.distance((float) point3.x, (float) point3.y, 0.0f, size.height);
        Point point4 = this.lastLocation;
        final float max2 = Math.max(max, Math.max(distance2, MathUtils.distance((float) point4.x, (float) point4.y, size.width, size.height))) / 0.84f;
        ValueAnimator valueAnimator = this.arrowAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.arrowAnimator = null;
        }
        ValueAnimator valueAnimator2 = this.fillAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.fillAnimator = null;
        }
        Point point5 = this.lastLocation;
        final Point point6 = new Point(point5.x, point5.y, 1.0d);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.fillAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                Input.this.lambda$fill$0(point6, brush2, max2, valueAnimator3);
            }
        });
        this.fillAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                Input.this.fillAnimator = null;
                Path path = new Path(new Point[]{point6});
                path.setup(Input.this.renderView.getCurrentColor(), max2 * 1.0f, brush2);
                Input.this.renderView.getPainting().commitPath(path, brush2.isEraser() ? -1 : Input.this.renderView.getCurrentColor(), z, null);
                if (z) {
                    Input.this.renderView.onFinishedDrawing(true);
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.fillAnimator.setDuration(450L);
        this.fillAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.fillAnimator.start();
        if (z) {
            BotWebViewVibrationEffect.IMPACT_HEAVY.vibrate();
        }
    }

    public void lambda$fill$0(Point point, Brush brush, float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Path path = new Path(new Point[]{point});
        path.setup(brush.isEraser() ? -1 : this.renderView.getCurrentColor(), floatValue * f, brush);
        this.renderView.getPainting().paintStroke(path, true, true, null);
    }

    public void lambda$new$1() {
        fill(null, true, null);
    }

    public void clear(Runnable runnable) {
        this.lastLocation = new Point(this.renderView.getPainting().getSize().width, 0.0d, 1.0d);
        this.canFill = true;
        fill(new Brush.Eraser(), false, runnable);
    }

    public void ignoreOnce() {
        this.ignore = true;
    }

    public void process(android.view.MotionEvent r21, float r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Paint.Input.process(android.view.MotionEvent, float):void");
    }

    public void lambda$process$2(float f, Point point, float f2, float[] fArr, double d, boolean[] zArr, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        double d2 = f;
        Double.isNaN(d2);
        double cos = Math.cos(d2 - 2.5918139392115793d);
        Double.isNaN(d2);
        double sin = Math.sin(d2 - 2.748893571891069d);
        double d3 = point.x;
        double d4 = f2;
        Double.isNaN(d4);
        double d5 = cos * d4;
        double d6 = fArr[0];
        Double.isNaN(d6);
        double d7 = d3 + (d6 * d5);
        double d8 = point.y;
        Double.isNaN(d4);
        double d9 = sin * d4;
        double d10 = fArr[0];
        Double.isNaN(d10);
        double d11 = point.x;
        double d12 = floatValue;
        Double.isNaN(d12);
        double d13 = d11 + (d5 * d12);
        double d14 = point.y;
        Double.isNaN(d12);
        paintPath(new Path(new Point[]{new Point(d7, d8 + (d10 * d9), d), new Point(d13, d14 + (d9 * d12), d, true)}));
        Double.isNaN(d2);
        double cos2 = Math.cos(d2 + 2.5918139392115793d);
        Double.isNaN(d2);
        double sin2 = Math.sin(d2 + 2.748893571891069d);
        double d15 = point.x;
        Double.isNaN(d4);
        double d16 = cos2 * d4;
        double d17 = fArr[0];
        Double.isNaN(d17);
        double d18 = d15 + (d17 * d16);
        double d19 = point.y;
        Double.isNaN(d4);
        double d20 = d4 * sin2;
        double d21 = fArr[0];
        Double.isNaN(d21);
        double d22 = point.x;
        Double.isNaN(d12);
        double d23 = d22 + (d16 * d12);
        double d24 = point.y;
        Double.isNaN(d12);
        paintPath(new Path(new Point[]{new Point(d18, d19 + (d21 * d20), d), new Point(d23, d24 + (d20 * d12), d, true)}));
        if (!zArr[0] && floatValue > 0.4f) {
            zArr[0] = true;
            BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
        }
        fArr[0] = floatValue;
    }

    public void lambda$process$3() {
        Brush brush = this.switchedBrushByStylusFrom;
        if (brush != null) {
            this.renderView.selectBrush(brush);
            this.switchedBrushByStylusFrom = null;
        }
    }

    private float lerpAngle(float f, float f2, float f3) {
        double d = 1.0f - f3;
        double d2 = f;
        double sin = Math.sin(d2);
        Double.isNaN(d);
        double d3 = f3;
        double d4 = f2;
        double sin2 = Math.sin(d4);
        Double.isNaN(d3);
        double cos = Math.cos(d2);
        Double.isNaN(d);
        double cos2 = Math.cos(d4);
        Double.isNaN(d3);
        return (float) Math.atan2((sin * d) + (sin2 * d3), (d * cos) + (d3 * cos2));
    }

    private void reset() {
        this.pointsCount = 0;
    }

    private void smoothenAndPaintPoints(boolean z, float f) {
        int i = this.pointsCount;
        if (i > 2) {
            Vector vector = new Vector();
            Point[] pointArr = this.points;
            Point point = pointArr[0];
            Point point2 = pointArr[1];
            Point point3 = pointArr[2];
            if (point3 == null || point2 == null || point == null) {
                return;
            }
            Point multiplySum = point2.multiplySum(point, 0.5d);
            Point multiplySum2 = point3.multiplySum(point2, 0.5d);
            int min = (int) Math.min(48.0d, Math.max(Math.floor(multiplySum.getDistanceTo(multiplySum2) / 1), 24.0d));
            float f2 = 1.0f / min;
            int i2 = 0;
            float f3 = 0.0f;
            while (i2 < min) {
                int i3 = i2;
                Point smoothPoint = smoothPoint(multiplySum, multiplySum2, point2, f3, f);
                if (this.isFirst) {
                    smoothPoint.edge = true;
                    this.isFirst = false;
                }
                vector.add(smoothPoint);
                this.thicknessSum += smoothPoint.z;
                this.thicknessCount += 1.0d;
                f3 += f2;
                i2 = i3 + 1;
            }
            if (z) {
                multiplySum2.edge = true;
            }
            vector.add(multiplySum2);
            Point[] pointArr2 = new Point[vector.size()];
            vector.toArray(pointArr2);
            paintPath(new Path(pointArr2));
            Point[] pointArr3 = this.points;
            System.arraycopy(pointArr3, 1, pointArr3, 0, 2);
            if (z) {
                this.pointsCount = 0;
                return;
            } else {
                this.pointsCount = 2;
                return;
            }
        }
        Point[] pointArr4 = new Point[i];
        System.arraycopy(this.points, 0, pointArr4, 0, i);
        paintPath(new Path(pointArr4));
    }

    private Point smoothPoint(Point point, Point point2, Point point3, float f, float f2) {
        float f3 = 1.0f - f;
        double d = f3;
        double pow = Math.pow(d, 2.0d);
        double d2 = 2.0f * f3 * f;
        double d3 = f * f;
        double d4 = point.x;
        double d5 = f3 * f3;
        Double.isNaN(d5);
        double d6 = f;
        Double.isNaN(d6);
        Double.isNaN(d);
        double d7 = (d4 * d5) + (point3.x * 2.0d * d6 * d);
        double d8 = point2.x;
        Double.isNaN(d3);
        double d9 = d7 + (d8 * d3);
        double d10 = point.y;
        Double.isNaN(d5);
        Double.isNaN(d6);
        Double.isNaN(d);
        double d11 = (d10 * d5) + (point3.y * 2.0d * d6 * d);
        double d12 = point2.y;
        Double.isNaN(d3);
        double d13 = point3.z;
        Double.isNaN(d2);
        double d14 = point2.z;
        Double.isNaN(d3);
        double lerp = AndroidUtilities.lerp(f2, 1.0f, androidx.core.math.MathUtils.clamp(this.realPointsCount / 16.0f, 0.0f, 1.0f));
        Double.isNaN(lerp);
        return new Point(d9, d11 + (d12 * d3), (((((point.z * pow) + (d13 * d2)) + (d14 * d3)) - 1.0d) * lerp) + 1.0d);
    }

    private void paintPath(final Path path) {
        path.setup(this.renderView.getCurrentColor(), this.renderView.getCurrentWeight(), this.renderView.getCurrentBrush());
        if (this.clearBuffer) {
            this.lastRemainder = 0.0d;
        }
        path.remainder = this.lastRemainder;
        this.renderView.getPainting().paintStroke(path, this.clearBuffer, false, new Runnable() {
            @Override
            public final void run() {
                Input.this.lambda$paintPath$5(path);
            }
        });
        this.clearBuffer = false;
    }

    public void lambda$paintPath$4(Path path) {
        this.lastRemainder = path.remainder;
    }

    public void lambda$paintPath$5(final Path path) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                Input.this.lambda$paintPath$4(path);
            }
        });
    }
}
