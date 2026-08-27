package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;

public final class qx0 {

    public final int f31991a;

    public final org.telegram.ui.Cells.v0 f31992b;

    public final org.telegram.ui.ActionBar.c6 f31993c;
    public final oi0 d;

    public TL_account.TL_birthday f31994e;

    public pz0 f31995f;

    public pz0[] f31996g;
    public pz0[] h;

    public boolean f31997i;

    public pz0 f31998j;

    public final RectF f31999k = new RectF();

    public final Paint f32000l = new Paint(1);

    public final nc f32001m;

    public qx0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f31991a = i10;
        this.f31992b = v0Var;
        this.f31993c = c6Var;
        oi0 oi0Var = new oi0(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = oi0Var;
        oi0Var.F(false);
        this.f32001m = new nc(v0Var);
    }

    public final void a(Canvas canvas) {
        int iDp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f31992b;
        int width = (v0Var.getWidth() - iDp) / 2;
        int iDp2 = AndroidUtilities.dp(13.0f) + iDp;
        oi0 oi0Var = this.d;
        oi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + iDp, iDp2);
        oi0Var.draw(canvas);
        this.f31995f.c((v0Var.getWidth() - this.f31995f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + iDp, 1.0f, -1, canvas);
        int iJ = (int) (this.f31995f.j() + AndroidUtilities.dp(19.0f) + iDp + AndroidUtilities.dp(17.0f));
        int iMax = 0;
        for (int i10 = 0; i10 < this.f31996g.length; i10++) {
            iMax = (int) (Math.max(this.f31996g[i10].l(), this.h[i10].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + iMax);
        }
        int width2 = (v0Var.getWidth() - iMax) / 2;
        int i11 = 0;
        while (i11 < this.f31996g.length) {
            float fMax = Math.max(this.f31996g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f10 = width2;
            float f11 = (fMax / 2.0f) + f10;
            int i12 = (int) (f10 + fMax);
            pz0 pz0Var = this.f31996g[i11];
            pz0Var.c(f11 - (pz0Var.l() / 2.0f), iJ, 0.75f, -1, canvas);
            pz0 pz0Var2 = this.h[i11];
            pz0Var2.c(f11 - (pz0Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + iJ, 1.0f, -1, canvas);
            i11++;
            width2 = i12;
        }
        if (this.f31997i) {
            int iDp3 = AndroidUtilities.dp(38.0f) + iJ;
            canvas.save();
            float fL = this.f31998j.l() + AndroidUtilities.dp(26.0f);
            float fDp = AndroidUtilities.dp(30.0f);
            float f12 = iDp3;
            RectF rectF = this.f31999k;
            rectF.set((v0Var.getWidth() - fL) / 2.0f, f12, (v0Var.getWidth() + fL) / 2.0f, f12 + fDp);
            float fA = this.f32001m.a(0.1f);
            canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
            float f13 = fDp / 2.0f;
            canvas.drawRoundRect(rectF, f13, f13, this.f32000l);
            this.f31998j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        y4.m(this.f31992b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f31994e, new v2(this, 11), null, true, false, this.f31993c).f23994a.show();
    }
}
