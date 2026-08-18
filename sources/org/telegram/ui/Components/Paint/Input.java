package org.telegram.ui.Components.Paint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.zxing.common.detector.MathUtils;
import java.util.List;
import java.util.Vector;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.CubicBezierInterpolator;
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
    private float lastScale;
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
            this.f$0.lambda$new$1();
        }
    };

    public void setShapeHelper(Shape shape) {
        if (shape != null) {
            float currentWeight = this.renderView.getCurrentWeight();
            shape.thickness = currentWeight;
            double d = this.thicknessSum;
            if (d > 0.0d) {
                shape.thickness = (float) (((double) currentWeight) * (d / this.thicknessCount));
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
                this.f$0.setShapeHelper((Shape) obj);
            }
        });
    }

    public void setMatrix(Matrix matrix) {
        Matrix matrix2 = new Matrix();
        this.invertMatrix = matrix2;
        matrix.invert(matrix2);
    }

    private void fill(Brush brush, final boolean z, final Runnable runnable) {
        if (!this.canFill || this.renderView.getPainting().masking || this.lastLocation == null) {
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
        float fDistance = MathUtils.distance((float) point.x, (float) point.y, 0.0f, 0.0f);
        Point point2 = this.lastLocation;
        float fMax = Math.max(fDistance, MathUtils.distance((float) point2.x, (float) point2.y, size.width, 0.0f));
        Point point3 = this.lastLocation;
        float fDistance2 = MathUtils.distance((float) point3.x, (float) point3.y, 0.0f, size.height);
        Point point4 = this.lastLocation;
        final float fMax2 = Math.max(fMax, Math.max(fDistance2, MathUtils.distance((float) point4.x, (float) point4.y, size.width, size.height))) / 0.84f;
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
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.fillAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                this.f$0.lambda$fill$0(point6, brush2, fMax2, valueAnimator3);
            }
        });
        this.fillAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                Input.this.fillAnimator = null;
                Path path = new Path(new Point[]{point6});
                path.setup(Input.this.renderView.getCurrentColor(), fMax2 * 1.0f, brush2);
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
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Path path = new Path(new Point[]{point});
        path.setup(brush.isEraser() ? -1 : this.renderView.getCurrentColor(), fFloatValue * f, brush);
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

    public void process(MotionEvent motionEvent, float f) {
        boolean z;
        if (this.fillAnimator == null && this.arrowAnimator == null) {
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX();
            float height = this.renderView.getHeight() - motionEvent.getY();
            float[] fArr = this.tempPoint;
            fArr[0] = x;
            fArr[1] = height;
            this.invertMatrix.mapPoints(fArr);
            float fCurrentTimeMillis = System.currentTimeMillis() - this.lastVelocityUpdate;
            this.velocity = androidx.core.math.MathUtils.clamp(this.velocity - (fCurrentTimeMillis / 125.0f), 0.6f, 1.0f);
            if (this.renderView.getCurrentBrush() != null && (this.renderView.getCurrentBrush() instanceof Brush.Arrow)) {
                this.velocity = 1.0f - this.velocity;
            }
            this.lastScale = f;
            this.lastVelocityUpdate = System.currentTimeMillis();
            float fLerp = this.velocity;
            if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
                fLerp = Math.max(0.1f, PRESSURE_INTERPOLATOR.getInterpolation(motionEvent.getPressure()));
                if ((motionEvent.getButtonState() & 32) == 32) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (this.renderView.getCurrentBrush() != null) {
                fLerp = ((fLerp - 1.0f) * AndroidUtilities.lerp(this.renderView.getCurrentBrush().getSmoothThicknessRate(), 1.0f, androidx.core.math.MathUtils.clamp(this.realPointsCount / 16.0f, 0.0f, 1.0f))) + 1.0f;
            }
            float[] fArr2 = this.tempPoint;
            Point point = new Point(fArr2[0], fArr2[1], fLerp);
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    if (this.ignore) {
                        this.ignore = false;
                        return;
                    }
                    this.canFill = false;
                    this.detector.clear();
                    AndroidUtilities.cancelRunOnUIThread(this.fillWithCurrentBrush);
                    if (!this.renderView.getPainting().applyHelperShape()) {
                        if (!this.hasMoved) {
                            if (this.renderView.shouldDraw()) {
                                point.edge = true;
                                paintPath(new Path(point));
                            }
                            reset();
                        } else if (this.pointsCount > 0) {
                            smoothenAndPaintPoints(true, this.renderView.getCurrentBrush().getSmoothThicknessRate());
                            if (this.renderView.getCurrentBrush() instanceof Brush.Arrow) {
                                final float f2 = this.lastAngle;
                                final Point point2 = this.points[this.pointsCount - 1];
                                Point point3 = this.lastThickLocation;
                                final double d = point3 == null ? point.z : point3.z;
                                final float currentWeight = 12.0f * this.renderView.getCurrentWeight() * ((float) d);
                                ValueAnimator valueAnimator = this.arrowAnimator;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                }
                                final float[] fArr3 = new float[1];
                                final boolean[] zArr = new boolean[1];
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                this.arrowAnimator = valueAnimatorOfFloat;
                                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                    @Override
                                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                        this.f$0.lambda$process$2(f2, point2, currentWeight, fArr3, d, zArr, valueAnimator2);
                                    }
                                });
                                this.arrowAnimator.addListener(new AnimatorListenerAdapter() {
                                    @Override
                                    public void onAnimationEnd(Animator animator) {
                                        Input.this.renderView.getPainting().commitPath(null, Input.this.renderView.getCurrentColor());
                                        Input.this.arrowAnimator = null;
                                    }
                                });
                                this.arrowAnimator.setDuration(240L);
                                this.arrowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                                this.arrowAnimator.start();
                            }
                        }
                        this.renderView.getPainting().commitPath(null, this.renderView.getCurrentColor(), true, new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$process$3();
                            }
                        });
                    }
                    this.pointsCount = 0;
                    this.realPointsCount = 0;
                    this.lastAngleSet = false;
                    this.beganDrawing = false;
                    this.thicknessSum = 0.0d;
                    this.thicknessCount = 0.0d;
                    this.renderView.onFinishedDrawing(this.hasMoved);
                    return;
                }
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return;
                    }
                    if (this.ignore) {
                        this.ignore = false;
                        return;
                    }
                    this.canFill = false;
                    this.detector.clear();
                    this.renderView.getPainting().setHelperShape(null);
                    AndroidUtilities.cancelRunOnUIThread(this.fillWithCurrentBrush);
                    this.renderView.getPainting().clearStroke();
                    this.pointsCount = 0;
                    this.realPointsCount = 0;
                    this.lastAngleSet = false;
                    this.beganDrawing = false;
                    this.thicknessSum = 0.0d;
                    this.thicknessCount = 0.0d;
                    Brush brush = this.switchedBrushByStylusFrom;
                    if (brush != null) {
                        this.renderView.selectBrush(brush);
                        this.switchedBrushByStylusFrom = null;
                        return;
                    }
                    return;
                }
            }
            if (this.ignore) {
                return;
            }
            if (!this.beganDrawing) {
                this.beganDrawing = true;
                this.hasMoved = false;
                this.isFirst = true;
                this.lastLocation = point;
                this.drawingStart = System.currentTimeMillis();
                this.points[0] = point;
                this.pointsCount = 1;
                this.realPointsCount = 1;
                this.lastAngleSet = false;
                this.clearBuffer = true;
                this.canFill = true;
                AndroidUtilities.runOnUIThread(this.fillWithCurrentBrush, ViewConfiguration.getLongPressTimeout());
                return;
            }
            float distanceTo = point.getDistanceTo(this.lastLocation);
            if (distanceTo < AndroidUtilities.dp(5.0f) / f) {
                return;
            }
            if (this.canFill && (distanceTo > AndroidUtilities.dp(6.0f) / f || this.pointsCount > 4)) {
                this.canFill = false;
                AndroidUtilities.cancelRunOnUIThread(this.fillWithCurrentBrush);
            }
            if (!this.hasMoved) {
                this.renderView.onBeganDrawing();
                this.hasMoved = true;
                if (z && (this.renderView.getCurrentBrush() instanceof Brush.Radial)) {
                    this.switchedBrushByStylusFrom = this.renderView.getCurrentBrush();
                    RenderView renderView = this.renderView;
                    List list = Brush.BRUSHES_LIST;
                    renderView.selectBrush((Brush) list.get(list.size() - 1));
                }
            }
            this.points[this.pointsCount] = point;
            if (this.renderView.getPainting() == null || !this.renderView.getPainting().masking) {
                if (System.currentTimeMillis() - this.drawingStart > 3000) {
                    this.detector.clear();
                    this.renderView.getPainting().setHelperShape(null);
                } else if ((this.renderView.getCurrentBrush() instanceof Brush.Radial) || (this.renderView.getCurrentBrush() instanceof Brush.Elliptical)) {
                    this.detector.append(point.x, point.y, distanceTo > ((float) AndroidUtilities.dp(6.0f)) / f);
                }
            }
            int i = this.pointsCount + 1;
            this.pointsCount = i;
            this.realPointsCount++;
            if (i == 3) {
                Point[] pointArr = this.points;
                Point point4 = pointArr[2];
                double d2 = point4.y;
                Point point5 = pointArr[1];
                float fAtan2 = (float) Math.atan2(d2 - point5.y, point4.x - point5.x);
                if (!this.lastAngleSet) {
                    this.lastAngle = fAtan2;
                    this.lastAngleSet = true;
                } else {
                    float fClamp = androidx.core.math.MathUtils.clamp(distanceTo / (AndroidUtilities.dp(16.0f) / f), 0.0f, 1.0f);
                    if (fClamp > 0.4f) {
                        this.lastAngle = lerpAngle(this.lastAngle, fAtan2, fClamp);
                    }
                }
                smoothenAndPaintPoints(false, this.renderView.getCurrentBrush().getSmoothThicknessRate());
            }
            this.lastLocation = point;
            if (distanceTo > AndroidUtilities.dp(8.0f) / f) {
                this.lastThickLocation = point;
            }
            this.velocity = androidx.core.math.MathUtils.clamp(this.velocity + (fCurrentTimeMillis / 75.0f), 0.6f, 1.0f);
        }
    }

    public void lambda$process$2(float f, Point point, float f2, float[] fArr, double d, boolean[] zArr, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        double d2 = f;
        double dCos = Math.cos(d2 - 2.5918139392115793d);
        double dSin = Math.sin(d2 - 2.748893571891069d);
        double d3 = point.x;
        double d4 = f2;
        double d5 = dCos * d4;
        double d6 = fArr[0];
        double d7 = dSin * d4;
        Point point2 = new Point(d3 + (d5 * d6), point.y + (d6 * d7), d);
        double d8 = fFloatValue;
        paintPath(new Path(new Point[]{point2, new Point(point.x + (d5 * d8), point.y + (d7 * d8), d, true)}));
        double dCos2 = Math.cos(d2 + 2.5918139392115793d);
        double dSin2 = Math.sin(d2 + 2.748893571891069d);
        double d9 = point.x;
        double d10 = dCos2 * d4;
        double d11 = fArr[0];
        double d12 = dSin2 * d4;
        paintPath(new Path(new Point[]{new Point(d9 + (d10 * d11), point.y + (d11 * d12), d), new Point(point.x + (d10 * d8), point.y + (d12 * d8), d, true)}));
        if (!zArr[0] && fFloatValue > 0.4f) {
            zArr[0] = true;
            BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
        }
        fArr[0] = fFloatValue;
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
        double d3 = f3;
        double d4 = f2;
        return (float) Math.atan2((Math.sin(d2) * d) + (Math.sin(d4) * d3), (d * Math.cos(d2)) + (d3 * Math.cos(d4)));
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
            Point pointMultiplySum = point2.multiplySum(point, 0.5d);
            Point pointMultiplySum2 = point3.multiplySum(point2, 0.5d);
            int iMin = (int) Math.min(48.0d, Math.max(Math.floor(pointMultiplySum.getDistanceTo(pointMultiplySum2) / 1), 24.0d));
            float f2 = 1.0f / iMin;
            int i2 = 0;
            float f3 = 0.0f;
            while (i2 < iMin) {
                int i3 = i2;
                Point pointSmoothPoint = smoothPoint(pointMultiplySum, pointMultiplySum2, point2, f3, f);
                if (this.isFirst) {
                    pointSmoothPoint.edge = true;
                    this.isFirst = false;
                }
                vector.add(pointSmoothPoint);
                this.thicknessSum += pointSmoothPoint.z;
                this.thicknessCount += 1.0d;
                f3 += f2;
                i2 = i3 + 1;
            }
            if (z) {
                pointMultiplySum2.edge = true;
            }
            vector.add(pointMultiplySum2);
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
        double d2 = f * f;
        double d3 = f3 * f3;
        double d4 = f;
        return new Point((point.x * d3) + (point3.x * 2.0d * d4 * d) + (point2.x * d2), (point.y * d3) + (point3.y * 2.0d * d4 * d) + (point2.y * d2), (((((point.z * Math.pow(d, 2.0d)) + (point3.z * ((double) ((2.0f * f3) * f)))) + (point2.z * d2)) - 1.0d) * ((double) AndroidUtilities.lerp(f2, 1.0f, androidx.core.math.MathUtils.clamp(this.realPointsCount / 16.0f, 0.0f, 1.0f)))) + 1.0d);
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
                this.f$0.lambda$paintPath$5(path);
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
                this.f$0.lambda$paintPath$4(path);
            }
        });
    }
}
