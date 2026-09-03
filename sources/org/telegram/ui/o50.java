package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
public final class o50 {
    public final org.telegram.ui.Components.k01 d;
    public final org.telegram.ui.Components.k01 f39534e;
    public final org.telegram.ui.Components.k01 f39535f;
    public fg.h0 f39536g;
    public int f39538j;
    public final Paint f39531a = new Paint(1);
    public final Paint f39532b = new Paint(1);
    public final q50[] f39533c = new q50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.z5 f39537i = new org.telegram.ui.Components.z5(new c10(this, 7), 320, org.telegram.ui.Components.pr.h, 0);
    public final RectF f39539k = new RectF();
    public final RectF f39540l = new RectF();
    public final Path f39541m = new Path();

    public o50() {
        int i10 = 0;
        while (true) {
            q50[] q50VarArr = this.f39533c;
            if (i10 < q50VarArr.length) {
                q50VarArr[i10] = new q50(i10);
                i10++;
            } else {
                this.f39531a.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21954tg, false));
                this.d = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.k01 k01Var = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                k01Var.n(99);
                k01Var.q(AndroidUtilities.dp(200.0f));
                k01Var.m(AndroidUtilities.dp(2.66f));
                this.f39534e = k01Var;
                this.f39535f = new org.telegram.ui.Components.k01(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
        }
    }

    public final boolean a(Canvas canvas, float f10, float f11) {
        int dp;
        canvas.save();
        org.telegram.ui.Components.k01 k01Var = this.d;
        k01Var.f28238p = f10 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f11, this.f39538j, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21954tg, false));
        Paint paint = this.f39531a;
        paint.setColor(d);
        float e6 = this.f39537i.e(this.h);
        int dp2 = AndroidUtilities.dp(14.0f);
        float l10 = k01Var.l() + AndroidUtilities.dp(86.0f) + dp2;
        float dp3 = AndroidUtilities.dp(28.0f);
        float dp4 = AndroidUtilities.dp(232.0f);
        float j10 = this.f39534e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l10, dp4, f11);
        float lerp2 = AndroidUtilities.lerp(dp3, j10, f11);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f11);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f10 - lerp) / 2.0f, 0.0f, (f10 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.f39541m;
        path.rewind();
        path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
        canvas.clipPath(path);
        int dp5 = AndroidUtilities.dp(18.0f);
        int dp6 = AndroidUtilities.dp(30.0f);
        int i10 = dp5 / 2;
        int centerY = ((int) rectF.centerY()) - i10;
        int centerY2 = ((int) rectF.centerY()) + i10;
        int dp7 = AndroidUtilities.dp(7.0f);
        int dp8 = AndroidUtilities.dp(10.0f);
        float f12 = dp5 / 2.0f;
        float f13 = centerY;
        int dp9 = AndroidUtilities.dp(7.0f) + ((int) rectF.left);
        float f14 = centerY2;
        RectF rectF2 = this.f39539k;
        rectF2.set((dp8 + (dp7 + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + dp9 + f12, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (dp * 2);
        float dp10 = (int) ((dp4 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f17 = (int) ((0.5f * dp10) + f16);
        float f18 = dp6 / 2.0f;
        RectF rectF3 = this.f39540l;
        rectF3.set(f17 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f17 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        q50[] q50VarArr = this.f39533c;
        boolean b10 = q50VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * dp10) + f16);
        boolean z4 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f19 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        boolean z10 = true;
        if (q50VarArr[1].b(canvas, rectF3, f11)) {
            z4 = true;
        }
        org.telegram.ui.Components.k01 k01Var2 = this.d;
        k01Var2.c(f15 - (k01Var2.l() / 2.0f), dp3 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e6) * (1.0f - f11), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f12, f14);
        float f20 = (int) ((dp10 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f20 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (q50VarArr[2].b(canvas, rectF3, f11)) {
            z4 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f12, f14);
        float f21 = (int) ((dp10 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f21 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (!q50VarArr[3].b(canvas, rectF3, f11)) {
            z10 = z4;
        }
        if (f11 > 0.0f) {
            this.f39534e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp4 / 2.0f)), AndroidUtilities.dp(54.0f), f11, -1, canvas);
            Paint paint2 = this.f39532b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, j10 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j10 - AndroidUtilities.dp(40.0f)), paint2);
            this.f39535f.c(rectF.centerX() - (this.f39535f.l() / 2.0f), j10 - AndroidUtilities.dp(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z10;
    }

    public final void b(String[] strArr) {
        boolean z4;
        String str;
        boolean z10;
        if (strArr == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.h = z4;
        for (int i10 = 0; i10 < 4; i10++) {
            q50 q50Var = this.f39533c[i10];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i10];
            }
            p50 p50Var = q50Var.f40333k;
            boolean z11 = q50Var.f40329f;
            if (str != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            q50Var.f40329f = z10;
            if (str != null && (q50Var.d == null || !TextUtils.equals(q50Var.f40334l, str))) {
                org.telegram.ui.Components.l5 l5Var = q50Var.d;
                if (l5Var != null) {
                    l5Var.p(p50Var);
                }
                q50Var.f40327c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                ?? drawable = new Drawable();
                drawable.f28638l = 1.0f;
                drawable.f28640n = null;
                drawable.f28641o = null;
                drawable.f28634g = 21;
                drawable.h = productionAccount;
                drawable.y();
                org.telegram.ui.Components.l5.x();
                q50Var.d = drawable;
                q50Var.f40334l = str;
                drawable.r(str);
                q50Var.c();
                if (q50Var.f40332j) {
                    q50Var.d.b(p50Var);
                }
            }
            if (q50Var.f40329f && !z11) {
                q50Var.f40328e = false;
            }
        }
        fg.h0 h0Var = this.f39536g;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }
}
