package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
public final class h2 extends Drawable {
    public final Paint f23468a;
    public boolean f23469b;
    public long f23470c;
    public float d;
    public float f23471e;
    public int f23472f;
    public final boolean f23473g;
    public final DecelerateInterpolator h;
    public int f23474i;
    public int f23475j;
    public float f23476k;
    public int f23477l;

    public h2(boolean z10) {
        Paint paint = new Paint(1);
        this.f23468a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f23474i = -1;
        this.f23475j = -9079435;
        this.f23476k = 300.0f;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setColor(-65536);
        this.f23473g = z10;
    }

    public final void a(int i10) {
        this.f23474i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f23475j = i10;
        invalidateSelf();
    }

    public final void c(float f9, boolean z10) {
        this.f23470c = 0L;
        float f10 = this.f23471e;
        if (f10 == 1.0f) {
            this.f23469b = true;
        } else if (f10 == 0.0f) {
            this.f23469b = false;
        }
        this.f23470c = 0L;
        if (z10) {
            if (f10 < f9) {
                this.f23472f = (int) (f10 * this.f23476k);
            } else {
                this.f23472f = (int) ((1.0f - f10) * this.f23476k);
            }
            this.f23470c = System.currentTimeMillis();
            this.d = f9;
        } else {
            this.f23471e = f9;
            this.d = f9;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        if (this.f23471e != this.d) {
            if (this.f23470c != 0) {
                int currentTimeMillis = this.f23472f + ((int) (System.currentTimeMillis() - this.f23470c));
                this.f23472f = currentTimeMillis;
                float f9 = currentTimeMillis;
                float f10 = this.f23476k;
                if (f9 >= f10) {
                    this.f23471e = this.d;
                } else {
                    float f11 = this.f23471e;
                    float f12 = this.d;
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 < f12) {
                        this.f23471e = decelerateInterpolator.getInterpolation(f9 / f10) * this.d;
                    } else {
                        this.f23471e = 1.0f - decelerateInterpolator.getInterpolation(f9 / f10);
                    }
                }
            }
            this.f23470c = System.currentTimeMillis();
            invalidateSelf();
        }
        int d = i0.a.d(this.f23471e, this.f23474i, this.f23475j);
        Paint paint = this.f23468a;
        paint.setColor(d);
        canvas.save();
        canvas.translate(AndroidUtilities.dp(24.0f) / 2.0f, AndroidUtilities.dp(24.0f) / 2.0f);
        int i12 = this.f23477l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f13 = this.f23471e;
        canvas.translate(-AndroidUtilities.dp(0.66f), 0.0f);
        if (!this.f23473g) {
            float f14 = this.f23471e;
            if (this.f23469b) {
                i11 = -225;
            } else {
                i11 = 135;
            }
            canvas.rotate(f14 * i11);
        } else {
            float f15 = this.f23471e;
            if (this.f23469b) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate((f15 * i10) + 135.0f);
            f13 = 1.0f;
        }
        float f16 = 1.0f - f13;
        canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.lerp(-6.75f, -8.0f, f13)), 0.0f, AndroidUtilities.dp(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f16), 0.0f, paint);
        float dp = AndroidUtilities.dp(-0.25f);
        float dp2 = AndroidUtilities.dp(AndroidUtilities.lerp(7.0f, 8.0f, f13)) - ((paint.getStrokeWidth() / 4.0f) * f16);
        float dp3 = AndroidUtilities.dp(AndroidUtilities.lerp(-7.25f, 0.0f, f13));
        canvas.drawLine(dp3, -dp, 0.0f, -dp2, paint);
        canvas.drawLine(dp3, dp, 0.0f, dp2, paint);
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
        this.f23468a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f23468a.setColorFilter(colorFilter);
    }
}
