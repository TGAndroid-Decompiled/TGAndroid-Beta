package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public final class x1 extends Drawable {
    public final Paint f29856a;
    public boolean f29857b;
    public long f29858c;
    public float d;
    public float f29859e;
    public int f29860f;
    public final boolean f29861g;
    public final DecelerateInterpolator h;
    public int f29862i;
    public int f29863j;
    public float f29864k;
    public int f29865l;

    public x1(boolean z10) {
        Paint paint = new Paint(1);
        this.f29856a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f29862i = -1;
        this.f29863j = -9079435;
        this.f29864k = 300.0f;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint2.setColor(-65536);
        this.f29861g = z10;
    }

    public final void a(int i7) {
        this.f29862i = i7;
        invalidateSelf();
    }

    public final void b(int i7) {
        this.f29863j = i7;
        invalidateSelf();
    }

    public final void c(boolean z10, float f10) {
        this.f29858c = 0L;
        float f11 = this.f29859e;
        if (f11 == 1.0f) {
            this.f29857b = true;
        } else if (f11 == 0.0f) {
            this.f29857b = false;
        }
        this.f29858c = 0L;
        if (z10) {
            if (f11 < f10) {
                this.f29860f = (int) (f11 * this.f29864k);
            } else {
                this.f29860f = (int) ((1.0f - f11) * this.f29864k);
            }
            this.f29858c = System.currentTimeMillis();
            this.d = f10;
        } else {
            this.f29859e = f10;
            this.d = f10;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i7;
        int i10;
        if (this.f29859e != this.d) {
            if (this.f29858c != 0) {
                int currentTimeMillis = this.f29860f + ((int) (System.currentTimeMillis() - this.f29858c));
                this.f29860f = currentTimeMillis;
                float f10 = currentTimeMillis;
                float f11 = this.f29864k;
                if (f10 >= f11) {
                    this.f29859e = this.d;
                } else {
                    int i11 = (this.f29859e > this.d ? 1 : (this.f29859e == this.d ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i11 < 0) {
                        this.f29859e = decelerateInterpolator.getInterpolation(f10 / f11) * this.d;
                    } else {
                        this.f29859e = 1.0f - decelerateInterpolator.getInterpolation(f10 / f11);
                    }
                }
            }
            this.f29858c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f12 = i0.a.f(this.f29859e, this.f29862i, this.f29863j);
        Paint paint = this.f29856a;
        paint.setColor(f12);
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(24.0f) / 2.0f, org.telegram.messenger.g0.L(24.0f) / 2.0f);
        int i12 = this.f29865l;
        if (i12 != 0) {
            canvas.rotate(i12);
        }
        float f13 = this.f29859e;
        canvas.translate(-org.telegram.messenger.g0.L(0.66f), 0.0f);
        if (!this.f29861g) {
            float f14 = this.f29859e;
            if (this.f29857b) {
                i10 = -225;
            } else {
                i10 = 135;
            }
            canvas.rotate(f14 * i10);
        } else {
            float f15 = this.f29859e;
            if (this.f29857b) {
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
        this.f29856a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f29856a.setColorFilter(colorFilter);
    }
}
