package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public class c5 extends Drawable {
    public final Paint f18786a;
    public final Paint f18787b;
    public boolean f18788c;
    public long d;
    public float e;
    public float f18789f;
    public int f18790g;
    public boolean h;
    public final DecelerateInterpolator f18791i;
    public int f18792j;
    public int f18793k;
    public boolean f18794l;
    public float f18795m;
    public boolean f18796n;
    public int f18797o;

    public c5() {
        Paint paint = new Paint(1);
        this.f18786a = paint;
        Paint paint2 = new Paint(1);
        this.f18787b = paint2;
        this.h = true;
        this.f18791i = new DecelerateInterpolator();
        new RectF();
        this.f18797o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f18795m = 1.0f;
    }

    public final void a(float f7, boolean z10) {
        this.d = 0L;
        float f10 = this.f18789f;
        if (f10 == 1.0f) {
            this.f18788c = true;
        } else if (f10 == 0.0f) {
            this.f18788c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f18790g = (int) (f10 * 200.0f);
            } else {
                this.f18790g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.e = f7;
        } else {
            this.f18789f = f7;
            this.e = f7;
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
        float f7;
        float f10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.d;
        long j10 = elapsedRealtime - j3;
        float f11 = this.f18789f;
        float f12 = this.e;
        if (f11 != f12) {
            if (j3 != 0) {
                int i12 = (int) (this.f18790g + j10);
                this.f18790g = i12;
                if (i12 >= 200) {
                    this.f18789f = f12;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.f18791i;
                    if (f11 < f12) {
                        this.f18789f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.e;
                    } else {
                        this.f18789f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f13 = this.f18795m;
        if (f13 < 1.0f) {
            float f14 = (((float) j10) / 200.0f) + f13;
            this.f18795m = f14;
            if (f14 > 1.0f) {
                this.f18795m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f18789f), AndroidUtilities.dp(24.0f) / 2);
        int i13 = this.f18792j;
        if (i13 == 0) {
            i13 = h6.w0(null, h6.f19394v8, false);
        }
        int i14 = this.f18793k;
        if (i14 == 0) {
            i14 = h6.w0(null, h6.f19339s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f18786a;
        if (z10) {
            float f15 = this.f18789f;
            if (this.f18788c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f15 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f18797o);
            if (this.f18794l) {
                float dp2 = AndroidUtilities.dp(0.5f) * this.f18789f;
                f7 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f18789f, paint.getStrokeWidth() / 2.0f, dp2);
            } else {
                f7 = 0.0f;
            }
            float dp3 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f18789f)) - 0.0f;
            if (this.f18794l) {
                f10 = (1.0f - this.f18789f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f10 = 0.0f;
            }
            canvas.drawLine(f7, 0.0f, dp3 - f10, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f18789f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f18789f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f18789f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f18789f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f18789f) * AndroidUtilities.dp(7.5f);
            if (this.f18794l) {
                abs3 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f18789f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp4 = (AndroidUtilities.dp(0.5f) * this.f18789f) + abs;
                dp -= ((1.0f - this.f18789f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f18789f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f18789f;
                abs = (AndroidUtilities.dp(0.25f) * this.f18789f) + dp4;
            }
        } else {
            float f16 = this.f18789f;
            if (this.f18788c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f16 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f18796n) {
                paint.setColor(i13);
                paint.setAlpha(this.f18797o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f18789f) + ((1.0f - Math.abs(this.f18789f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f18789f) + ((1.0f - this.f18789f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f18789f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f18789f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f18789f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f18789f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f18789f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f18789f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int w02 = h6.w0(null, h6.f19446y8, false);
                AndroidUtilities.getOffsetColor(i14, h6.w0(null, h6.f19412w8, false), this.f18789f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i13, w02, this.f18789f, 1.0f));
                paint.setAlpha(this.f18797o);
                canvas.drawLine(this.f18789f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f18789f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f18789f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f18789f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f18789f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f18789f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f18789f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f17 = dp;
        float f18 = abs3;
        float f19 = abs2;
        float f20 = abs;
        if (this.f18796n) {
            canvas.drawLine(f18, -f19, f17, -f20, paint);
            canvas.drawLine(f18, f19, f17, f20, paint);
        } else {
            canvas.drawLine(f18, -f19, f17 - 0.0f, -f20, paint);
            canvas.drawLine(f18, f19, f17, f20, paint);
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
        if (this.f18797o != i10) {
            this.f18797o = i10;
            this.f18786a.setAlpha(i10);
            this.f18787b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
