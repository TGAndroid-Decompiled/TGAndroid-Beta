package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class eh0 extends rx0 {
    public boolean f27865a = false;
    public final Paint f27866b = new Paint(1);
    public final int f27867c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean e = false;
    public final RectF f27868f = new RectF();
    public float f27869g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.u6 f27870i;

    public eh0(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        this.h = z10;
        this.f27870i = u6Var;
    }

    @Override
    public final void c(boolean z10) {
        this.f27865a = z10;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f7;
        int i11;
        int dp = AndroidUtilities.dp(10.0f);
        int dp2 = ((AndroidUtilities.dp(18.0f) - dp) / 2) + getBounds().top;
        if (!this.f27865a) {
            dp2 += AndroidUtilities.dp(1.0f);
        }
        int i12 = dp2;
        boolean z10 = this.h;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.y6.f23583p9;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.f23584pa;
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, this.f27870i);
        Paint paint = this.f27866b;
        paint.setColor(w02);
        RectF rectF = this.f27868f;
        rectF.set(0.0f, i12, dp, i12 + dp);
        float f10 = this.f27869g;
        float f11 = 0.5f;
        if (f10 < 0.5f) {
            f7 = org.telegram.messenger.vh.y(f10, 0.5f, 1.0f, 35.0f);
        } else {
            f7 = ((f10 - 0.5f) * 35.0f) / 0.5f;
        }
        int i13 = (int) f7;
        int i14 = 0;
        while (i14 < 3) {
            int dp3 = AndroidUtilities.dp(9.2f);
            float f12 = f11;
            float f13 = this.f27869g;
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
            i11 = org.telegram.ui.ActionBar.y6.f23356d6;
        } else {
            i11 = org.telegram.ui.ActionBar.y6.f23636s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i12) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f27869g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (!NotificationCenter.getInstance(this.f27867c).isAnimationInProgress()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j10 > 50) {
                    j10 = 50;
                }
                if (this.f27869g >= 1.0f) {
                    this.f27869g = 0.0f;
                }
                float f7 = (((float) j10) / 300.0f) + this.f27869g;
                this.f27869g = f7;
                if (f7 > 1.0f) {
                    this.f27869g = 1.0f;
                }
                a();
                return;
            }
            AndroidUtilities.runOnUIThread(new wa0(this, 15), 100L);
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
