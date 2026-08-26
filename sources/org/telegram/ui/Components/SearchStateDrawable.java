package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.ui.FilterCreateActivity$$ExternalSyntheticLambda27;

public final class SearchStateDrawable extends Drawable {
    public float cx;
    public float cy;
    public FilterCreateActivity$$ExternalSyntheticLambda27 delaySetProgress;
    public int fromState;
    public float mn;
    public final Paint paint;
    public boolean progressStartedWithOverTo;
    public boolean wereNotWaitingForProgressToEnd;
    public int alpha = 255;
    public final Path path = new Path();
    public final RectF progressRect = new RectF();
    public long progressStart = -1;
    public float progressAngleFrom = 0.0f;
    public float progressAngleTo = 0.0f;
    public final float[] progressSegments = new float[2];
    public int toState = 0;
    public boolean waitingForProgressToEnd = false;
    public final AnimatedFloat progress = new AnimatedFloat(1.0f, new SeekBarView$$ExternalSyntheticLambda1(this, 7), 0, 350, CubicBezierInterpolator.EASE_OUT_QUINT);

    public SearchStateDrawable() {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    @Override
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        char c;
        float f4;
        char c2;
        float f5;
        float f6;
        float f7;
        boolean z;
        Rect bounds = getBounds();
        this.mn = Math.min(bounds.width(), bounds.height());
        this.cx = bounds.centerX();
        this.cy = bounds.centerY();
        int i = this.alpha;
        if (i < 255) {
            float f8 = bounds.left;
            float f9 = bounds.top;
            float f10 = bounds.right;
            float f11 = bounds.bottom;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(f8, f9, f10, f11, i, 31);
        } else {
            canvas2 = canvas;
        }
        float f12 = this.progress.set(this.waitingForProgressToEnd ? 0.0f : 1.0f, false);
        int i2 = this.toState;
        int i3 = this.fromState;
        if (i2 == 0) {
            f = i3 == 0 ? 1.0f : f12;
        } else {
            f = i3 == 0 ? 1.0f - f12 : 0.0f;
        }
        if (i2 == 1) {
            f2 = this.fromState == 1 ? 1.0f : f12;
        } else {
            f2 = this.fromState == 1 ? 1.0f - f12 : 0.0f;
        }
        if (i2 == 2) {
            f3 = this.fromState == 2 ? 1.0f : f12;
        } else {
            f3 = this.fromState == 2 ? 1.0f - f12 : 0.0f;
        }
        Paint paint = this.paint;
        if (f > 0.0f) {
            c = 1;
            float fLerp = AndroidUtilities.lerp(x(0.25f), x(0.444f), f);
            float fLerp2 = AndroidUtilities.lerp(y(0.5f), y(0.444f), f);
            float fLerp3 = AndroidUtilities.lerp(0.0f, this.mn * 0.208f, f);
            if (fLerp3 >= this.mn * 0.075f) {
                canvas2.drawCircle(fLerp, fLerp2, fLerp3, paint);
            }
        } else {
            c = 1;
        }
        if (f > 0.0f || f2 > 0.0f) {
            canvas2.save();
            f4 = 45.0f;
            canvas2.rotate(f * 45.0f, this.cx, this.cy);
            float fX = x(0.914f);
            float fX2 = ((this.fromState == 2 ? x(0.75f) : x(0.2409f)) * f3) + (x(0.7638f) * f2) + (fX * f);
            float fY = y(0.5f);
            float fX3 = x(0.658f);
            c2 = 0;
            float fX4 = ((this.fromState == 2 ? x(0.75f) : x(0.2409f)) * f3) + (x(0.2409f) * f2) + (fX3 * f);
            float fY2 = y(0.5f);
            if (MathUtils.distance(fX2, fY, fX4, fY2) <= this.mn * 0.075f) {
                f5 = 0.5f;
                f6 = 0.25f;
                f7 = 0.0f;
            } else {
                f5 = 0.5f;
                f6 = 0.25f;
                f7 = 0.0f;
                canvas2.drawLine(fX2, fY, fX4, fY2, paint);
            }
            canvas2.restore();
        } else {
            f3 = f3;
            f5 = 0.5f;
            f6 = 0.25f;
            f7 = 0.0f;
            f4 = 45.0f;
            c2 = 0;
        }
        if (f2 > f7) {
            float fLerp4 = this.fromState == 2 ? AndroidUtilities.lerp(x(0.75f), x(0.2409f), f2) : x(0.2409f);
            canvas2.save();
            canvas2.rotate(f * f4, this.cx, this.cy);
            float fX5 = (x(0.2452f) * f2) + fLerp4;
            float fLerp5 = AndroidUtilities.lerp(y(f5), y(f6), f2);
            float fY3 = y(f5);
            float fX6 = (x(0.2452f) * f2) + fLerp4;
            float fLerp6 = AndroidUtilities.lerp(y(f5), y(0.75f), f2);
            if (Math.max(MathUtils.distance(fX5, fLerp5, fLerp4, fY3), MathUtils.distance(fX6, fLerp6, fLerp4, fY3)) > this.mn * 0.075f) {
                Path path = this.path;
                path.rewind();
                path.moveTo(fX5, fLerp5);
                path.lineTo(fLerp4, fY3);
                path.lineTo(fX6, fLerp6);
                canvas2.drawPath(path, paint);
            }
            canvas2.restore();
        }
        if (f3 > f7) {
            if (this.progressStart < 0 && f3 > 0.8f) {
                this.progressStart = System.currentTimeMillis();
                this.wereNotWaitingForProgressToEnd = this.waitingForProgressToEnd;
            }
            if (this.progressStart > 0) {
                float fCurrentTimeMillis = (System.currentTimeMillis() - this.progressStart) % 5400.0f;
                float[] fArr = this.progressSegments;
                CircularProgressDrawable.getSegments(fArr, fCurrentTimeMillis);
                float fLerp7 = fArr[c2];
                float fMin = fArr[c];
                if (this.toState != 2 && !this.waitingForProgressToEnd) {
                    float fMax = Math.max(0.0f, (((float) Math.floor((fLerp7 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    fMin = Math.min(fMin, this.progressAngleTo + fMax);
                    fLerp7 = AndroidUtilities.lerp(fMin, Math.min(fLerp7, fMax + this.progressAngleTo), f3);
                }
                float f13 = this.progressAngleTo;
                float f14 = this.progressAngleFrom;
                float f15 = f14 + fLerp7;
                float f16 = f14 + fMin;
                float f17 = f15 % 360.0f;
                if (f17 < 0.0f) {
                    f17 += 360.0f;
                }
                float f18 = f16 % 360.0f;
                if (f18 < 0.0f) {
                    f18 += 360.0f;
                }
                boolean z2 = f17 <= f18 ? !(f13 < f17 || f13 > f18) : !(f13 < f17 && f13 > f18);
                boolean z3 = this.waitingForProgressToEnd;
                if (z3 && !this.wereNotWaitingForProgressToEnd) {
                    this.wereNotWaitingForProgressToEnd = z3;
                    this.progressStartedWithOverTo = z2;
                }
                if (!this.progressStartedWithOverTo || z2) {
                    z = false;
                } else {
                    z = false;
                    this.progressStartedWithOverTo = false;
                }
                if (z3 && z2 && !this.progressStartedWithOverTo) {
                    this.waitingForProgressToEnd = z;
                }
                float f19 = fLerp7;
                RectF rectF = this.progressRect;
                rectF.set(x(f6), y(f6), x(0.75f), y(0.75f));
                canvas2.drawArc(rectF, this.progressAngleFrom + f19, fMin - f19, false, paint);
                invalidateSelf();
            }
        }
        if (this.alpha < 255) {
            canvas.restore();
        }
        if (f12 < 1.0f) {
            invalidateSelf();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    public final void setIconState(int i, boolean z, boolean z2) {
        if (this.toState == i) {
            if (i != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.delaySetProgress);
                this.delaySetProgress = null;
                return;
            }
            return;
        }
        if (!z2 && i == 2) {
            if (this.delaySetProgress == null) {
                FilterCreateActivity$$ExternalSyntheticLambda27 filterCreateActivity$$ExternalSyntheticLambda27 = new FilterCreateActivity$$ExternalSyntheticLambda27(this, i, z);
                this.delaySetProgress = filterCreateActivity$$ExternalSyntheticLambda27;
                AndroidUtilities.runOnUIThread(filterCreateActivity$$ExternalSyntheticLambda27, 65L);
                return;
            }
            return;
        }
        FilterCreateActivity$$ExternalSyntheticLambda27 filterCreateActivity$$ExternalSyntheticLambda28 = this.delaySetProgress;
        if (filterCreateActivity$$ExternalSyntheticLambda28 != null) {
            AndroidUtilities.cancelRunOnUIThread(filterCreateActivity$$ExternalSyntheticLambda28);
        }
        AnimatedFloat animatedFloat = this.progress;
        boolean z3 = false;
        if (animatedFloat.value < 1.0f && z) {
            setIconState(this.toState, false, false);
        }
        if (i == 2) {
            this.progressAngleFrom = 180.0f;
            this.progressStart = -1L;
        } else if (this.toState == 2) {
            if (i == 0) {
                this.progressAngleTo = -45.0f;
            } else {
                this.progressAngleTo = 0.0f;
            }
        }
        if (z) {
            int i2 = this.toState;
            this.fromState = i2;
            this.toState = i;
            if (i2 == 2 && i != 2) {
                z3 = true;
            }
            this.waitingForProgressToEnd = z3;
            animatedFloat.set(0.0f, true);
        } else {
            this.toState = i;
            this.fromState = i;
            this.waitingForProgressToEnd = false;
            animatedFloat.set(1.0f, true);
        }
        invalidateSelf();
    }

    public final float x(float f) {
        return BotFullscreenButtons$$ExternalSyntheticOutline0.m(0.5f, f, this.mn, this.cx);
    }

    public final float y(float f) {
        return BotFullscreenButtons$$ExternalSyntheticOutline0.m(0.5f, f, this.mn, this.cy);
    }
}
