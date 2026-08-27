package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

public final class c50 {
    public final org.telegram.ui.Components.pz0 d;

    public final org.telegram.ui.Components.pz0 f36962e;

    public final org.telegram.ui.Components.pz0 f36963f;

    public ag.s0 f36964g;

    public int f36966j;

    public final Paint f36959a = new Paint(1);

    public final Paint f36960b = new Paint(1);

    public final e50[] f36961c = new e50[4];
    public boolean h = true;

    public final org.telegram.ui.Components.y5 f36965i = new org.telegram.ui.Components.y5(new r00(this, 7), 320, org.telegram.ui.Components.er.h, 0);

    public final RectF f36967k = new RectF();

    public final RectF f36968l = new RectF();

    public final Path f36969m = new Path();

    public c50() {
        int i10 = 0;
        while (true) {
            e50[] e50VarArr = this.f36961c;
            if (i10 >= e50VarArr.length) {
                this.f36959a.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23349tg, false));
                this.d = new org.telegram.ui.Components.pz0(LocaleController.getString(R.string.ConferenceEncrypted), 12.0f, AndroidUtilities.bold());
                org.telegram.ui.Components.pz0 pz0Var = new org.telegram.ui.Components.pz0(LocaleController.getString(R.string.ConferenceEncryptedInfo), 11.0f, null);
                pz0Var.n(99);
                pz0Var.q(AndroidUtilities.dp(200.0f));
                pz0Var.m(AndroidUtilities.dp(2.66f));
                this.f36962e = pz0Var;
                this.f36963f = new org.telegram.ui.Components.pz0(LocaleController.getString(R.string.ConferenceEncryptedClose), 14.0f, AndroidUtilities.bold());
                b(null);
                return;
            }
            e50VarArr[i10] = new e50(i10);
            i10++;
        }
    }

    public final boolean a(Canvas canvas, float f10, float f11) {
        canvas.save();
        float fDp = f10 - AndroidUtilities.dp(132.0f);
        org.telegram.ui.Components.pz0 pz0Var = this.d;
        pz0Var.f31708p = fDp;
        int iD = i0.b.d(f11, this.f36966j, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23349tg, false));
        Paint paint = this.f36959a;
        paint.setColor(iD);
        float fE = this.f36965i.e(this.h);
        float fL = pz0Var.l() + AndroidUtilities.dp(86.0f) + AndroidUtilities.dp(14.0f);
        float fDp2 = AndroidUtilities.dp(28.0f);
        float fDp3 = AndroidUtilities.dp(232.0f);
        float fJ = this.f36962e.j() + AndroidUtilities.dp(54.0f) + AndroidUtilities.dp(50.0f);
        float fLerp = AndroidUtilities.lerp(fL, fDp3, f11);
        float fLerp2 = AndroidUtilities.lerp(fDp2, fJ, f11);
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f), f11);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((f10 - fLerp) / 2.0f, 0.0f, (f10 + fLerp) / 2.0f, fLerp2);
        canvas.drawRoundRect(rectF, fLerp3, fLerp3, paint);
        Path path = this.f36969m;
        path.rewind();
        path.addRoundRect(rectF, fLerp3, fLerp3, Path.Direction.CW);
        canvas.clipPath(path);
        int iDp = AndroidUtilities.dp(18.0f);
        int iDp2 = (int) ((fDp3 - AndroidUtilities.dp(32.0f)) / 4.0f);
        int iDp3 = AndroidUtilities.dp(30.0f);
        int i10 = iDp / 2;
        int iCenterY = ((int) rectF.centerY()) - i10;
        int iCenterY2 = ((int) rectF.centerY()) + i10;
        float fDp4 = AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left);
        float f12 = iDp / 2.0f;
        float f13 = iCenterY;
        float fDp5 = AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(7.0f) + ((int) rectF.left) + f12;
        float f14 = iCenterY2;
        RectF rectF2 = this.f36967k;
        rectF2.set(fDp4 - f12, f13, fDp5, f14);
        float f15 = f10 / 2.0f;
        float f16 = f15 - (iDp2 * 2);
        float f17 = iDp2;
        float f18 = (int) ((0.5f * f17) + f16);
        float f19 = iDp3 / 2.0f;
        float fDp6 = (int) (rectF.top + AndroidUtilities.dp(27.33f) + f19);
        RectF rectF3 = this.f36968l;
        rectF3.set(f18 - f19, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f19), f18 + f19, fDp6);
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        e50[] e50VarArr = this.f36961c;
        boolean zB = e50VarArr[0].b(canvas, rectF3, f11);
        rectF2.set((AndroidUtilities.dp(10.0f) + (AndroidUtilities.dp(27.0f) + ((int) rectF.left))) - f12, f13, AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(27.0f) + ((int) rectF.left) + f12, f14);
        float f20 = (int) ((1.5f * f17) + f16);
        boolean z10 = zB;
        rectF3.set(f20 - f19, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f19), f20 + f19, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f19));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (e50VarArr[1].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        org.telegram.ui.Components.pz0 pz0Var2 = this.d;
        pz0Var2.c(f15 - (pz0Var2.l() / 2.0f), fDp2 / 2.0f, AndroidUtilities.lerp(1.0f, 0.75f, fE) * (1.0f - f11), -1, canvas);
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(47.0f)) + f12, f14);
        float f21 = (int) ((f17 * 2.5f) + f16);
        rectF3.set(f21 - f19, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f19), f21 + f19, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f19));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        if (e50VarArr[2].b(canvas, rectF3, f11)) {
            z10 = true;
        }
        rectF2.set((AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f))) - f12, f13, AndroidUtilities.dp(10.0f) + (((int) rectF.right) - AndroidUtilities.dp(27.0f)) + f12, f14);
        float f22 = (int) ((f17 * 3.5f) + f16);
        rectF3.set(f22 - f19, (int) ((rectF.top + AndroidUtilities.dp(27.33f)) - f19), f22 + f19, (int) (rectF.top + AndroidUtilities.dp(27.33f) + f19));
        AndroidUtilities.lerpCentered(rectF2, rectF3, f11, rectF3);
        boolean z11 = e50VarArr[3].b(canvas, rectF3, f11) ? true : z10;
        if (f11 > 0.0f) {
            this.f36962e.c(AndroidUtilities.dp(16.0f) + (rectF.centerX() - (fDp3 / 2.0f)), AndroidUtilities.dp(54.0f), f11, -1, canvas);
            Paint paint2 = this.f36960b;
            paint2.setColor(-16777216);
            paint2.setAlpha((int) (255.0f * f11));
            canvas.drawRect(rectF.left, fJ - AndroidUtilities.dp(40.0f), rectF.right, AndroidUtilities.dp(0.66f) + (fJ - AndroidUtilities.dp(40.0f)), paint2);
            this.f36963f.c(rectF.centerX() - (this.f36963f.l() / 2.0f), fJ - AndroidUtilities.dp(20.0f), f11, -1, canvas);
        }
        canvas.restore();
        return z11;
    }

    public final void b(String[] strArr) {
        this.h = strArr == null;
        for (int i10 = 0; i10 < 4; i10++) {
            e50 e50Var = this.f36961c[i10];
            String str = strArr == null ? null : strArr[i10];
            d50 d50Var = e50Var.f37632k;
            boolean z10 = e50Var.f37628f;
            e50Var.f37628f = str != null;
            if (str != null && (e50Var.d == null || !TextUtils.equals(e50Var.f37633l, str))) {
                org.telegram.ui.Components.k5 k5Var = e50Var.d;
                if (k5Var != null) {
                    k5Var.p(d50Var);
                }
                e50Var.f37626c = Emoji.getEmojiDrawable(str);
                int productionAccount = UserConfig.getProductionAccount();
                org.telegram.ui.Components.k5 k5Var2 = new org.telegram.ui.Components.k5();
                k5Var2.f29962l = 1.0f;
                k5Var2.f29964n = null;
                k5Var2.f29965o = null;
                k5Var2.f29958g = 21;
                k5Var2.h = productionAccount;
                k5Var2.y();
                org.telegram.ui.Components.k5.x();
                e50Var.d = k5Var2;
                e50Var.f37633l = str;
                k5Var2.r(str);
                e50Var.c();
                if (e50Var.f37631j) {
                    e50Var.d.b(d50Var);
                }
            }
            if (e50Var.f37628f && !z10) {
                e50Var.f37627e = false;
            }
        }
        ag.s0 s0Var = this.f36964g;
        if (s0Var != null) {
            s0Var.invalidate();
        }
    }
}
