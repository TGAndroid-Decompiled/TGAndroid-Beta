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

public class SearchStateDrawable extends Drawable {
    private float cx;
    private float cy;
    private Runnable delaySetProgress;
    private int fromState;
    private float mn;
    private Paint paint;
    private boolean progressStartedWithOverTo;
    private boolean wereNotWaitingForProgressToEnd;
    private int alpha = 255;
    private Path path = new Path();
    private RectF progressRect = new RectF();
    private final float progressRadius = 0.25f;
    private long progressStart = -1;
    private float progressAngleFrom = 0.0f;
    private float progressAngleTo = 0.0f;
    private float[] progressSegments = new float[2];
    private int toState = 0;
    private boolean waitingForProgressToEnd = false;
    private AnimatedFloat progress = new AnimatedFloat(1.0f, new Runnable() {
        @Override
        public final void run() {
            this.f$0.invalidateSelf();
        }
    }, 0, 350, CubicBezierInterpolator.EASE_OUT_QUINT);

    private boolean containsAngle(float f, float f2, float f3) {
        float f4 = f2 % 360.0f;
        if (f4 < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f3 % 360.0f;
        if (f5 < 0.0f) {
            f5 += 360.0f;
        }
        if (f4 > f5) {
            return f >= f4 || f <= f5;
        }
        return f >= f4 && f <= f5;
    }

    private float lerp3(float f, float f2, float f3, float f4, float f5, float f6) {
        return (f * f4) + (f2 * f5) + (f3 * f6);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    public SearchStateDrawable() {
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setColor(-1);
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setStrokeJoin(Paint.Join.ROUND);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        this.paint.setStrokeWidth(AndroidUtilities.dp(1.333f));
    }

    public int getIconState() {
        return this.toState;
    }

    public void setIconState(int i) {
        setIconState(i, true);
    }

    public void setIconState(int i, boolean z) {
        setIconState(i, z, false);
    }

    private void setIconState(final int i, final boolean z, boolean z2) {
        if (getIconState() == i) {
            if (i != 2) {
                AndroidUtilities.cancelRunOnUIThread(this.delaySetProgress);
                this.delaySetProgress = null;
                return;
            }
            return;
        }
        if (!z2 && i == 2) {
            if (this.delaySetProgress == null) {
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        SearchStateDrawable.m2721$r8$lambda$vUNpdGSxmtEg60zra0aT28JE(this.f$0, i, z);
                    }
                };
                this.delaySetProgress = runnable;
                AndroidUtilities.runOnUIThread(runnable, 65L);
                return;
            }
            return;
        }
        Runnable runnable2 = this.delaySetProgress;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
        boolean z3 = false;
        if (this.progress.get() < 1.0f && z) {
            setIconState(this.toState, false);
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
            this.progress.set(0.0f, true);
        } else {
            this.toState = i;
            this.fromState = i;
            this.waitingForProgressToEnd = false;
            this.progress.set(1.0f, true);
        }
        invalidateSelf();
    }

    public static void m2721$r8$lambda$vUNpdGSxmtEg60zra0aT28JE(SearchStateDrawable searchStateDrawable, int i, boolean z) {
        searchStateDrawable.delaySetProgress = null;
        searchStateDrawable.setIconState(i, z, true);
    }

    public void setColor(int i) {
        this.paint.setColor(i);
        this.alpha = this.paint.getAlpha();
        this.paint.setAlpha(255);
    }

    @Override
    public void draw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        char c;
        float f6;
        float f7;
        float f8;
        Canvas canvas3;
        Rect bounds = getBounds();
        this.mn = Math.min(bounds.width(), bounds.height());
        this.cx = bounds.centerX();
        this.cy = bounds.centerY();
        int i = this.alpha;
        if (i < 255) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i, 31);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        float f9 = this.progress.set(this.waitingForProgressToEnd ? 0.0f : 1.0f);
        int i2 = this.toState;
        int i3 = this.fromState;
        if (i2 == 0) {
            f = i3 == 0 ? 1.0f : f9;
        } else {
            f = i3 == 0 ? 1.0f - f9 : 0.0f;
        }
        if (i2 == 1) {
            f2 = this.fromState == 1 ? 1.0f : f9;
        } else {
            f2 = this.fromState == 1 ? 1.0f - f9 : 0.0f;
        }
        if (i2 == 2) {
            f3 = this.fromState == 2 ? 1.0f : f9;
        } else {
            f3 = this.fromState == 2 ? 1.0f - f9 : 0.0f;
        }
        if (f > 0.0f) {
            f4 = 1.0f;
            drawCircle(canvas2, AndroidUtilities.lerp(x(0.25f), x(0.444f), f), AndroidUtilities.lerp(y(0.5f), y(0.444f), f), AndroidUtilities.lerp(0.0f, w(0.208f), f));
        } else {
            f4 = 1.0f;
        }
        if (f > 0.0f || f2 > 0.0f) {
            canvas2.save();
            f5 = 45.0f;
            c = 1;
            canvas2.rotate(f * 45.0f, this.cx, this.cy);
            f6 = 0.2409f;
            f7 = 0.75f;
            f8 = f3;
            canvas3 = canvas2;
            drawLine(canvas3, lerp3(x(0.914f), x(0.7638f), this.fromState == 2 ? x(0.75f) : x(0.2409f), f, f2, f3), y(0.5f), lerp3(x(0.658f), x(0.2409f), this.fromState == 2 ? x(0.75f) : x(0.2409f), f, f2, f3), y(0.5f));
            canvas3.restore();
        } else {
            f8 = f3;
            canvas3 = canvas2;
            f6 = 0.2409f;
            f7 = 0.75f;
            f5 = 45.0f;
            c = 1;
        }
        if (f2 > 0.0f) {
            float fLerp = this.fromState == 2 ? AndroidUtilities.lerp(x(f7), x(f6), f2) : x(f6);
            canvas3.save();
            canvas3.rotate(f * f5, this.cx, this.cy);
            drawLines(canvas3, (x(0.2452f) * f2) + fLerp, AndroidUtilities.lerp(y(0.5f), y(0.25f), f2), fLerp, y(0.5f), (x(0.2452f) * f2) + fLerp, AndroidUtilities.lerp(y(0.5f), y(f7), f2));
            canvas.restore();
        }
        if (f8 > 0.0f) {
            if (this.progressStart < 0 && f8 > 0.8f) {
                this.progressStart = System.currentTimeMillis();
                this.wereNotWaitingForProgressToEnd = this.waitingForProgressToEnd;
            }
            if (this.progressStart > 0) {
                CircularProgressDrawable.getSegments((System.currentTimeMillis() - this.progressStart) % 5400.0f, this.progressSegments);
                float[] fArr = this.progressSegments;
                float fLerp2 = fArr[0];
                float fMin = fArr[c];
                if (getIconState() != 2 && !this.waitingForProgressToEnd) {
                    float fMax = Math.max(0.0f, (((float) Math.floor((fLerp2 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    fMin = Math.min(fMin, this.progressAngleTo + fMax);
                    fLerp2 = AndroidUtilities.lerp(fMin, Math.min(fLerp2, fMax + this.progressAngleTo), f8);
                }
                float f10 = this.progressAngleTo;
                float f11 = this.progressAngleFrom;
                boolean zContainsAngle = containsAngle(f10, f11 + fLerp2, f11 + fMin);
                boolean z = this.waitingForProgressToEnd;
                if (z && !this.wereNotWaitingForProgressToEnd) {
                    this.wereNotWaitingForProgressToEnd = z;
                    this.progressStartedWithOverTo = zContainsAngle;
                }
                if (this.progressStartedWithOverTo && !zContainsAngle) {
                    this.progressStartedWithOverTo = false;
                }
                if (z && zContainsAngle && !this.progressStartedWithOverTo) {
                    this.waitingForProgressToEnd = false;
                }
                this.progressRect.set(x(0.25f), y(0.25f), x(f7), y(f7));
                canvas.drawArc(this.progressRect, this.progressAngleFrom + fLerp2, fMin - fLerp2, false, this.paint);
                invalidateSelf();
            }
        }
        if (this.alpha < 255) {
            canvas.restore();
        }
        if (f9 < f4) {
            invalidateSelf();
        }
    }

    private void drawCircle(Canvas canvas, float f, float f2, float f3) {
        if (f3 < w(0.075f)) {
            return;
        }
        canvas.drawCircle(f, f2, f3, this.paint);
    }

    private void drawLine(Canvas canvas, float f, float f2, float f3, float f4) {
        if (MathUtils.distance(f, f2, f3, f4) <= w(0.075f)) {
            return;
        }
        canvas.drawLine(f, f2, f3, f4, this.paint);
    }

    private void drawLines(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        if (Math.max(MathUtils.distance(f, f2, f3, f4), MathUtils.distance(f5, f6, f3, f4)) <= w(0.075f)) {
            return;
        }
        this.path.rewind();
        this.path.moveTo(f, f2);
        this.path.lineTo(f3, f4);
        this.path.lineTo(f5, f6);
        canvas.drawPath(this.path, this.paint);
    }

    private float x(float f) {
        return this.cx - (this.mn * (0.5f - f));
    }

    private float y(float f) {
        return this.cy - (this.mn * (0.5f - f));
    }

    private float w(float f) {
        return this.mn * f;
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }
}
