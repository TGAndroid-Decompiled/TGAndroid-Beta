package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public final class y1 extends Drawable {
    public final Paint f28763a;
    public boolean f28764b;
    public long f28765c;
    public float d;
    public float f28766e;
    public int f28767f;
    public final boolean f28768g;
    public final DecelerateInterpolator h;
    public int f28769i;
    public int f28770j;
    public float f28771k;
    public int f28772l;

    public y1(boolean z9) {
        Paint paint = new Paint(1);
        this.f28763a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f28769i = -1;
        this.f28770j = -9079435;
        this.f28771k = 300.0f;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setColor(-65536);
        this.f28768g = z9;
    }

    public final void a(int i7) {
        this.f28769i = i7;
        invalidateSelf();
    }

    public final void b(int i7) {
        this.f28770j = i7;
        invalidateSelf();
    }

    public final void c(boolean z9, float f10) {
        this.f28765c = 0L;
        float f11 = this.f28766e;
        if (f11 == 1.0f) {
            this.f28764b = true;
        } else if (f11 == 0.0f) {
            this.f28764b = false;
        }
        this.f28765c = 0L;
        if (z9) {
            if (f11 < f10) {
                this.f28767f = (int) (f11 * this.f28771k);
            } else {
                this.f28767f = (int) ((1.0f - f11) * this.f28771k);
            }
            this.f28765c = System.currentTimeMillis();
            this.d = f10;
        } else {
            this.f28766e = f10;
            this.d = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        int i10;
        if (this.f28766e != this.d) {
            if (this.f28765c != 0) {
                int currentTimeMillis = this.f28767f + ((int) (System.currentTimeMillis() - this.f28765c));
                this.f28767f = currentTimeMillis;
                float f10 = currentTimeMillis;
                float f11 = this.f28771k;
                if (f10 >= f11) {
                    this.f28766e = this.d;
                } else {
                    int i11 = (this.f28766e > this.d ? 1 : (this.f28766e == this.d ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i11 < 0) {
                        this.f28766e = decelerateInterpolator.getInterpolation(f10 / f11) * this.d;
                    } else {
                        this.f28766e = 1.0f - decelerateInterpolator.getInterpolation(f10 / f11);
                    }
                }
            }
            this.f28765c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f12 = i0.a.f(this.f28766e, this.f28769i, this.f28770j);
        Paint paint = this.f28763a;
        paint.setColor(f12);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(24.0f) / 2.0f, org.telegram.messenger.g0.L(24.0f) / 2.0f);
        int i12 = this.f28772l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f13 = this.f28766e;
        canvas.translate(-org.telegram.messenger.g0.L(0.66f), 0.0f);
        if (!this.f28768g) {
            float f14 = this.f28766e;
            if (this.f28764b) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f14 * i10);
        } else {
            float f15 = this.f28766e;
            if (this.f28764b) {
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
        this.f28763a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f28763a.setColorFilter(colorFilter);
    }
}
