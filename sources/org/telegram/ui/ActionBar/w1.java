package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public final class w1 extends Drawable {
    public final Paint f28764a;
    public boolean f28765b;
    public long f28766c;
    public float d;
    public float f28767e;
    public int f28768f;
    public final boolean f28769g;
    public final DecelerateInterpolator h;
    public int f28770i;
    public int f28771j;
    public float f28772k;
    public int f28773l;

    public w1(boolean z10) {
        Paint paint = new Paint(1);
        this.f28764a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f28770i = -1;
        this.f28771j = -9079435;
        this.f28772k = 300.0f;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setColor(-65536);
        this.f28769g = z10;
    }

    public final void a(int i3) {
        this.f28770i = i3;
        invalidateSelf();
    }

    public final void b(int i3) {
        this.f28771j = i3;
        invalidateSelf();
    }

    public final void c(boolean z10, float f10) {
        this.f28766c = 0L;
        float f11 = this.f28767e;
        if (f11 == 1.0f) {
            this.f28765b = true;
        } else if (f11 == 0.0f) {
            this.f28765b = false;
        }
        this.f28766c = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f28768f = (int) (f11 * this.f28772k);
            } else {
                this.f28768f = (int) ((1.0f - f11) * this.f28772k);
            }
            this.f28766c = System.currentTimeMillis();
            this.d = f10;
        } else {
            this.f28767e = f10;
            this.d = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i3;
        int i10;
        if (this.f28767e != this.d) {
            if (this.f28766c != 0) {
                int currentTimeMillis = this.f28768f + ((int) (System.currentTimeMillis() - this.f28766c));
                this.f28768f = currentTimeMillis;
                float f10 = currentTimeMillis;
                float f11 = this.f28772k;
                if (f10 >= f11) {
                    this.f28767e = this.d;
                } else {
                    int i11 = (this.f28767e > this.d ? 1 : (this.f28767e == this.d ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i11 < 0) {
                        this.f28767e = decelerateInterpolator.getInterpolation(f10 / f11) * this.d;
                    } else {
                        this.f28767e = 1.0f - decelerateInterpolator.getInterpolation(f10 / f11);
                    }
                }
            }
            this.f28766c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f12 = i0.a.f(this.f28767e, this.f28770i, this.f28771j);
        Paint paint = this.f28764a;
        paint.setColor(f12);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(24.0f) / 2.0f, org.telegram.messenger.g0.L(24.0f) / 2.0f);
        int i12 = this.f28773l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f13 = this.f28767e;
        canvas.translate(-org.telegram.messenger.g0.L(0.66f), 0.0f);
        if (!this.f28769g) {
            float f14 = this.f28767e;
            if (this.f28765b) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f14 * i10);
        } else {
            float f15 = this.f28767e;
            if (this.f28765b) {
                i3 = -180;
            } else {
                i3 = 180;
            }
            canvas.rotate((f15 * i3) + 135.0f);
            f13 = 1.0f;
        }
        float f16 = 1.0f - f13;
        canvas.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-6.75f, -8.0f, f13)), 0.0f, org.telegram.messenger.g0.L(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f16), 0.0f, paint);
        float L = org.telegram.messenger.g0.L(-0.25f);
        float L2 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(7.0f, 8.0f, f13)) - ((paint.getStrokeWidth() / 4.0f) * f16);
        float L3 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(-7.25f, 0.0f, f13));
        canvas.drawLine(L3, -L, 0.0f, -L2, paint);
        canvas.drawLine(L3, L, 0.0f, L2, paint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i3) {
        this.f28764a.setAlpha(i3);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28764a.setColorFilter(colorFilter);
    }
}
