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
public final class b50 {
    public final org.telegram.ui.Components.zz0 d;
    public final org.telegram.ui.Components.zz0 f36689e;
    public final org.telegram.ui.Components.zz0 f36690f;
    public cg.h0 f36691g;
    public int f36693j;
    public final Paint f36686a = new Paint(1);
    public final Paint f36687b = new Paint(1);
    public final d50[] f36688c = new d50[4];
    public boolean h = true;
    public final org.telegram.ui.Components.d6 f36692i = new org.telegram.ui.Components.d6(new q00(this, 7), 320, org.telegram.ui.Components.jr.h, 0);
    public final RectF f36694k = new RectF();
    public final RectF f36695l = new RectF();
    public final Path f36696m = new Path();

    public b50() {
        int i10 = 0;
        while (true) {
            d50[] d50VarArr = this.f36688c;
            if (i10 < d50VarArr.length) {
                d50VarArr[i10] = new d50(i10);
                i10++;
            } else {
                this.f36686a.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23356tg, false));
                this.d = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                zz0Var.n(99);
                zz0Var.q(AndroidUtilities.dp(200.0f));
                zz0Var.m(AndroidUtilities.dp(2.66f));
                this.f36689e = zz0Var;
                this.f36690f = new org.telegram.ui.Components.zz0(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
        }
    }

    public final boolean a(Canvas canvas, float f9, float f10) {
        int dp;
        canvas.save();
        org.telegram.ui.Components.zz0 zz0Var = this.d;
        zz0Var.f35473p = f9 - AndroidUtilities.dp(132.0f);
        int d = i0.a.d(f10, this.f36693j, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23356tg, false));
        Paint paint = this.f36686a;
        paint.setColor(d);
        float e10 = this.f36692i.e(this.h);
        int dp2 = AndroidUtilities.dp(14.0f);
        float l10 = zz0Var.l() + AndroidUtilities.dp(86.0f) + dp2;
        float dp3 = AndroidUtilities.dp(28.0f);
        float dp4 = AndroidUtilities.dp(232.0f);
        float j10 = this.f36689e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float lerp = AndroidUtilities.lerp(l10, dp4, f10);
        float lerp2 = AndroidUtilities.lerp(dp3, j10, f10);
        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f9 - lerp) / 2.0f, 0.0f, (f9 + lerp) / 2.0f, lerp2);
        canvas.drawRoundRect(rectF, lerp3, lerp3, paint);
        Path path = this.f36696m;
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
        float f11 = dp5 / 2.0f;
        float f12 = centerY;
        int dp9 = AndroidUtilities.dp(7.0f) + ((int) rectF.left);
        float f13 = centerY2;
        RectF rectF2 = this.f36694k;
        rectF2.set((dp8 + (dp7 + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + dp9 + f11, f13);
        float f14 = f9 / 2.0f;
        float f15 = f14 - (dp * 2);
        float dp10 = (int) ((dp4 - AndroidUtilities.dp(32.0f)) / 4.0f);
        float f16 = (int) ((0.5f * dp10) + f15);
        float f17 = dp6 / 2.0f;
        RectF rectF3 = this.f36695l;
        rectF3.set(f16 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f16 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        d50[] d50VarArr = this.f36688c;
        boolean b10 = d50VarArr[0].b(canvas, rectF3, f10);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f11, f12, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f11, f13);
        float f18 = (int) ((1.5f * dp10) + f15);
        boolean z10 = b10;
        rectF3.set(f18 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f18 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        boolean z11 = true;
        if (d50VarArr[1].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        org.telegram.ui.Components.zz0 zz0Var2 = this.d;
        zz0Var2.c(f14 - (zz0Var2.l() / 2.0f), dp3 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, e10) * (1.0f - f10), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f11, f13);
        float f19 = (int) ((dp10 * 2.5f) + f15);
        rectF3.set(f19 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f19 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (d50VarArr[2].b(canvas, rectF3, f10)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f11, f12, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f11, f13);
        float f20 = (int) ((dp10 * 3.5f) + f15);
        rectF3.set(f20 - f17, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f17), f20 + f17, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f17));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f10, rectF3);
        if (!d50VarArr[3].b(canvas, rectF3, f10)) {
            z11 = z10;
        }
        if (f10 > 0.0f) {
            this.f36689e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (dp4 / 2.0f)), AndroidUtilities.dp(54.0f), f10, -1, canvas);
            Paint paint2 = this.f36687b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRect(rectF.left, j10 - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (j10 - AndroidUtilities.dp(40.0f)), paint2);
            this.f36690f.c(rectF.centerX() - (this.f36690f.l() / 2.0f), j10 - AndroidUtilities.dp(20.0f), f10, -1, canvas);
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
            d50 d50Var = this.f36688c[i10];
            if (strArr == null) {
                str = null;
            } else {
                str = strArr[i10];
            }
            c50 c50Var = d50Var.f37307k;
            boolean z12 = d50Var.f37303f;
            if (str != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            d50Var.f37303f = z11;
            if (str != null && (d50Var.d == null || !TextUtils.equals(d50Var.f37308l, str))) {
                org.telegram.ui.Components.p5 p5Var = d50Var.d;
                if (p5Var != null) {
                    p5Var.p(c50Var);
                }
                d50Var.f37301c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                ?? drawable = new Drawable();
                drawable.f31594l = 1.0f;
                drawable.f31596n = null;
                drawable.f31597o = null;
                drawable.f31590g = 21;
                drawable.h = productionAccount;
                drawable.y();
                org.telegram.ui.Components.p5.x();
                d50Var.d = drawable;
                d50Var.f37308l = str;
                drawable.r(str);
                d50Var.c();
                if (d50Var.f37306j) {
                    d50Var.d.b(c50Var);
                }
            }
            if (d50Var.f37303f && !z12) {
                d50Var.f37302e = false;
            }
        }
        cg.h0 h0Var = this.f36691g;
        if (h0Var != null) {
            h0Var.invalidate();
        }
    }
}
