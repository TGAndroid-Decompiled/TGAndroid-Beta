package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
public final class j41 extends yu0 {
    public final int f36329a = org.telegram.messenger.j10.f24770t0;
    public boolean f36330b = false;
    public final float[] f36331c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] f36332e = {0.0f, 0.0f, 0.0f};
    public long f36333f = 0;
    public boolean f36334g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f36335i;
    public final Paint f36336j;

    public j41(boolean z10) {
        if (z10) {
            this.f36336j = new Paint(1);
        }
    }

    @Override
    public final void b(int i7) {
        Paint paint = this.f36336j;
        if (paint != null) {
            paint.setColor(i7);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f36330b = z10;
    }

    @Override
    public final void d() {
        this.f36333f = System.currentTimeMillis();
        this.f36334g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int i7;
        int i10 = getBounds().left;
        if (this.f36330b) {
            L = org.telegram.messenger.g0.L(8.5f);
            i7 = getBounds().top;
        } else {
            L = org.telegram.messenger.g0.L(9.3f);
            i7 = getBounds().top;
        }
        int i11 = L + i7;
        Paint paint = this.f36336j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.n6.f29372c2;
            paint.setAlpha(255);
        }
        float f10 = i11;
        float[] fArr = this.f36331c;
        canvas.drawCircle(org.telegram.messenger.g0.L(3.0f) + i10, f10, fArr[0] * org.telegram.messenger.g0.f24117p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + i10, f10, fArr[1] * org.telegram.messenger.g0.f24117p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(15.0f) + i10, f10, fArr[2] * org.telegram.messenger.g0.f24117p, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i7 = 0; i7 < 3; i7++) {
            this.f36332e[i7] = 0.0f;
            this.f36331c[i7] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f36334g = false;
    }

    public final void f() {
        if (this.f36334g) {
            if (org.telegram.messenger.ks.f(this.f36329a).g() && !this.f36335i) {
                org.telegram.messenger.g0.h3(new ap0(this, 27), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f36333f;
            this.f36333f = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            for (int i7 = 0; i7 < 3; i7++) {
                float[] fArr = this.f36332e;
                float f10 = fArr[i7] + ((float) j3);
                fArr[i7] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i7];
                int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                float[] fArr3 = this.f36331c;
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
        Paint paint = this.f36336j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i7) {
    }
}
