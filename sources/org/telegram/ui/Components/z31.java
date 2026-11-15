package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
public final class z31 extends qu0 {
    public final int f42231a = org.telegram.messenger.m10.f24940t0;
    public boolean f42232b = false;
    public final float[] f42233c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] f42234e = {0.0f, 0.0f, 0.0f};
    public long f42235f = 0;
    public boolean f42236g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f42237i;
    public final Paint f42238j;

    public z31(boolean z10) {
        if (z10) {
            this.f42238j = new Paint(1);
        }
    }

    @Override
    public final void b(int i7) {
        Paint paint = this.f42238j;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f42232b = z10;
    }

    @Override
    public final void d() {
        this.f42235f = System.currentTimeMillis();
        this.f42236g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int i7;
        int i10 = getBounds().left;
        if (this.f42232b) {
            L = org.telegram.messenger.g0.L(8.5f);
            i7 = getBounds().top;
        } else {
            L = org.telegram.messenger.g0.L(9.3f);
            i7 = getBounds().top;
        }
        int i11 = L + i7;
        Paint paint = this.f42238j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.f28827c2;
            paint.setAlpha(255);
        }
        float f10 = i11;
        float[] fArr = this.f42233c;
        canvas.drawCircle(org.telegram.messenger.g0.L(3.0f) + i10, f10, fArr[0] * org.telegram.messenger.g0.f23610p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + i10, f10, fArr[1] * org.telegram.messenger.g0.f23610p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(15.0f) + i10, f10, fArr[2] * org.telegram.messenger.g0.f23610p, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i7 = 0; i7 < 3; i7++) {
            this.f42234e[i7] = 0.0f;
            this.f42233c[i7] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f42236g = false;
    }

    public final void f() {
        if (this.f42236g) {
            if (org.telegram.messenger.ns.f(this.f42231a).g() && !this.f42237i) {
                org.telegram.messenger.g0.i3(new ro0(this, 28), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f42235f;
            this.f42235f = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            for (int i7 = 0; i7 < 3; i7++) {
                float[] fArr = this.f42234e;
                float f10 = fArr[i7] + ((float) j3);
                fArr[i7] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i7];
                int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                float[] fArr3 = this.f42233c;
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
        Paint paint = this.f42238j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
