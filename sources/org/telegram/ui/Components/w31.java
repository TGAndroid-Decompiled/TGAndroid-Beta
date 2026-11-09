package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
public final class w31 extends qu0 {
    public final int f39891a = org.telegram.messenger.p10.f24470s0;
    public boolean f39892b = false;
    public final float[] f39893c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] f39894e = {0.0f, 0.0f, 0.0f};
    public long f39895f = 0;
    public boolean f39896g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f39897i;
    public final Paint f39898j;

    public w31(boolean z9) {
        if (z9) {
            this.f39898j = new Paint(1);
        }
    }

    @Override
    public final void b(int i7) {
        Paint paint = this.f39898j;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    @Override
    public final void c(boolean z9) {
        this.f39892b = z9;
    }

    @Override
    public final void d() {
        this.f39895f = System.currentTimeMillis();
        this.f39896g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int i7;
        int i10 = getBounds().left;
        if (this.f39892b) {
            L = org.telegram.messenger.g0.L(8.5f);
            i7 = getBounds().top;
        } else {
            L = org.telegram.messenger.g0.L(9.3f);
            i7 = getBounds().top;
        }
        int i11 = L + i7;
        Paint paint = this.f39898j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.l6.f27843c2;
            paint.setAlpha(255);
        }
        float f10 = i11;
        float[] fArr = this.f39893c;
        canvas.drawCircle(org.telegram.messenger.g0.L(3.0f) + i10, f10, fArr[0] * org.telegram.messenger.g0.f22562p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + i10, f10, fArr[1] * org.telegram.messenger.g0.f22562p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(15.0f) + i10, f10, fArr[2] * org.telegram.messenger.g0.f22562p, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i7 = 0; i7 < 3; i7++) {
            this.f39894e[i7] = 0.0f;
            this.f39893c[i7] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f39896g = false;
    }

    public final void f() {
        if (this.f39896g) {
            if (org.telegram.messenger.qs.f(this.f39891a).g() && !this.f39897i) {
                org.telegram.messenger.g0.i3(new kr0(this, 25), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f39895f;
            this.f39895f = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            for (int i7 = 0; i7 < 3; i7++) {
                float[] fArr = this.f39894e;
                float f10 = fArr[i7] + ((float) j3);
                fArr[i7] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i7];
                int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                float[] fArr3 = this.f39893c;
                if (i10 > 0) {
                    int i11 = (f11 > 320.0f ? 1 : (f11 == 320.0f ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i11 <= 0) {
                        fArr3[i7] = decelerateInterpolator.getInterpolation(f11 / 320.0f) + 1.33f;
                    } else if (f11 <= 640.0f) {
                        fArr3[i7] = (1.0f - decelerateInterpolator.getInterpolation((f11 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f11 >= 800.0f) {
                        fArr[i7] = 0.0f;
                        fArr2[i7] = 0.0f;
                        fArr3[i7] = 1.33f;
                    } else {
                        fArr3[i7] = 1.33f;
                    }
                } else {
                    fArr3[i7] = 1.33f;
                }
            }
            a();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(18.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f39898j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
