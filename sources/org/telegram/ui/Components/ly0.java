package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class ly0 {
    public final int f28851a;
    public final org.telegram.ui.Cells.v0 f28852b;
    public final org.telegram.ui.ActionBar.g6 f28853c;
    public final ij0 d;
    public TL_account.TL_birthday f28854e;
    public l01 f28855f;
    public l01[] f28856g;
    public l01[] h;
    public boolean f28857i;
    public l01 f28858j;
    public final RectF f28859k = new RectF();
    public final Paint f28860l = new Paint(1);
    public final rc f28861m;

    public ly0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f28851a = i10;
        this.f28852b = v0Var;
        this.f28853c = g6Var;
        ij0 ij0Var = new ij0(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = ij0Var;
        ij0Var.F(false);
        this.f28861m = new rc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f28852b;
        int width = (v0Var.getWidth() - dp) / 2;
        ij0 ij0Var = this.d;
        ij0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        ij0Var.draw(canvas);
        this.f28855f.c((v0Var.getWidth() - this.f28855f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f28855f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28856g.length; i11++) {
            i10 = (int) (Math.max(this.f28856g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f28856g.length) {
            float max = Math.max(this.f28856g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            l01 l01Var = this.f28856g[i12];
            l01Var.c(f11 - (l01Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            l01 l01Var2 = this.h[i12];
            l01Var2.c(f11 - (l01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f28857i) {
            canvas.save();
            float l10 = this.f28858j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f28859k;
            rectF.set((v0Var.getWidth() - l10) / 2.0f, dp3, (v0Var.getWidth() + l10) / 2.0f, dp3 + dp2);
            float a2 = this.f28861m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f12 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f28860l);
            this.f28858j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        z4.m(this.f28852b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f28854e, new v2(this, 11), null, true, false, this.f28853c).f21207a.show();
    }
}
