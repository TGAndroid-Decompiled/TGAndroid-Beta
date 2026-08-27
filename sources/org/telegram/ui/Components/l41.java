package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

public final class l41 extends vv0 {

    public final int f30289a = UserConfig.selectedAccount;

    public boolean f30290b = false;

    public final float[] f30291c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};

    public final float[] f30292e = {0.0f, 0.0f, 0.0f};

    public long f30293f = 0;

    public boolean f30294g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();

    public boolean f30295i;

    public final Paint f30296j;

    public l41(boolean z10) {
        if (z10) {
            this.f30296j = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f30296j;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f30290b = z10;
    }

    @Override
    public final void d() {
        this.f30293f = System.currentTimeMillis();
        this.f30294g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int iDp;
        int i10;
        int i11 = getBounds().left;
        if (this.f30290b) {
            iDp = AndroidUtilities.dp(8.5f);
            i10 = getBounds().top;
        } else {
            iDp = AndroidUtilities.dp(9.3f);
            i10 = getBounds().top;
        }
        int i12 = iDp + i10;
        Paint paint = this.f30296j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.g6.f23032c2;
            paint.setAlpha(255);
        }
        float fDp = AndroidUtilities.dp(3.0f) + i11;
        float f10 = i12;
        float[] fArr = this.f30291c;
        canvas.drawCircle(fDp, f10, fArr[0] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + i11, f10, fArr[1] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(15.0f) + i11, f10, fArr[2] * AndroidUtilities.density, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.f30292e[i10] = 0.0f;
            this.f30291c[i10] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f30294g = false;
    }

    public final void f() {
        if (this.f30294g) {
            if (NotificationCenter.getInstance(this.f30289a).isAnimationInProgress() && !this.f30295i) {
                AndroidUtilities.runOnUIThread(new up0(this, 26), 100L);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - this.f30293f;
            this.f30293f = jCurrentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                float[] fArr = this.f30292e;
                float f10 = fArr[i10] + j10;
                fArr[i10] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i10];
                float[] fArr3 = this.f30291c;
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
        Paint paint = this.f30296j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
