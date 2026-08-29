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
    public final Paint f22817a;
    public final Paint f22818b;
    public boolean f22819c;
    public long d;
    public float f22820e;
    public float f22821f;
    public int f22822g;
    public boolean h;
    public final DecelerateInterpolator f22823i;
    public int f22824j;
    public int f22825k;
    public boolean f22826l;
    public float f22827m;
    public boolean f22828n;
    public int f22829o;

    public c5() {
        Paint paint = new Paint(1);
        this.f22817a = paint;
        Paint paint2 = new Paint(1);
        this.f22818b = paint2;
        this.h = true;
        this.f22823i = new DecelerateInterpolator();
        new RectF();
        this.f22829o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f22827m = 1.0f;
    }

    public final void a(float f9, boolean z10) {
        this.d = 0L;
        float f10 = this.f22821f;
        if (f10 == 1.0f) {
            this.f22819c = true;
        } else if (f10 == 0.0f) {
            this.f22819c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f10 < f9) {
                this.f22822g = (int) (f10 * 200.0f);
            } else {
                this.f22822g = (int) ((1.0f - f10) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f22820e = f9;
        } else {
            this.f22821f = f9;
            this.f22820e = f9;
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
        float f9;
        float f10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f11 = this.f22821f;
        float f12 = this.f22820e;
        if (f11 != f12) {
            if (j10 != 0) {
                int i12 = (int) (this.f22822g + j11);
                this.f22822g = i12;
                if (i12 >= 200) {
                    this.f22821f = f12;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.f22823i;
                    if (f11 < f12) {
                        this.f22821f = decelerateInterpolator.getInterpolation(i12 / 200.0f) * this.f22820e;
                    } else {
                        this.f22821f = 1.0f - decelerateInterpolator.getInterpolation(i12 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f13 = this.f22827m;
        if (f13 < 1.0f) {
            float f14 = (((float) j11) / 200.0f) + f13;
            this.f22827m = f14;
            if (f14 > 1.0f) {
                this.f22827m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f22821f), AndroidUtilities.dp(24.0f) / 2);
        int i13 = this.f22824j;
        if (i13 == 0) {
            i13 = g6.w0(null, g6.f23385v8, false);
        }
        int i14 = this.f22825k;
        if (i14 == 0) {
            i14 = g6.w0(null, g6.f23329s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f22817a;
        if (z10) {
            float f15 = this.f22821f;
            if (this.f22819c) {
                i11 = -180;
            } else {
                i11 = 180;
            }
            canvas.rotate(f15 * i11, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i13);
            paint.setAlpha(this.f22829o);
            if (this.f22826l) {
                float dp2 = AndroidUtilities.dp(0.5f) * this.f22821f;
                f9 = com.google.android.recaptcha.internal.a.z(1.0f, this.f22821f, paint.getStrokeWidth() / 2.0f, dp2);
            } else {
                f9 = 0.0f;
            }
            float dp3 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f22821f)) - 0.0f;
            if (this.f22826l) {
                f10 = (1.0f - this.f22821f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f10 = 0.0f;
            }
            canvas.drawLine(f9, 0.0f, dp3 - f10, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f22821f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f22821f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f22821f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f22821f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f22821f) * AndroidUtilities.dp(7.5f);
            if (this.f22826l) {
                abs3 = com.google.android.recaptcha.internal.a.z(1.0f, this.f22821f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp4 = (AndroidUtilities.dp(0.5f) * this.f22821f) + abs;
                dp -= ((1.0f - this.f22821f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f22821f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f22821f;
                abs = (AndroidUtilities.dp(0.25f) * this.f22821f) + dp4;
            }
        } else {
            float f16 = this.f22821f;
            if (this.f22819c) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f16 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f22828n) {
                paint.setColor(i13);
                paint.setAlpha(this.f22829o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f22821f) + ((1.0f - Math.abs(this.f22821f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f22821f) + ((1.0f - this.f22821f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f22821f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f22821f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f22821f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f22821f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f22821f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f22821f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int w02 = g6.w0(null, g6.y8, false);
                AndroidUtilities.getOffsetColor(i14, g6.w0(null, g6.f23403w8, false), this.f22821f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i13, w02, this.f22821f, 1.0f));
                paint.setAlpha(this.f22829o);
                canvas.drawLine(this.f22821f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f22821f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f22821f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f22821f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f22821f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f22821f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f22821f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f17 = dp;
        float f18 = abs3;
        float f19 = abs2;
        float f20 = abs;
        if (this.f22828n) {
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
        if (this.f22829o != i10) {
            this.f22829o = i10;
            this.f22817a.setAlpha(i10);
            this.f22818b.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
