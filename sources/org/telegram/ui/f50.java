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
public final class f50 {
    public final org.telegram.ui.Components.q11 d;
    public final org.telegram.ui.Components.q11 e;
    public final org.telegram.ui.Components.q11 f39266f;
    public z10 f39267g;
    public int f39269j;
    public final Paint f39263a = new Paint(1);
    public final Paint f39264b = new Paint(1);
    public final h50[] f39265c = new h50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.h6 f39268i = new org.telegram.ui.Components.h6(new p00(this, 7), 320, org.telegram.ui.Components.ds.h, 0);
    public final RectF f39270k = new RectF();
    public final RectF f39271l = new RectF();
    public final Path f39272m = new Path();

    public f50() {
        int i10 = 0;
        while (true) {
            h50[] h50VarArr = this.f39265c;
            if (i10 < h50VarArr.length) {
                h50VarArr[i10] = new h50(i10);
                i10++;
            } else {
                this.f39263a.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23663tg, false));
                this.d = new org.telegram.ui.Components.q11(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.q11 q11Var = new org.telegram.ui.Components.q11(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                q11Var.n(99);
                q11Var.q(AndroidUtilities.dp(200.0f));
                q11Var.m(AndroidUtilities.dp(2.66f));
                this.e = q11Var;
                this.f39266f = new org.telegram.ui.Components.q11(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
        }
    }

    public final boolean a(Canvas canvas, float f7, float f10) {
        int dp;
        canvas.save();
        org.telegram.ui.Components.q11 q11Var = this.d;
        q11Var.f31800p = f7 - AndroidUtilities.dp(132.0f);
        int f11 = i0.a.f(f10, this.f39269j, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23663tg, false));
        Paint paint = this.f39263a;
        paint.setColor(f11);
        float e = this.f39268i.e(this.h);
        int dp2 = AndroidUtilities.dp(14.0f);
        float l4 = q11Var.l() + AndroidUtilities.dp(86.0f) + dp2;
        float dp3 = AndroidUtilities.dp(28.0f);
        float dp4 = AndroidUtilities.dp(232.0f);
        float j10 = this.e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l4, dp4, f10);
        float lerp2 = AndroidUtilities.lerp(dp3, j10, f10);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f7 - lerp) / 2.0f, 0.0f, (f7 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.f39272m;
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
        RectF rectF2 = this.f39270k;
        rectF2.set((dp8 + (dp7 + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + dp9 + f12, f14);
        float f15 = f7 / 2.0f;
        float f16 = f15 - (dp * 2);
        float dp10 = (int) ((dp4 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f17 = (int) ((0.5f * dp10) + f16);
        float f18 = dp6 / 2.0f;
        RectF rectF3 = this.f39271l;
        rectF3.set(f17 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f17 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        h50[] h50VarArr = this.f39265c;
        boolean b10 = h50VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f12, f14);
        float f19 = (int) ((1.5f * dp10) + f16);
        boolean z10 = b10;
        rectF3.set(f19 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f19 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        boolean z11 = true;
        if (h50VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        org.telegram.ui.Components.q11 q11Var2 = this.d;
        q11Var2.c(f15 - (q11Var2.l() / 2.0f), dp3 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e) * (1.0f - f10), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f12, f14);
        float f20 = (int) ((dp10 * 2.5f) + f16);
        rectF3.set(f20 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f20 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (h50VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f12, f14);
        float f21 = (int) ((dp10 * 3.5f) + f16);
        rectF3.set(f21 - f18, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f18), f21 + f18, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f18));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (!h50VarArr[3].b(canvas, rectF3, f10)) {
            z11 = z10;
        }
        if (f10 > 0.0f) {
            this.e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp4 / 2.0f)), AndroidUtilities.dp(54.0f), f10, -1, canvas);
            Paint paint2 = this.f39264b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, j10 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j10 - AndroidUtilities.dp(40.0f)), paint2);
            this.f39266f.c(rectF.centerX() - (this.f39266f.l() / 2.0f), j10 - AndroidUtilities.dp(20.0f), f10, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public final void b(String[] strArr) {
        boolean z10;
        String str;
        boolean z11;
        if (strArr == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h = z10;
        for (int i10 = 0; i10 < 4; i10++) {
            h50 h50Var = this.f39265c[i10];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i10];
            }
            g50 g50Var = h50Var.f39902k;
            boolean z12 = h50Var.f39898f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            h50Var.f39898f = z11;
            if (str != null && (h50Var.d == null || !TextUtils.equals(h50Var.f39903l, str))) {
                org.telegram.ui.Components.t5 t5Var = h50Var.d;
                if (t5Var != null) {
                    t5Var.p(g50Var);
                }
                h50Var.f39897c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                ?? drawable = new Drawable();
                drawable.f32853l = 1.0f;
                drawable.f32855n = null;
                drawable.f32856o = null;
                drawable.f32849g = 21;
                drawable.h = productionAccount;
                drawable.y();
                org.telegram.ui.Components.t5.x();
                h50Var.d = drawable;
                h50Var.f39903l = str;
                drawable.r(str);
                h50Var.c();
                if (h50Var.f39901j) {
                    h50Var.d.b(g50Var);
                }
            }
            if (h50Var.f39898f && !z12) {
                h50Var.e = false;
            }
        }
        z10 z10Var = this.f39267g;
        if (z10Var != null) {
            z10Var.invalidate();
        }
    }
}
