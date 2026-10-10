package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class jh0 extends px0 {
    public boolean f27680a = false;
    public final Paint f27681b = new Paint(1);
    public final int f27682c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean f27683e = false;
    public final RectF f27684f = new RectF();
    public float f27685g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.e6 f27686i;

    public jh0(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        this.h = z10;
        this.f27686i = e6Var;
    }

    @Override
    public final void c(boolean z10) {
        this.f27680a = z10;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.f27683e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f7;
        int i11;
        int dp = AndroidUtilities.dp(10.0f);
        int dp2 = ((AndroidUtilities.dp(18.0f) - dp) / 2) + getBounds().top;
        if (!this.f27680a) {
            dp2 += AndroidUtilities.dp(1.0f);
        }
        int i12 = dp2;
        boolean z10 = this.h;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.i6.f21024p9;
        } else {
            i10 = org.telegram.ui.ActionBar.i6.f21025pa;
        }
        int w02 = org.telegram.ui.ActionBar.i6.w0(i10, this.f27686i);
        Paint paint = this.f27681b;
        paint.setColor(w02);
        RectF rectF = this.f27684f;
        rectF.set(0.0f, i12, dp, i12 + dp);
        float f10 = this.f27685g;
        float f11 = 0.5f;
        if (f10 < 0.5f) {
            f7 = org.telegram.messenger.bi.y(f10, 0.5f, 1.0f, 35.0f);
        } else {
            f7 = ((f10 - 0.5f) * 35.0f) / 0.5f;
        }
        int i13 = (int) f7;
        int i14 = 0;
        while (i14 < 3) {
            int dp3 = AndroidUtilities.dp(9.2f);
            float f12 = f11;
            float f13 = this.f27685g;
            float dp4 = (dp3 + (AndroidUtilities.dp(5.0f) * i14)) - (AndroidUtilities.dp(5.0f) * f13);
            if (i14 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f13 * 255.0f) / f12)));
            } else if (i14 == 0) {
                if (f13 > f12) {
                    paint.setAlpha((int) ((1.0f - ((f13 - f12) / f12)) * 255.0f));
                } else {
                    paint.setAlpha(255);
                }
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(dp4, (dp / 2) + i12, AndroidUtilities.dp(1.2f), paint);
            i14++;
            f11 = f12;
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, i13, 360 - (i13 * 2), true, paint);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.i6.f20801d6;
        } else {
            i11 = org.telegram.ui.ActionBar.i6.f21079s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i12) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f27685g = 0.0f;
        this.f27683e = false;
    }

    public final void f() {
        if (this.f27683e) {
            if (!NotificationCenter.getInstance(this.f27682c).isAnimationInProgress()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j3 > 50) {
                    j3 = 50;
                }
                if (this.f27685g >= 1.0f) {
                    this.f27685g = 0.0f;
                }
                float f7 = (((float) j3) / 300.0f) + this.f27685g;
                this.f27685g = f7;
                if (f7 > 1.0f) {
                    this.f27685g = 1.0f;
                }
                a();
                return;
            }
            AndroidUtilities.runOnUIThread(new cd0(this, 13), 100L);
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(20.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void b(int i10) {
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
