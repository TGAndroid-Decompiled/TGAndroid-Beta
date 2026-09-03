package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class f51 extends mw0 {
    public final int f26791a = UserConfig.selectedAccount;
    public boolean f26792b = false;
    public final float[] f26793c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] f26794e = {0.0f, 0.0f, 0.0f};
    public long f26795f = 0;
    public boolean f26796g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f26797i;
    public final Paint f26798j;

    public f51(boolean z4) {
        if (z4) {
            this.f26798j = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f26798j;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z4) {
        this.f26792b = z4;
    }

    @Override
    public final void d() {
        this.f26795f = System.currentTimeMillis();
        this.f26796g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int i10;
        int i11 = getBounds().left;
        if (this.f26792b) {
            dp = AndroidUtilities.dp(8.5f);
            i10 = getBounds().top;
        } else {
            dp = AndroidUtilities.dp(9.3f);
            i10 = getBounds().top;
        }
        int i12 = dp + i10;
        Paint paint = this.f26798j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.k6.f21640c2;
            paint.setAlpha(255);
        }
        float f10 = i12;
        float[] fArr = this.f26793c;
        canvas.drawCircle(AndroidUtilities.dp(3.0f) + i11, f10, fArr[0] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + i11, f10, fArr[1] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(15.0f) + i11, f10, fArr[2] * AndroidUtilities.density, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.f26794e[i10] = 0.0f;
            this.f26793c[i10] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f26796g = false;
    }

    public final void f() {
        if (this.f26796g) {
            if (NotificationCenter.getInstance(this.f26791a).isAnimationInProgress() && !this.f26797i) {
                AndroidUtilities.runOnUIThread(new nq0(this, 26), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f26795f;
            this.f26795f = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                float[] fArr = this.f26794e;
                float f10 = fArr[i10] + ((float) j10);
                fArr[i10] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i10];
                float[] fArr3 = this.f26793c;
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
        Paint paint = this.f26798j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
