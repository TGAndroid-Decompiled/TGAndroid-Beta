package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
public final class rf0 extends tv0 {
    public boolean f32154a = false;
    public final Paint f32155b = new Paint(1);
    public final int f32156c = UserConfig.selectedAccount;
    public long d = 0;
    public boolean f32157e = false;
    public final RectF f32158f = new RectF();
    public float f32159g;
    public final boolean h;
    public final org.telegram.ui.ActionBar.b6 f32160i;

    public rf0(org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        this.h = z10;
        this.f32160i = b6Var;
    }

    @Override
    public final void c(boolean z10) {
        this.f32154a = z10;
    }

    @Override
    public final void d() {
        this.d = System.currentTimeMillis();
        this.f32157e = true;
        invalidateSelf();
    }

    @Override
    public final void draw(Canvas canvas) {
        int i9;
        float f10;
        int i10;
        int dp = AndroidUtilities.dp(10.0f);
        int dp2 = ((AndroidUtilities.dp(18.0f) - dp) / 2) + getBounds().top;
        if (!this.f32154a) {
            dp2 += AndroidUtilities.dp(1.0f);
        }
        int i11 = dp2;
        boolean z10 = this.h;
        if (z10) {
            i9 = org.telegram.ui.ActionBar.f6.p9;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.f23214pa;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.f32160i);
        Paint paint = this.f32155b;
        paint.setColor(v02);
        RectF rectF = this.f32158f;
        rectF.set(0.0f, i11, dp, i11 + dp);
        float f11 = this.f32159g;
        if (f11 < 0.5f) {
            f10 = org.telegram.messenger.ll.v(f11, 0.5f, 1.0f, 35.0f);
        } else {
            f10 = ((f11 - 0.5f) * 35.0f) / 0.5f;
        }
        int i12 = (int) f10;
        for (int i13 = 0; i13 < 3; i13++) {
            int dp3 = AndroidUtilities.dp(9.2f);
            float f12 = this.f32159g;
            float dp4 = (dp3 + (AndroidUtilities.dp(5.0f) * i13)) - (AndroidUtilities.dp(5.0f) * f12);
            if (i13 == 2) {
                paint.setAlpha(Math.min(255, (int) ((f12 * 255.0f) / 0.5f)));
            } else if (i13 == 0) {
                if (f12 > 0.5f) {
                    paint.setAlpha((int) ((1.0f - ((f12 - 0.5f) / 0.5f)) * 255.0f));
                } else {
                    paint.setAlpha(255);
                }
            } else {
                paint.setAlpha(255);
            }
            canvas.drawCircle(dp4, (dp / 2) + i11, AndroidUtilities.dp(1.2f), paint);
        }
        paint.setAlpha(255);
        canvas.drawArc(rectF, i12, 360 - (i12 * 2), true, paint);
        if (z10) {
            i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.f23269s8;
        }
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        canvas.drawCircle(AndroidUtilities.dp(4.0f), ((dp / 2) + i11) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f), paint);
        f();
    }

    @Override
    public final void e() {
        this.f32159g = 0.0f;
        this.f32157e = false;
    }

    public final void f() {
        if (this.f32157e) {
            if (!NotificationCenter.getInstance(this.f32156c).isAnimationInProgress()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j10 = currentTimeMillis - this.d;
                this.d = currentTimeMillis;
                if (j10 > 50) {
                    j10 = 50;
                }
                if (this.f32159g >= 1.0f) {
                    this.f32159g = 0.0f;
                }
                float f10 = (((float) j10) / 300.0f) + this.f32159g;
                this.f32159g = f10;
                if (f10 > 1.0f) {
                    this.f32159g = 1.0f;
                }
                a();
                return;
            }
            AndroidUtilities.runOnUIThread(new ib0(this, 13), 100L);
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
    public final void b(int i9) {
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
