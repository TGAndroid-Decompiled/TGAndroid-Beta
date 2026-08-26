package org.telegram.ui.Components.Paint;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.zxing.common.detector.MathUtils;
import java.util.Vector;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.ui.Cells.AboutLinkCell$$ExternalSyntheticLambda1;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Size;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda116;

public final class Input {
    public static final CubicBezierInterpolator PRESSURE_INTERPOLATOR = new CubicBezierInterpolator(0.0d, 0.5d, 0.0d, 1.0d);
    public ValueAnimator arrowAnimator;
    public boolean beganDrawing;
    public boolean canFill;
    public boolean clearBuffer;
    public final ShapeDetector detector;
    public long drawingStart;
    public ValueAnimator fillAnimator;
    public boolean hasMoved;
    public boolean ignore;
    public Matrix invertMatrix;
    public boolean isFirst;
    public float lastAngle;
    public boolean lastAngleSet;
    public Point lastLocation;
    public double lastRemainder;
    public Point lastThickLocation;
    public long lastVelocityUpdate;
    public int pointsCount;
    public int realPointsCount;
    public final RenderView renderView;
    public Brush switchedBrushByStylusFrom;
    public double thicknessCount;
    public double thicknessSum;
    public float velocity;
    public final Point[] points = new Point[3];
    public final float[] tempPoint = new float[2];
    public final Input$$ExternalSyntheticLambda1 fillWithCurrentBrush = new Input$$ExternalSyntheticLambda1(this, 1);

    public Input(RenderView renderView) {
        this.renderView = renderView;
        this.detector = new ShapeDetector(renderView.getContext(), new DialogCell$$ExternalSyntheticLambda6(this, 21));
    }

    public final void fill(Brush.Eraser eraser, final boolean z, final RenderView$$ExternalSyntheticLambda0 renderView$$ExternalSyntheticLambda0) {
        RenderView.RenderViewDelegate renderViewDelegate;
        if (this.canFill) {
            RenderView renderView = this.renderView;
            if (renderView.getPainting().masking || this.lastLocation == null) {
                return;
            }
            Brush currentBrush = eraser == null ? renderView.getCurrentBrush() : eraser;
            if ((currentBrush instanceof Brush.Elliptical) || (currentBrush instanceof Brush.Neon)) {
                currentBrush = new Brush.Radial();
            }
            final Brush brush = currentBrush;
            this.canFill = false;
            if (brush instanceof Brush.Eraser) {
                renderView.getPainting().hasBlur = false;
            }
            Painting painting = renderView.getPainting();
            painting.renderView.performInContext(new Painting$$ExternalSyntheticLambda2(painting, 1));
            this.pointsCount = 0;
            this.realPointsCount = 0;
            this.lastAngleSet = false;
            this.beganDrawing = false;
            if (z && (renderViewDelegate = renderView.delegate) != null) {
                renderViewDelegate.onBeganDrawing();
            }
            Size size = renderView.getPainting().size;
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
            valueAnimatorOfFloat.addUpdateListener(new AboutLinkCell$$ExternalSyntheticLambda1(this, point6, brush, fMax2));
            this.fillAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    RenderView.RenderViewDelegate renderViewDelegate2;
                    Input input = Input.this;
                    input.fillAnimator = null;
                    Path path = new Path(new Point[]{point6});
                    RenderView renderView2 = input.renderView;
                    int currentColor = renderView2.getCurrentColor();
                    float f = fMax2 * 1.0f;
                    path.color = currentColor;
                    path.baseWeight = f;
                    Brush brush2 = brush;
                    path.brush = brush2;
                    brush2.getClass();
                    int currentColor2 = brush2 instanceof Brush.Eraser ? -1 : renderView2.getCurrentColor();
                    Painting painting2 = renderView2.getPainting();
                    boolean z2 = z;
                    painting2.commitPath(path, currentColor2, z2, null);
                    if (z2 && (renderViewDelegate2 = renderView2.delegate) != null) {
                        renderViewDelegate2.onFinishedDrawing();
                    }
                    RenderView$$ExternalSyntheticLambda0 renderView$$ExternalSyntheticLambda1 = renderView$$ExternalSyntheticLambda0;
                    if (renderView$$ExternalSyntheticLambda1 != null) {
                        renderView$$ExternalSyntheticLambda1.run();
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
    }

    public final void paintPath(Path path) {
        RenderView renderView = this.renderView;
        int currentColor = renderView.getCurrentColor();
        float currentWeight = renderView.getCurrentWeight();
        Brush currentBrush = renderView.getCurrentBrush();
        path.color = currentColor;
        path.baseWeight = currentWeight;
        path.brush = currentBrush;
        if (this.clearBuffer) {
            this.lastRemainder = 0.0d;
        }
        path.remainder = this.lastRemainder;
        Painting painting = renderView.getPainting();
        boolean z = this.clearBuffer;
        Input$$ExternalSyntheticLambda5 input$$ExternalSyntheticLambda5 = new Input$$ExternalSyntheticLambda5(this, path, 0);
        boolean z2 = false;
        if (painting.helperApplyAnimator == null) {
            painting.renderView.performInContext(new ProfileActivity$$ExternalSyntheticLambda116(painting, path, z, z2, input$$ExternalSyntheticLambda5, 1));
        }
        this.clearBuffer = false;
    }

    public final void smoothenAndPaintPoints(float f, boolean z) {
        int i = this.pointsCount;
        Point[] pointArr = this.points;
        if (i <= 2) {
            Point[] pointArr2 = new Point[i];
            System.arraycopy(pointArr, 0, pointArr2, 0, i);
            paintPath(new Path(pointArr2));
            return;
        }
        Vector vector = new Vector();
        Point point = pointArr[0];
        Point point2 = pointArr[1];
        Point point3 = pointArr[2];
        if (point3 == null || point2 == null || point == null) {
            return;
        }
        double d = point2.x;
        double d2 = (point.x + d) * 0.5d;
        double d3 = point2.y;
        double d4 = (point.y + d3) * 0.5d;
        double d5 = point2.z;
        double d6 = (point.z + d5) * 0.5d;
        double d7 = (point3.x + d) * 0.5d;
        double d8 = (point3.y + d3) * 0.5d;
        double d9 = (point3.z + d5) * 0.5d;
        Point point4 = new Point(d7, d8, d9);
        int iMin = (int) Math.min(48.0d, Math.max(Math.floor(((float) Math.sqrt(Math.pow(d6 - d9, 2.0d) + (Math.pow(d4 - d8, 2.0d) + Math.pow(d2 - d7, 2.0d)))) / 1), 24.0d));
        float f2 = 1.0f / iMin;
        float f3 = 0.0f;
        int i2 = 0;
        while (i2 < iMin) {
            float f4 = 1.0f - f3;
            int i3 = iMin;
            float f5 = f2;
            double d10 = f4;
            int i4 = i2;
            double dPow = Math.pow(d10, 2.0d);
            double d11 = f3 * f3;
            double d12 = f4 * f4;
            double d13 = d2 * d12;
            double d14 = f3;
            double d15 = (point4.x * d11) + (d * 2.0d * d14 * d10) + d13;
            double d16 = (point4.y * d11) + (d3 * 2.0d * d14 * d10) + (d4 * d12);
            double dLerp = (((double) AndroidUtilities.lerp(f, 1.0f, androidx.core.math.MathUtils.clamp(this.realPointsCount / 16.0f, 0.0f, 1.0f))) * (((point4.z * d11) + ((((double) ((2.0f * f4) * f3)) * d5) + (d6 * dPow))) - 1.0d)) + 1.0d;
            Point point5 = new Point(d15, d16, dLerp);
            if (this.isFirst) {
                point5.edge = true;
                this.isFirst = false;
            }
            vector.add(point5);
            this.thicknessSum += dLerp;
            this.thicknessCount += 1.0d;
            f3 += f5;
            i2 = i4 + 1;
            iMin = i3;
            f2 = f5;
        }
        if (z) {
            point4.edge = true;
        }
        vector.add(point4);
        Point[] pointArr3 = new Point[vector.size()];
        vector.toArray(pointArr3);
        paintPath(new Path(pointArr3));
        System.arraycopy(pointArr, 1, pointArr, 0, 2);
        if (z) {
            this.pointsCount = 0;
        } else {
            this.pointsCount = 2;
        }
    }
}
