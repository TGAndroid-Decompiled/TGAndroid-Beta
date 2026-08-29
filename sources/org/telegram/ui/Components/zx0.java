package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class zx0 {
    public final int f35443a;
    public final org.telegram.ui.Cells.v0 f35444b;
    public final org.telegram.ui.ActionBar.c6 f35445c;
    public final xi0 d;
    public TL_account.TL_birthday f35446e;
    public zz0 f35447f;
    public zz0[] f35448g;
    public zz0[] h;
    public boolean f35449i;
    public zz0 f35450j;
    public final RectF f35451k = new RectF();
    public final Paint f35452l = new Paint(1);
    public final uc f35453m;

    public zx0(int i10, org.telegram.ui.Cells.v0 v0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f35443a = i10;
        this.f35444b = v0Var;
        this.f35445c = c6Var;
        xi0 xi0Var = new xi0(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = xi0Var;
        xi0Var.F(false);
        this.f35453m = new uc(v0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.v0 v0Var = this.f35444b;
        int width = (v0Var.getWidth() - dp) / 2;
        xi0 xi0Var = this.d;
        xi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        xi0Var.draw(canvas);
        this.f35447f.c((v0Var.getWidth() - this.f35447f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f35447f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f35448g.length; i11++) {
            i10 = (int) (Math.max(this.f35448g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (v0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f35448g.length) {
            float max = Math.max(this.f35448g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f9 = width2;
            float f10 = (max / 2.0f) + f9;
            int i13 = (int) (f9 + max);
            zz0 zz0Var = this.f35448g[i12];
            zz0Var.c(f10 - (zz0Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            zz0 zz0Var2 = this.h[i12];
            zz0Var2.c(f10 - (zz0Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f35449i) {
            canvas.save();
            float l10 = this.f35450j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f35451k;
            rectF.set((v0Var.getWidth() - l10) / 2.0f, dp3, (v0Var.getWidth() + l10) / 2.0f, dp3 + dp2);
            float a2 = this.f35453m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f35452l);
            this.f35450j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        c5.m(this.f35444b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f35446e, new y2(this, 11), null, true, false, this.f35445c).f22729a.show();
    }
}
