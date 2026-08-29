package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class dg0 extends dw0 {
    public boolean f27758a = false;
    public final Paint f27759b = new Paint(1);
    public final int f27760c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean f27761e = false;
    public final RectF f27762f = new RectF();
    public float f27763g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.c6 f27764i;

    public dg0(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = z10;
        this.f27764i = c6Var;
    }

    @Override
    public final void c(boolean z10) {
        this.f27758a = z10;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.f27761e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f9;
        int i11;
        int dp = AndroidUtilities.dp(10.0f);
        int dp2 = ((AndroidUtilities.dp(18.0f) - dp) / 2) + getBounds().top;
        if (!this.f27758a) {
            dp2 += AndroidUtilities.dp(1.0f);
        }
        int i12 = dp2;
        boolean z10 = this.h;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.g6.f23281p9;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.f23282pa;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.f27764i);
        Paint paint = this.f27759b;
        paint.setColor(v02);
        RectF rectF = this.f27762f;
        rectF.set(0.0f, i12, dp, i12 + dp);
        float f10 = this.f27763g;
        if (f10 < 0.5f) {
            f9 = org.telegram.ui.b.c(f10, 0.5f, 1.0f, 35.0f);
        } else {
            f9 = ((f10 - 0.5f) * 35.0f) / 0.5f;
        }
        int i13 = (int) f9;
        for (int i14 = 0; i14 < 3; i14++) {
            int dp3 = AndroidUtilities.dp(9.2f);
            float f11 = this.f27763g;
            float dp4 = (dp3 + (AndroidUtilities.dp(5.0f) * i14)) - (AndroidUtilities.dp(5.0f) * f11);
            if (i14 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f11 * 255.0f) / 0.5f)));
            } else if (i14 == 0) {
                if (f11 > 0.5f) {
                    paint.setAlpha((int) ((1.0f - ((f11 - 0.5f) / 0.5f)) * 255.0f));
                } else {
                    paint.setAlpha(255);
                }
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(dp4, (dp / 2) + i12, AndroidUtilities.dp(1.2f), paint);
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, i13, 360 - (i13 * 2), true, paint);
        if (z10) {
            i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.f23329s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i12) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f27763g = 0.0f;
        this.f27761e = false;
    }

    public final void f() {
        if (this.f27761e) {
            if (!NotificationCenter.getInstance(this.f27760c).isAnimationInProgress()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j10 > 50) {
                    j10 = 50;
                }
                if (this.f27763g >= 1.0f) {
                    this.f27763g = 0.0f;
                }
                float f9 = (((float) j10) / 300.0f) + this.f27763g;
                this.f27763g = f9;
                if (f9 > 1.0f) {
                    this.f27763g = 1.0f;
                }
                a();
                return;
            }
            AndroidUtilities.runOnUIThread(new xb0(this, 13), 100L);
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
