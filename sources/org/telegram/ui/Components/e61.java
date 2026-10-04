package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class e61 extends hx0 {
    public final int f25972a = UserConfig.selectedAccount;
    public boolean f25973b = false;
    public final float[] f25974c = new float[3];
    public final float[] d = {0.0f, 150.0f, 300.0f};
    public final float[] f25975e = {0.0f, 0.0f, 0.0f};
    public long f25976f = 0;
    public boolean f25977g = false;
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public boolean f25978i;
    public final Paint f25979j;

    public e61(boolean z10) {
        if (z10) {
            this.f25979j = new Paint(1);
        }
    }

    @Override
    public final void b(int i10) {
        Paint paint = this.f25979j;
        if (paint != null) {
            paint.setColor(i10);
        }
    }

    @Override
    public final void c(boolean z10) {
        this.f25973b = z10;
    }

    @Override
    public final void d() {
        this.f25976f = System.currentTimeMillis();
        this.f25977g = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        int i10;
        int i11 = getBounds().left;
        if (this.f25973b) {
            dp = AndroidUtilities.dp(8.5f);
            i10 = getBounds().top;
        } else {
            dp = AndroidUtilities.dp(9.3f);
            i10 = getBounds().top;
        }
        int i12 = dp + i10;
        Paint paint = this.f25979j;
        if (paint == null) {
            paint = org.telegram.ui.ActionBar.i6.f20795c2;
            paint.setAlpha(255);
        }
        float f7 = i12;
        float[] fArr = this.f25974c;
        canvas.drawCircle(AndroidUtilities.dp(3.0f) + i11, f7, fArr[0] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(9.0f) + i11, f7, fArr[1] * AndroidUtilities.density, paint);
        canvas.drawCircle(AndroidUtilities.dp(15.0f) + i11, f7, fArr[2] * AndroidUtilities.density, paint);
        f();
    }

    @Override
    public final void e() {
        for (int i10 = 0; i10 < 3; i10++) {
            this.f25975e[i10] = 0.0f;
            this.f25974c[i10] = 1.33f;
        }
        float[] fArr = this.d;
        fArr[0] = 0.0f;
        fArr[1] = 150.0f;
        fArr[2] = 300.0f;
        this.f25977g = false;
    }

    public final void f() {
        if (this.f25977g) {
            if (NotificationCenter.getInstance(this.f25972a).isAnimationInProgress() && !this.f25978i) {
                AndroidUtilities.runOnUIThread(new br0(this, 28), 100L);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f25976f;
            this.f25976f = currentTimeMillis;
            if (j3 > 50) {
                j3 = 50;
            }
            for (int i10 = 0; i10 < 3; i10++) {
                float[] fArr = this.f25975e;
                float f7 = fArr[i10] + ((float) j3);
                fArr[i10] = f7;
                float[] fArr2 = this.d;
                float f10 = f7 - fArr2[i10];
                float[] fArr3 = this.f25974c;
                if (f10 > 0.0f) {
                    DecelerateInterpolator decelerateInterpolator = this.h;
                    if (f10 <= 320.0f) {
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
        Paint paint = this.f25979j;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setAlpha(int i10) {
    }
}
