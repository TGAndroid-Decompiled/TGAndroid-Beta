package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class qg0 extends ww0 {
    public boolean f26411a = false;
    public final Paint f26412b = new Paint(1);
    public final int f26413c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean e = false;
    public final RectF f26414f = new RectF();
    public float f26415g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.f6 f26416i;

    public qg0(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        this.h = z10;
        this.f26416i = f6Var;
    }

    @Override
    public final void c(boolean z10) {
        this.f26411a = z10;
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
        if (!this.f26411a) {
            dp2 += AndroidUtilities.dp(1.0f);
        }
        int i12 = dp2;
        boolean z10 = this.h;
        if (z10) {
            i10 = org.telegram.ui.ActionBar.j6.f18146p9;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.f18147pa;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.f26416i);
        Paint paint = this.f26412b;
        paint.setColor(v02);
        RectF rectF = this.f26414f;
        rectF.set(0.0f, i12, dp, i12 + dp);
        float f10 = this.f26415g;
        if (f10 < 0.5f) {
            f7 = org.telegram.messenger.em.u(f10, 0.5f, 1.0f, 35.0f);
        } else {
            f7 = ((f10 - 0.5f) * 35.0f) / 0.5f;
        }
        int i13 = (int) f7;
        for (int i14 = 0; i14 < 3; i14++) {
            int dp3 = AndroidUtilities.dp(9.2f);
            float f11 = this.f26415g;
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
            i11 = org.telegram.ui.ActionBar.j6.f17928d6;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.f18201s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i12) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f26415g = 0.0f;
        this.e = false;
    }

    public final void f() {
        if (this.e) {
            if (!NotificationCenter.getInstance(this.f26413c).isAnimationInProgress()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j3 > 50) {
                    j3 = 50;
                }
                if (this.f26415g >= 1.0f) {
                    this.f26415g = 0.0f;
                }
                float f7 = (((float) j3) / 300.0f) + this.f26415g;
                this.f26415g = f7;
                if (f7 > 1.0f) {
                    this.f26415g = 1.0f;
                }
                a();
                return;
            }
            AndroidUtilities.runOnUIThread(new kc0(this, 13), 100L);
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
