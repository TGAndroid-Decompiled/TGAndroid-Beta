package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class ng0 extends mw0 {
    public boolean f27281a = false;
    public final Paint f27282b = new Paint(1);
    public final int f27283c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean e = false;
    public final RectF f27284f = new RectF();
    public float f27285g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 f27286i;

    public ng0(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        this.h = z4;
        this.f27286i = f6Var;
    }

    @Override
    public final void c(boolean z4) {
        this.f27281a = z4;
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
        float f10;
        int i11;
        int dp = AndroidUtilities.dp(10.0f);
        int dp2 = ((AndroidUtilities.dp(18.0f) - dp) / 2) + getBounds().top;
        if (!this.f27281a) {
            dp2 += AndroidUtilities.dp(1.0f);
        }
        int i12 = dp2;
        boolean z4 = this.h;
        if (z4) {
            i10 = org.telegram.ui.ActionBar.j6.f20124p9;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f20125pa;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f27286i);
        Paint paint = this.f27282b;
        paint.setColor(v02);
        RectF rectF = this.f27284f;
        rectF.set(0.0f, i12, dp, i12 + dp);
        float f11 = this.f27285g;
        if (f11 < 0.5f) {
            f10 = org.telegram.ui.b.c(f11, 0.5f, 1.0f, 35.0f);
        } else {
            f10 = ((f11 - 0.5f) * 35.0f) / 0.5f;
        }
        int i13 = (int) f10;
        for (int i14 = 0; i14 < 3; i14++) {
            int dp3 = AndroidUtilities.dp(9.2f);
            float f12 = this.f27285g;
            float dp4 = (dp3 + (AndroidUtilities.dp(5.0f) * i14)) - (AndroidUtilities.dp(5.0f) * f12);
            if (i14 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f12 * 255.0f) / 0.5f)));
            } else if (i14 == 0) {
                if (f12 > 0.5f) {
                    paint.setAlpha((int) ((1.0f - ((f12 - 0.5f) / 0.5f)) * 255.0f));
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
        if (z4) {
            i11 = org.telegram.ui.ActionBar.j6.f19906d6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f20176s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i12) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f27285g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (!NotificationCenter.getInstance(this.f27283c).isAnimationInProgress()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j10 > 50) {
                    j10 = 50;
                }
                if (this.f27285g >= 1.0f) {
                    this.f27285g = 0.0f;
                }
                float f10 = (((float) j10) / 300.0f) + this.f27285g;
                this.f27285g = f10;
                if (f10 > 1.0f) {
                    this.f27285g = 1.0f;
                }
                a();
                return;
            }
            AndroidUtilities.runOnUIThread(new cc0(this, 13), 100L);
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
