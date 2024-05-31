package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
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
    private long progressStart = -1;
    private float progressAngleFrom = 0.0f;
    private float progressAngleTo = 0.0f;
    private float[] progressSegments = new float[2];
    private int toState = 0;
    private boolean waitingForProgressToEnd = false;
    private AnimatedFloat progress = new AnimatedFloat(1.0f, new Runnable() {
        @Override
        public final void run() {
            SearchStateDrawable.this.invalidateSelf();
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
        return f4 > f5 ? f >= f4 || f <= f5 : f >= f4 && f <= f5;
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
            }
        } else if (!z2 && i == 2) {
            if (this.delaySetProgress == null) {
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        SearchStateDrawable.this.lambda$setIconState$0(i, z);
                    }
                };
                this.delaySetProgress = runnable;
                AndroidUtilities.runOnUIThread(runnable, 65L);
            }
        } else {
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
    }

    public void lambda$setIconState$0(int i, boolean z) {
        this.delaySetProgress = null;
        setIconState(i, z, true);
    }

    public void setColor(int i) {
        this.paint.setColor(i);
        this.alpha = this.paint.getAlpha();
        this.paint.setAlpha(255);
    }

    @Override
    public void draw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        float f6;
        android.graphics.Rect bounds = getBounds();
        this.mn = Math.min(bounds.width(), bounds.height());
        this.cx = bounds.centerX();
        this.cy = bounds.centerY();
        int i2 = this.alpha;
        if (i2 < 255) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i2, 31);
        }
        float f7 = this.progress.set(this.waitingForProgressToEnd ? 0.0f : 1.0f);
        int i3 = this.toState;
        int i4 = this.fromState;
        float f8 = i3 == 0 ? i4 == 0 ? 1.0f : f7 : i4 == 0 ? 1.0f - f7 : 0.0f;
        int i5 = this.fromState;
        float f9 = i3 == 1 ? i5 == 1 ? 1.0f : f7 : i5 == 1 ? 1.0f - f7 : 0.0f;
        if (i3 == 2) {
            f = this.fromState == 2 ? 1.0f : f7;
        } else {
            f = this.fromState == 2 ? 1.0f - f7 : 0.0f;
        }
        if (f8 > 0.0f) {
            drawCircle(canvas, AndroidUtilities.lerp(x(0.25f), x(0.444f), f8), AndroidUtilities.lerp(y(0.5f), y(0.444f), f8), AndroidUtilities.lerp(0.0f, w(0.208f), f8));
        }
        if (f8 > 0.0f || f9 > 0.0f) {
            canvas.save();
            canvas.rotate(f8 * 45.0f, this.cx, this.cy);
            f2 = 0.75f;
            f3 = 0.5f;
            f4 = 0.2409f;
            f5 = f;
            i = 2;
            drawLine(canvas, lerp3(x(0.914f), x(0.7638f), this.fromState == 2 ? x(0.75f) : x(0.2409f), f8, f9, f5), y(0.5f), lerp3(x(0.658f), x(0.2409f), this.fromState == 2 ? x(0.75f) : x(0.2409f), f8, f9, f5), y(0.5f));
            canvas.restore();
            f6 = 0.0f;
        } else {
            f5 = f;
            f6 = 0.0f;
            f3 = 0.5f;
            f2 = 0.75f;
            i = 2;
            f4 = 0.2409f;
        }
        if (f9 > f6) {
            float lerp = this.fromState == i ? AndroidUtilities.lerp(x(f2), x(f4), f9) : x(f4);
            canvas.save();
            canvas.rotate(f8 * 45.0f, this.cx, this.cy);
            drawLines(canvas, lerp + (x(0.2452f) * f9), AndroidUtilities.lerp(y(f3), y(0.25f), f9), lerp, y(f3), lerp + (x(0.2452f) * f9), AndroidUtilities.lerp(y(f3), y(f2), f9));
            canvas.restore();
        }
        float f10 = f5;
        if (f10 > 0.0f) {
            if (this.progressStart < 0 && f10 > 0.8f) {
                this.progressStart = System.currentTimeMillis();
                this.wereNotWaitingForProgressToEnd = this.waitingForProgressToEnd;
            }
            if (this.progressStart > 0) {
                CircularProgressDrawable.getSegments(((float) (System.currentTimeMillis() - this.progressStart)) % 5400.0f, this.progressSegments);
                float[] fArr = this.progressSegments;
                float f11 = fArr[0];
                float f12 = fArr[1];
                if (getIconState() != i && !this.waitingForProgressToEnd) {
                    float max = Math.max(0.0f, (((float) Math.floor((f11 - 180.0f) / 360.0f)) * 360.0f) + 180.0f);
                    f12 = Math.min(f12, this.progressAngleTo + max);
                    f11 = AndroidUtilities.lerp(f12, Math.min(f11, max + this.progressAngleTo), f10);
                }
                float f13 = this.progressAngleTo;
                float f14 = this.progressAngleFrom;
                boolean containsAngle = containsAngle(f13, f14 + f11, f14 + f12);
                boolean z = this.waitingForProgressToEnd;
                if (z && !this.wereNotWaitingForProgressToEnd) {
                    this.wereNotWaitingForProgressToEnd = z;
                    this.progressStartedWithOverTo = containsAngle;
                }
                if (this.progressStartedWithOverTo && !containsAngle) {
                    this.progressStartedWithOverTo = false;
                }
                if (z && containsAngle && !this.progressStartedWithOverTo) {
                    this.waitingForProgressToEnd = false;
                }
                this.progressRect.set(x(0.25f), y(0.25f), x(f2), y(f2));
                canvas.drawArc(this.progressRect, this.progressAngleFrom + f11, f12 - f11, false, this.paint);
                invalidateSelf();
            }
        }
        if (this.alpha < 255) {
            canvas.restore();
        }
        if (f7 < 1.0f) {
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
