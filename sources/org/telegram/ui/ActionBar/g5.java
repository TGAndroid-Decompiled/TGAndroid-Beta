package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public class g5 extends Drawable {
    public final Paint f21390a;
    public final Paint f21391b;
    public boolean f21392c;
    public long d;
    public float f21393e;
    public float f21394f;
    public int f21395g;
    public boolean h;
    public final DecelerateInterpolator f21396i;
    public int f21397j;
    public int f21398k;
    public boolean f21399l;
    public float f21400m;
    public boolean f21401n;
    public int f21402o;

    public g5() {
        Paint paint = new Paint(1);
        this.f21390a = paint;
        Paint paint2 = new Paint(1);
        this.f21391b = paint2;
        this.h = true;
        this.f21396i = new DecelerateInterpolator();
        new RectF();
        this.f21402o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f21400m = 1.0f;
    }

    public final void a(float f10, boolean z4) {
        this.d = 0L;
        float f11 = this.f21394f;
        if (f11 == 1.0f) {
            this.f21392c = true;
        } else if (f11 == 0.0f) {
            this.f21392c = false;
        }
        this.d = 0L;
        if (z4) {
            if (f11 < f10) {
                this.f21395g = (int) (f11 * 200.0f);
            } else {
                this.f21395g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f21393e = f10;
        } else {
            this.f21394f = f10;
            this.f21393e = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float abs;
        float dp;
        float abs2;
        float abs3;
        int i11;
        float f10;
        float f11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f12 = this.f21394f;
        float f13 = this.f21393e;
        if (f12 != f13) {
            if (j10 != 0) {
                int i12 = (int) (this.f21395g + j11);
                this.f21395g = i12;
                if (i12 >= 200) {
                    this.f21394f = f13;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.f21396i;
                    if (f12 < f13) {
                        this.f21394f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.f21393e;
                    } else {
                        this.f21394f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f21400m;
        if (f14 < 1.0f) {
            float f15 = (((float) j11) / 200.0f) + f14;
            this.f21400m = f15;
            if (f15 > 1.0f) {
                this.f21400m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f21394f), AndroidUtilities.dp(24.0f) / 2);
        int i13 = this.f21397j;
        if (i13 == 0) {
            i13 = k6.w0(null, k6.f21983v8, false);
        }
        int i14 = this.f21398k;
        if (i14 == 0) {
            i14 = k6.w0(null, k6.f21932s8, false);
        }
        boolean z4 = this.h;
        Paint paint = this.f21390a;
        if (z4) {
            float f16 = this.f21394f;
            if (this.f21392c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f16 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f21402o);
            if (this.f21399l) {
                float dp2 = AndroidUtilities.dp(0.5f) * this.f21394f;
                f10 = e2.c.w(1.0f, this.f21394f, paint.getStrokeWidth() / 2.0f, dp2);
            } else {
                f10 = 0.0f;
            }
            float dp3 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f21394f)) - 0.0f;
            if (this.f21399l) {
                f11 = (1.0f - this.f21394f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, dp3 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f21394f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f21394f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f21394f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f21394f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f21394f) * AndroidUtilities.dp(7.5f);
            if (this.f21399l) {
                abs3 = e2.c.w(1.0f, this.f21394f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp4 = (AndroidUtilities.dp(0.5f) * this.f21394f) + abs;
                dp -= ((1.0f - this.f21394f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f21394f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f21394f;
                abs = (AndroidUtilities.dp(0.25f) * this.f21394f) + dp4;
            }
        } else {
            float f17 = this.f21394f;
            if (this.f21392c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f17 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f21401n) {
                paint.setColor(i13);
                paint.setAlpha(this.f21402o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f21394f) + ((1.0f - Math.abs(this.f21394f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f21394f) + ((1.0f - this.f21394f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f21394f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f21394f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f21394f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f21394f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f21394f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f21394f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int w02 = k6.w0(null, k6.f22040y8, false);
                AndroidUtilities.getOffsetColor(i14, k6.w0(null, k6.f22002w8, false), this.f21394f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i13, w02, this.f21394f, 1.0f));
                paint.setAlpha(this.f21402o);
                canvas.drawLine(this.f21394f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f21394f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f21394f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f21394f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f21394f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f21394f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f21394f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f18 = dp;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f21401n) {
            canvas.drawLine(f19, -f20, f18, -f21, paint);
            canvas.drawLine(f19, f20, f18, f21, paint);
        } else {
            canvas.drawLine(f19, -f20, f18 - 0.0f, -f21, paint);
            canvas.drawLine(f19, f20, f18, f21, paint);
        }
        canvas.restore();
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
    public final void setAlpha(int i10) {
        if (this.f21402o != i10) {
            this.f21402o = i10;
            this.f21390a.setAlpha(i10);
            this.f21391b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
