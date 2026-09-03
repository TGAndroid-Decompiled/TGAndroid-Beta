package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class pg0 extends mw0 {
    public boolean f30088a = false;
    public final Paint f30089b = new Paint(1);
    public final int f30090c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean f30091e = false;
    public final RectF f30092f = new RectF();
    public float f30093g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.g6 f30094i;

    public pg0(org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        this.h = z4;
        this.f30094i = g6Var;
    }

    @Override
    public final void c(boolean z4) {
        this.f30088a = z4;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.f30091e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i10;
        float f10;
        int i11;
        int dp = AndroidUtilities.dp(10.0f);
        int dp2 = ((AndroidUtilities.dp(18.0f) - dp) / 2) + getBounds().top;
        if (!this.f30088a) {
            dp2 += AndroidUtilities.dp(1.0f);
        }
        int i12 = dp2;
        boolean z4 = this.h;
        if (z4) {
            i10 = org.telegram.ui.ActionBar.k6.f21880p9;
        } else {
            i10 = org.telegram.ui.ActionBar.k6.f21881pa;
        }
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, this.f30094i);
        Paint paint = this.f30089b;
        paint.setColor(v02);
        RectF rectF = this.f30092f;
        rectF.set(0.0f, i12, dp, i12 + dp);
        float f11 = this.f30093g;
        if (f11 < 0.5f) {
            f10 = org.telegram.ui.b.c(f11, 0.5f, 1.0f, 35.0f);
        } else {
            f10 = ((f11 - 0.5f) * 35.0f) / 0.5f;
        }
        int i13 = (int) f10;
        for (int i14 = 0; i14 < 3; i14++) {
            int dp3 = AndroidUtilities.dp(9.2f);
            float f12 = this.f30093g;
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
            i11 = org.telegram.ui.ActionBar.k6.f21661d6;
        } else {
            i11 = org.telegram.ui.ActionBar.k6.f21932s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i12) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f30093g = 0.0f;
        this.f30091e = false;
    }

    public final void f() {
        if (this.f30091e) {
            if (!NotificationCenter.getInstance(this.f30090c).isAnimationInProgress()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j10 > 50) {
                    j10 = 50;
                }
                if (this.f30093g >= 1.0f) {
                    this.f30093g = 0.0f;
                }
                float f10 = (((float) j10) / 300.0f) + this.f30093g;
                this.f30093g = f10;
                if (f10 > 1.0f) {
                    this.f30093g = 1.0f;
                }
                a();
                return;
            }
            AndroidUtilities.runOnUIThread(new ec0(this, 13), 100L);
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
