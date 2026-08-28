package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class j41 extends tv0 {
    public final int f29627a = UserConfig.selectedAccount;
    public boolean f29628b = false;
    public final float[] f29629c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] f29630e = {0.0f, 0.0f, 0.0f};
    public long f29631f = 0;
    public boolean f29632g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f29633i;
    public final Paint f29634j;

    public j41(boolean z10) {
        if (z10) {
            this.f29634j = new Paint(1);
        }
    }

    @Override
    public final void b(int i9) {
        Paint paint = this.f29634j;
        if (paint != null) {
            paint.setColor(i9);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f29628b = z10;
    }

    @Override
    public final void d() {
        this.f29631f = System.currentTimeMillis();
        this.f29632g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int i9;
        int i10 = getBounds().left;
        if (this.f29628b) {
            dp = AndroidUtilities.dp(8.5f);
            i9 = getBounds().top;
        } else {
            dp = AndroidUtilities.dp(9.3f);
            i9 = getBounds().top;
        }
        int i11 = dp + i9;
        Paint paint = this.f29634j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.f6.f22979c2;
            paint.setAlpha(255);
        }
        float f10 = i11;
        float[] fArr = this.f29629c;
        canvas.drawCircle(AndroidUtilities.dp(3.0f) + i10, f10, fArr[0] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + i10, f10, fArr[1] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(15.0f) + i10, f10, fArr[2] * AndroidUtilities.density, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i9 = 0; i9 < 3; i9++) {
            this.f29630e[i9] = 0.0f;
            this.f29629c[i9] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f29632g = false;
    }

    public final void f() {
        if (this.f29632g) {
            if (NotificationCenter.getInstance(this.f29627a).isAnimationInProgress() && !this.f29633i) {
                AndroidUtilities.runOnUIThread(new tp0(this, 26), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f29631f;
            this.f29631f = currentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            for (int i9 = 0; i9 < 3; i9++) {
                float[] fArr = this.f29630e;
                float f10 = fArr[i9] + ((float) j10);
                fArr[i9] = f10;
                float[] fArr2 = this.d;
                float f11 = f10 - fArr2[i9];
                float[] fArr3 = this.f29629c;
                if (f11 > 0.0f) {
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f11 <= 320.0f) {
                        fArr3[i9] = decelerateInterpolator.getInterpolation(f11 / 320.0f) + 1.33f;
                    } else if (f11 <= 640.0f) {
                        fArr3[i9] = (1.0f - decelerateInterpolator.getInterpolation((f11 - 320.0f) / 320.0f)) + 1.33f;
                    } else if (f11 >= 800.0f) {
                        fArr[i9] = 0.0f;
                        fArr2[i9] = 0.0f;
                        fArr3[i9] = 1.33f;
                    } else {
                        fArr3[i9] = 1.33f;
                    }
                } else {
                    fArr3[i9] = 1.33f;
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
        Paint paint = this.f29634j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i9) {
    }
}
