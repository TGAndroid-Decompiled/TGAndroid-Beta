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
    public final Paint f22800a;
    public final Paint f22801b;
    public boolean f22802c;
    public long d;
    public float f22803e;
    public float f22804f;
    public int f22805g;
    public boolean h;
    public final DecelerateInterpolator f22806i;
    public int f22807j;
    public int f22808k;
    public boolean f22809l;
    public float f22810m;
    public boolean f22811n;
    public int f22812o;

    public c5() {
        Paint paint = new Paint(1);
        this.f22800a = paint;
        Paint paint2 = new Paint(1);
        this.f22801b = paint2;
        this.h = true;
        this.f22806i = new DecelerateInterpolator();
        new RectF();
        this.f22812o = 255;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStrokeWidth(AndroidUtilities.density * 1.66f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(Paint.Style.STROKE);
        this.f22810m = 1.0f;
    }

    public final void a(float f10, boolean z10) {
        this.d = 0L;
        float f11 = this.f22804f;
        if (f11 == 1.0f) {
            this.f22802c = true;
        } else if (f11 == 0.0f) {
            this.f22802c = false;
        }
        this.d = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f22805g = (int) (f11 * 200.0f);
            } else {
                this.f22805g = (int) ((1.0f - f11) * 200.0f);
            }
            this.d = SystemClock.elapsedRealtime();
            this.f22803e = f10;
        } else {
            this.f22804f = f10;
            this.f22803e = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        float abs;
        float dp;
        float abs2;
        float abs3;
        int i10;
        float f10;
        float f11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.d;
        long j11 = elapsedRealtime - j10;
        float f12 = this.f22804f;
        float f13 = this.f22803e;
        if (f12 != f13) {
            if (j10 != 0) {
                int i11 = (int) (this.f22805g + j11);
                this.f22805g = i11;
                if (i11 >= 200) {
                    this.f22804f = f13;
                } else {
                    DecelerateInterpolator decelerateInterpolator = this.f22806i;
                    if (f12 < f13) {
                        this.f22804f = decelerateInterpolator.getInterpolation(i11 / 200.0f) * this.f22803e;
                    } else {
                        this.f22804f = 1.0f - decelerateInterpolator.getInterpolation(i11 / 200.0f);
                    }
                }
            }
            invalidateSelf();
        }
        float f14 = this.f22810m;
        if (f14 < 1.0f) {
            float f15 = (((float) j11) / 200.0f) + f14;
            this.f22810m = f15;
            if (f15 > 1.0f) {
                this.f22810m = 1.0f;
            }
            invalidateSelf();
        }
        this.d = elapsedRealtime;
        canvas.save();
        canvas.translate(((AndroidUtilities.dp(24.0f) / 2) - AndroidUtilities.dp(9.0f)) - (AndroidUtilities.dp(1.0f) * this.f22804f), AndroidUtilities.dp(24.0f) / 2);
        int i12 = this.f22807j;
        if (i12 == 0) {
            i12 = f6.w0(null, f6.f23321v8, false);
        }
        int i13 = this.f22808k;
        if (i13 == 0) {
            i13 = f6.w0(null, f6.f23269s8, false);
        }
        boolean z10 = this.h;
        Paint paint = this.f22800a;
        if (z10) {
            float f16 = this.f22804f;
            if (this.f22802c) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate(f16 * i10, AndroidUtilities.dp(9.0f), 0.0f);
            paint.setColor(i12);
            paint.setAlpha(this.f22812o);
            if (this.f22809l) {
                float dp2 = AndroidUtilities.dp(0.5f) * this.f22804f;
                f10 = e2.c.z(1.0f, this.f22804f, paint.getStrokeWidth() / 2.0f, dp2);
            } else {
                f10 = 0.0f;
            }
            float dp3 = (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(3.0f) * this.f22804f)) - 0.0f;
            if (this.f22809l) {
                f11 = (1.0f - this.f22804f) * (paint.getStrokeWidth() / 2.0f);
            } else {
                f11 = 0.0f;
            }
            canvas.drawLine(f10, 0.0f, dp3 - f11, 0.0f, paint);
            abs = ((1.0f - Math.abs(this.f22804f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f22804f) * AndroidUtilities.dp(0.5f));
            dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f22804f) * AndroidUtilities.dp(2.5f));
            abs2 = (Math.abs(this.f22804f) * AndroidUtilities.dp(2.0f)) + AndroidUtilities.dp(5.0f);
            abs3 = Math.abs(this.f22804f) * AndroidUtilities.dp(7.5f);
            if (this.f22809l) {
                abs3 = e2.c.z(1.0f, this.f22804f, paint.getStrokeWidth() / 2.0f, abs3);
                float dp4 = (AndroidUtilities.dp(0.5f) * this.f22804f) + abs;
                dp -= ((1.0f - this.f22804f) * (paint.getStrokeWidth() / 2.0f)) + (AndroidUtilities.dp(0.5f) * this.f22804f);
                abs2 -= AndroidUtilities.dp(0.25f) * this.f22804f;
                abs = (AndroidUtilities.dp(0.25f) * this.f22804f) + dp4;
            }
        } else {
            float f17 = this.f22804f;
            if (this.f22802c) {
                i9 = -225;
            } else {
                i9 = 135;
            }
            canvas.rotate(f17 * i9, AndroidUtilities.dp(9.0f), 0.0f);
            if (this.f22811n) {
                paint.setColor(i12);
                paint.setAlpha(this.f22812o);
                canvas.drawLine((AndroidUtilities.dp(1.0f) * this.f22804f) + ((1.0f - Math.abs(this.f22804f)) * AndroidUtilities.dpf2(2.0f)), 0.0f, ((AndroidUtilities.dp(17.0f) * this.f22804f) + ((1.0f - this.f22804f) * AndroidUtilities.dpf2(16.0f))) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f22804f)) * AndroidUtilities.dpf2(5.0f)) - (Math.abs(this.f22804f) * AndroidUtilities.dpf2(0.5f));
                dp = (Math.abs(this.f22804f) * AndroidUtilities.dpf2(9.0f)) + ((1.0f - Math.abs(this.f22804f)) * AndroidUtilities.dpf2(16.0f));
                abs2 = (Math.abs(this.f22804f) * AndroidUtilities.dpf2(3.0f)) + AndroidUtilities.dpf2(5.0f);
                abs3 = (Math.abs(this.f22804f) * AndroidUtilities.dpf2(7.0f)) + AndroidUtilities.dpf2(2.0f);
            } else {
                int w02 = f6.w0(null, f6.f23371y8, false);
                AndroidUtilities.getOffsetColor(i13, f6.w0(null, f6.w8, false), this.f22804f, 1.0f);
                paint.setColor(AndroidUtilities.getOffsetColor(i12, w02, this.f22804f, 1.0f));
                paint.setAlpha(this.f22812o);
                canvas.drawLine(this.f22804f * AndroidUtilities.dp(1.0f), 0.0f, (AndroidUtilities.dp(18.0f) - (AndroidUtilities.dp(1.0f) * this.f22804f)) - 0.0f, 0.0f, paint);
                abs = ((1.0f - Math.abs(this.f22804f)) * AndroidUtilities.dp(5.0f)) - (Math.abs(this.f22804f) * AndroidUtilities.dp(0.5f));
                dp = AndroidUtilities.dp(18.0f) - (Math.abs(this.f22804f) * AndroidUtilities.dp(9.0f));
                abs2 = (Math.abs(this.f22804f) * AndroidUtilities.dp(3.0f)) + AndroidUtilities.dp(5.0f);
                abs3 = Math.abs(this.f22804f) * AndroidUtilities.dp(9.0f);
            }
        }
        float f18 = dp;
        float f19 = abs3;
        float f20 = abs2;
        float f21 = abs;
        if (this.f22811n) {
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
    public final void setAlpha(int i9) {
        if (this.f22812o != i9) {
            this.f22812o = i9;
            this.f22800a.setAlpha(i9);
            this.f22801b.setAlpha(i9);
            invalidateSelf();
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
