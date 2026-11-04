package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
public final class p31 extends nu0 {
    public final int f37052a = org.telegram.messenger.h10.f22829t0;
    public boolean f37053b = false;
    public final float[] f37054c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] f37055e = {0.0f, 0.0f, 0.0f};
    public long f37056f = 0;
    public boolean f37057g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f37058i;
    public final Paint f37059j;

    public p31(boolean z10) {
        if (z10) {
            this.f37059j = new Paint(1);
        }
    }

    @Override
    public final void b(int i3) {
        Paint paint = this.f37059j;
        if (paint != null) {
            paint.setColor(i3);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f37053b = z10;
    }

    @Override
    public final void d() {
        this.f37056f = System.currentTimeMillis();
        this.f37057g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int i3;
        int i10 = getBounds().left;
        if (this.f37053b) {
            L = org.telegram.messenger.g0.L(8.5f);
            i3 = getBounds().top;
        } else {
            L = org.telegram.messenger.g0.L(9.3f);
            i3 = getBounds().top;
        }
        int i11 = L + i3;
        Paint paint = this.f37059j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.c2;
            paint.setAlpha(255);
        }
        float f10 = i11;
        float[] fArr = this.f37054c;
        canvas.drawCircle(org.telegram.messenger.g0.L(3.0f) + i10, f10, fArr[0] * org.telegram.messenger.g0.f22607p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + i10, f10, fArr[1] * org.telegram.messenger.g0.f22607p, paint);
        canvas.drawCircle(org.telegram.messenger.g0.L(15.0f) + i10, f10, fArr[2] * org.telegram.messenger.g0.f22607p, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i3 = 0; i3 < 3; i3++) {
            this.f37055e[i3] = 0.0f;
            this.f37054c[i3] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f37057g = false;
    }

    public final void f() {
        if (this.f37057g) {
            if (org.telegram.messenger.hs.f(this.f37052a).g() && !this.f37058i) {
                org.telegram.messenger.g0.i3(new sp0(this, 26), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f37056f;
            this.f37056f = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i3 = 0; i3 < 3; i3++) {
                float[] fArr = this.f37055e;
                float f10 = fArr[i3] + ((float) j10);
                fArr[i3] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i3];
                int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                float[] fArr3 = this.f37054c;
                if (i10 > 0) {
                    int i11 = (f11 > 320.0f ? 1 : (f11 == 320.0f ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i11 <= 0) {
                        fArr3[i3] = decelerateInterpolator.getInterpolation(f11 / 320.0f) + 1.33f;
                    } else if (f11 <= 640.0f) {
                        fArr3[i3] = (1.0f - decelerateInterpolator.getInterpolation((f11 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f11 >= 800.0f) {
                        fArr[i3] = 0.0f;
                        fArr2[i3] = 0.0f;
                        fArr3[i3] = 1.33f;
                    } else {
                        fArr3[i3] = 1.33f;
                    }
                } else {
                    fArr3[i3] = 1.33f;
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
        Paint paint = this.f37059j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i3) {
    }
}
