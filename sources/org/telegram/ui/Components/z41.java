package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
public final class z41 extends rv0 {
    public final int f32994a = org.telegram.messenger.e20.f15506s0;
    public boolean f32995b = false;
    public final float[] f32996c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] e = {0.0f, 0.0f, 0.0f};
    public long f32997f = 0;
    public boolean f32998g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f32999i;
    public final Paint f33000j;

    public z41(boolean z10) {
        if (z10) {
            this.f33000j = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f33000j;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f32995b = z10;
    }

    @Override
    public final void d() {
        this.f32997f = System.currentTimeMillis();
        this.f32998g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int L;
        int i10;
        int i11 = getBounds().left;
        if (this.f32995b) {
            L = org.telegram.messenger.i0.L(8.5f);
            i10 = getBounds().top;
        } else {
            L = org.telegram.messenger.i0.L(9.3f);
            i10 = getBounds().top;
        }
        int i12 = L + i10;
        Paint paint = this.f33000j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.t6.f20907c2;
            paint.setAlpha(255);
        }
        float f7 = i12;
        float[] fArr = this.f32996c;
        canvas.drawCircle(org.telegram.messenger.i0.L(3.0f) + i11, f7, fArr[0] * org.telegram.messenger.i0.f16171p, paint);
        canvas.drawCircle(org.telegram.messenger.i0.L(9.0f) + i11, f7, fArr[1] * org.telegram.messenger.i0.f16171p, paint);
        canvas.drawCircle(org.telegram.messenger.i0.L(15.0f) + i11, f7, fArr[2] * org.telegram.messenger.i0.f16171p, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.e[i10] = 0.0f;
            this.f32996c[i10] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f32998g = false;
    }

    public final void f() {
        if (this.f32998g) {
            if (org.telegram.messenger.at.f(this.f32994a).g() && !this.f32999i) {
                org.telegram.messenger.i0.h3(new vo0(this, 29), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f32997f;
            this.f32997f = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                float[] fArr = this.e;
                float f7 = fArr[i10] + ((float) j10);
                fArr[i10] = f7;
                float[] fArr2 = this.d;
                float f10 = f7 - fArr2[i10];
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                float[] fArr3 = this.f32996c;
                if (i11 > 0) {
                    int i12 = (f10 > 320.0f ? 1 : (f10 == 320.0f ? 0 : -1));
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (i12 <= 0) {
                        fArr3[i10] = decelerateInterpolator.getInterpolation(f10 / 320.0f) + 1.33f;
                    } else if (f10 <= 640.0f) {
                        fArr3[i10] = (1.0f - decelerateInterpolator.getInterpolation((f10 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f10 >= 800.0f) {
                        fArr[i10] = 0.0f;
                        fArr2[i10] = 0.0f;
                        fArr3[i10] = 1.33f;
                    } else {
                        fArr3[i10] = 1.33f;
                    }
                } else {
                    fArr3[i10] = 1.33f;
                }
            }
            a();
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.i0.L(18.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f33000j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
