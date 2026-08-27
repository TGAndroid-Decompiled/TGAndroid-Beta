package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;

public final class uf0 extends vv0 {

    public boolean f33071a = false;

    public final Paint f33072b = new Paint(1);

    public final int f33073c = UserConfig.selectedAccount;
    public long d = 0;

    public boolean f33074e = false;

    public final RectF f33075f = new RectF();

    public float f33076g;
    public final boolean h;

    public final org.telegram.ui.ActionBar.c6 f33077i;

    public uf0(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        this.h = z10;
        this.f33077i = c6Var;
    }

    @Override
    public final void c(boolean z10) {
        this.f33071a = z10;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.f33074e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(10.0f);
        int iDp2 = ((AndroidUtilities.dp(18.0f) - iDp) / 2) + getBounds().top;
        if (!this.f33071a) {
            iDp2 += AndroidUtilities.dp(1.0f);
        }
        int i10 = iDp2;
        boolean z10 = this.h;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(z10 ? org.telegram.ui.ActionBar.g6.p9 : org.telegram.ui.ActionBar.g6.f23271pa, this.f33077i);
        Paint paint = this.f33072b;
        paint.setColor(iV0);
        RectF rectF = this.f33075f;
        rectF.set(0.0f, i10, iDp, i10 + iDp);
        float f10 = this.f33076g;
        int iT = (int) (f10 < 0.5f ? org.telegram.messenger.rl.t(f10, 0.5f, 1.0f, 35.0f) : ((f10 - 0.5f) * 35.0f) / 0.5f);
        for (int i11 = 0; i11 < 3; i11++) {
            float fDp = AndroidUtilities.dp(9.2f) + (AndroidUtilities.dp(5.0f) * i11);
            float fDp2 = AndroidUtilities.dp(5.0f);
            float f11 = this.f33076g;
            float f12 = fDp - (fDp2 * f11);
            if (i11 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f11 * 255.0f) / 0.5f)));
            } else if (i11 != 0) {
                paint.setAlpha(255);
            } else if (f11 > 0.5f) {
                paint.setAlpha((int) ((1.0f - ((f11 - 0.5f) / 0.5f)) * 255.0f));
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(f12, (iDp / 2) + i10, AndroidUtilities.dp(1.2f), paint);
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, iT, 360 - (iT * 2), true, paint);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, z10 ? org.telegram.ui.ActionBar.g6.f23053d6 : org.telegram.ui.ActionBar.g6.f23322s8, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((iDp / 2) + i10) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f33076g = 0.0f;
        this.f33074e = false;
    }

    public final void f() {
        if (this.f33074e) {
            if (NotificationCenter.getInstance(this.f33073c).isAnimationInProgress()) {
                AndroidUtilities.runOnUIThread(new mb0(this, 13), 100L);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - this.d;
            this.d = jCurrentTimeMillis;
            if (j10 > 50) {
                j10 = 50;
            }
            if (this.f33076g >= 1.0f) {
                this.f33076g = 0.0f;
            }
            float f10 = (j10 / 300.0f) + this.f33076g;
            this.f33076g = f10;
            if (f10 > 1.0f) {
                this.f33076g = 1.0f;
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
