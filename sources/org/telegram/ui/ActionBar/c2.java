package org.telegram.ui.ActionBar;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
public final class c2 extends Drawable {
    public final Paint f20195a;
    public boolean f20196b;
    public long f20197c;
    public float d;
    public float e;
    public int f20198f;
    public final boolean f20199g;
    public final DecelerateInterpolator h;
    public int f20200i;
    public int f20201j;
    public float f20202k;
    public int f20203l;

    public c2(boolean z10) {
        Paint paint = new Paint(1);
        this.f20195a = paint;
        Paint paint2 = new Paint(1);
        this.h = new DecelerateInterpolator();
        this.f20200i = -1;
        this.f20201j = -9079435;
        this.f20202k = 300.0f;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint2.setColor(-65536);
        this.f20199g = z10;
    }

    public final void a(int i10) {
        this.f20200i = i10;
        invalidateSelf();
    }

    public final void b(int i10) {
        this.f20201j = i10;
        invalidateSelf();
    }

    public final void c(boolean z10, float f7) {
        this.f20197c = 0L;
        float f10 = this.e;
        if (f10 == 1.0f) {
            this.f20196b = true;
        } else if (f10 == 0.0f) {
            this.f20196b = false;
        }
        this.f20197c = 0L;
        if (z10) {
            if (f10 < f7) {
                this.f20198f = (int) (f10 * this.f20202k);
            } else {
                this.f20198f = (int) ((1.0f - f10) * this.f20202k);
            }
            this.f20197c = System.currentTimeMillis();
            this.d = f7;
        } else {
            this.e = f7;
            this.d = f7;
        }
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        if (this.e != this.d) {
            if (this.f20197c != 0) {
                int currentTimeMillis = this.f20198f + ((int) (System.currentTimeMillis() - this.f20197c));
                this.f20198f = currentTimeMillis;
                float f7 = currentTimeMillis;
                float f10 = this.f20202k;
                if (f7 >= f10) {
                    this.e = this.d;
                } else {
                    int i12 = (this.e > this.d ? 1 : (this.e == this.d ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i12 < 0) {
                        this.e = decelerateInterpolator.getInterpolation(f7 / f10) * this.d;
                    } else {
                        this.e = 1.0f - decelerateInterpolator.getInterpolation(f7 / f10);
                    }
                }
            }
            this.f20197c = System.currentTimeMillis();
            invalidateSelf();
        }
        int f11 = i0.b.f(this.e, this.f20200i, this.f20201j);
        Paint paint = this.f20195a;
        paint.setColor(f11);
        canvas.save();
        canvas.translate(org.telegram.messenger.i0.L(24.0f) / 2.0f, org.telegram.messenger.i0.L(24.0f) / 2.0f);
        int i13 = this.f20203l;
        if (i13 != 0) {
            canvas.rotate(i13);
        }
        float f12 = this.e;
        canvas.translate(-org.telegram.messenger.i0.L(0.66f), 0.0f);
        if (!this.f20199g) {
            float f13 = this.e;
            if (this.f20196b) {
                i11 = -225;
            } else {
                i11 = 135;
            }
            canvas.rotate(f13 * i11);
        } else {
            float f14 = this.e;
            if (this.f20196b) {
                i10 = -180;
            } else {
                i10 = 180;
            }
            canvas.rotate((f14 * i10) + 135.0f);
            f12 = 1.0f;
        }
        float f15 = 1.0f - f12;
        canvas.drawLine(org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-6.75f, -8.0f, f12)), 0.0f, org.telegram.messenger.i0.L(8.0f) - ((paint.getStrokeWidth() / 2.0f) * f15), 0.0f, paint);
        float L = org.telegram.messenger.i0.L(-0.25f);
        float L2 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(7.0f, 8.0f, f12)) - ((paint.getStrokeWidth() / 4.0f) * f15);
        float L3 = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-7.25f, 0.0f, f12));
        canvas.drawLine(L3, -L, 0.0f, -L2, paint);
        canvas.drawLine(L3, L, 0.0f, L2, paint);
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f20195a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f20195a.setColorFilter(colorFilter);
    }
}
