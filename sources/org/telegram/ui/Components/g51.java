package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class g51 extends mw0 {
    public final int f25056a = UserConfig.selectedAccount;
    public boolean f25057b = false;
    public final float[] f25058c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] e = {0.0f, 0.0f, 0.0f};
    public long f25059f = 0;
    public boolean f25060g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f25061i;
    public final Paint f25062j;

    public g51(boolean z4) {
        if (z4) {
            this.f25062j = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f25062j;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z4) {
        this.f25057b = z4;
    }

    @Override
    public final void d() {
        this.f25059f = System.currentTimeMillis();
        this.f25060g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int i10;
        int i11 = getBounds().left;
        if (this.f25057b) {
            dp = AndroidUtilities.dp(8.5f);
            i10 = getBounds().top;
        } else {
            dp = AndroidUtilities.dp(9.3f);
            i10 = getBounds().top;
        }
        int i12 = dp + i10;
        Paint paint = this.f25062j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.j6.f19860c2;
            paint.setAlpha(255);
        }
        float f10 = i12;
        float[] fArr = this.f25058c;
        canvas.drawCircle(AndroidUtilities.dp(3.0f) + i11, f10, fArr[0] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + i11, f10, fArr[1] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(15.0f) + i11, f10, fArr[2] * AndroidUtilities.density, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.e[i10] = 0.0f;
            this.f25058c[i10] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f25060g = false;
    }

    public final void f() {
        if (this.f25060g) {
            if (NotificationCenter.getInstance(this.f25056a).isAnimationInProgress() && !this.f25061i) {
                AndroidUtilities.runOnUIThread(new nq0(this, 26), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f25059f;
            this.f25059f = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                float[] fArr = this.e;
                float f10 = fArr[i10] + ((float) j10);
                fArr[i10] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i10];
                float[] fArr3 = this.f25058c;
                if (f11 > 0.0f) {
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 <= 320.0f) {
                        fArr3[i10] = decelerateInterpolator.getInterpolation(f11 / 320.0f) + 1.33f;
                    } else if (f11 <= 640.0f) {
                        fArr3[i10] = (1.0f - decelerateInterpolator.getInterpolation((f11 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f11 >= 800.0f) {
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
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.f25062j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
