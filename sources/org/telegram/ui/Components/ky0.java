package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class ky0 {
    public final int f28514a;
    public final org.telegram.ui.Cells.v0 f28515b;
    public final org.telegram.ui.ActionBar.g6 f28516c;
    public final hj0 d;
    public TL_account.TL_birthday f28517e;
    public k01 f28518f;
    public k01[] f28519g;
    public k01[] h;
    public boolean f28520i;
    public k01 f28521j;
    public final RectF f28522k = new RectF();
    public final Paint f28523l = new Paint(1);
    public final rc f28524m;

    public ky0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f28514a = i10;
        this.f28515b = v0Var;
        this.f28516c = g6Var;
        hj0 hj0Var = new hj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = hj0Var;
        hj0Var.F(false);
        this.f28524m = new rc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f28515b;
        int width = (v0Var.getWidth() - dp) / 2;
        hj0 hj0Var = this.d;
        hj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        hj0Var.draw(canvas);
        this.f28518f.c((v0Var.getWidth() - this.f28518f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f28518f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28519g.length; i11++) {
            i10 = (int) (Math.max(this.f28519g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f28519g.length) {
            float max = Math.max(this.f28519g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            k01 k01Var = this.f28519g[i12];
            k01Var.c(f11 - (k01Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            k01 k01Var2 = this.h[i12];
            k01Var2.c(f11 - (k01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f28520i) {
            canvas.save();
            float l10 = this.f28521j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f28522k;
            rectF.set((v0Var.getWidth() - l10) / 2.0f, dp3, (v0Var.getWidth() + l10) / 2.0f, dp3 + dp2);
            float a2 = this.f28524m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f12 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f28523l);
            this.f28521j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        z4.m(this.f28515b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f28517e, new v2(this, 11), null, true, false, this.f28516c).f21209a.show();
    }
}
