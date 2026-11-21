package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public final class x1 extends Drawable {
    public final Paint f30244a;
    public boolean f30245b;
    public long f30246c;
    public float d;
    public float f30247e;
    public int f30248f;
    public final boolean f30249g;
    public final DecelerateInterpolator h;
    public int f30250i;
    public int f30251j;
    public float f30252k;
    public int f30253l;

    public x1(boolean z10) {
        Paint paint = new Paint(1);
        this.f30244a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f30250i = -1;
        this.f30251j = -9079435;
        this.f30252k = 300.0f;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setColor(-65536);
        this.f30249g = z10;
    }

    public final void a(int i7) {
        this.f30250i = i7;
        invalidateSelf();
    }

    public final void b(int i7) {
        this.f30251j = i7;
        invalidateSelf();
    }

    public final void c(boolean z10, float f10) {
        this.f30246c = 0L;
        float f11 = this.f30247e;
        if (f11 == 1.0f) {
            this.f30245b = true;
        } else if (f11 == 0.0f) {
            this.f30245b = false;
        }
        this.f30246c = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f30248f = (int) (f11 * this.f30252k);
            } else {
                this.f30248f = (int) ((1.0f - f11) * this.f30252k);
            }
            this.f30246c = System.currentTimeMillis();
            this.d = f10;
        } else {
            this.f30247e = f10;
            this.d = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        int i10;
        if (this.f30247e != this.d) {
            if (this.f30246c != 0) {
                int currentTimeMillis = this.f30248f + ((int) (System.currentTimeMillis() - this.f30246c));
                this.f30248f = currentTimeMillis;
                float f10 = currentTimeMillis;
                float f11 = this.f30252k;
                if (f10 >= f11) {
                    this.f30247e = this.d;
                } else {
                    int i11 = (this.f30247e > this.d ? 1 : (this.f30247e == this.d ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i11 < 0) {
                        this.f30247e = decelerateInterpolator.getInterpolation(f10 / f11) * this.d;
                    } else {
                        this.f30247e = 1.0f - decelerateInterpolator.getInterpolation(f10 / f11);
                    }
                }
            }
            this.f30246c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f12 = i0.a.f(this.f30247e, this.f30250i, this.f30251j);
        Paint paint = this.f30244a;
        paint.setColor(f12);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(24.0f) / 2.0f, org.telegram.messenger.g0.L(24.0f) / 2.0f);
        int i12 = this.f30253l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f13 = this.f30247e;
        canvas.translate(-org.telegram.messenger.g0.L(0.66f), 0.0f);
        if (!this.f30249g) {
            float f14 = this.f30247e;
            if (this.f30245b) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f14 * i10);
        } else {
            float f15 = this.f30247e;
            if (this.f30245b) {
                i7 = -180;
            } else {
                i7 = 180;
            }
            canvas.rotate((f15 * i7) + 135.0f);
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
    public final void setAlpha(int i7) {
        this.f30244a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f30244a.setColorFilter(colorFilter);
    }
}
