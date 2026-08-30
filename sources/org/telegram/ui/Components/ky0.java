package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class ky0 {
    public final int f26399a;
    public final org.telegram.ui.Cells.v0 f26400b;
    public final org.telegram.ui.ActionBar.f6 f26401c;
    public final gj0 d;
    public TL_account.TL_birthday e;
    public k01 f26402f;
    public k01[] f26403g;
    public k01[] h;
    public boolean f26404i;
    public k01 f26405j;
    public final RectF f26406k = new RectF();
    public final Paint f26407l = new Paint(1);
    public final rc f26408m;

    public ky0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f26399a = i10;
        this.f26400b = v0Var;
        this.f26401c = f6Var;
        gj0 gj0Var = new gj0(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = gj0Var;
        gj0Var.F(false);
        this.f26408m = new rc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f26400b;
        int width = (v0Var.getWidth() - dp) / 2;
        gj0 gj0Var = this.d;
        gj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        gj0Var.draw(canvas);
        this.f26402f.c((v0Var.getWidth() - this.f26402f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f26402f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26403g.length; i11++) {
            i10 = (int) (Math.max(this.f26403g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f26403g.length) {
            float max = Math.max(this.f26403g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            k01 k01Var = this.f26403g[i12];
            k01Var.c(f11 - (k01Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            k01 k01Var2 = this.h[i12];
            k01Var2.c(f11 - (k01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f26404i) {
            canvas.save();
            float l10 = this.f26405j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f26406k;
            rectF.set((v0Var.getWidth() - l10) / 2.0f, dp3, (v0Var.getWidth() + l10) / 2.0f, dp3 + dp2);
            float a2 = this.f26408m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f12 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f26407l);
            this.f26405j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        z4.m(this.f26400b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new v2(this, 11), null, true, false, this.f26401c).f19525a.show();
    }
}
