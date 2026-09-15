package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class hy0 {
    public final int f24811a;
    public final org.telegram.ui.Cells.w0 f24812b;
    public final org.telegram.ui.ActionBar.e6 f24813c;
    public final xi0 d;
    public TL_account.TL_birthday e;
    public g01 f24814f;
    public g01[] f24815g;
    public g01[] h;
    public boolean f24816i;
    public g01 f24817j;
    public final RectF f24818k = new RectF();
    public final Paint f24819l = new Paint(1);
    public final wc f24820m;

    public hy0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f24811a = i10;
        this.f24812b = w0Var;
        this.f24813c = e6Var;
        xi0 xi0Var = new xi0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = xi0Var;
        xi0Var.H(false);
        this.f24820m = new wc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f24812b;
        int width = (w0Var.getWidth() - dp) / 2;
        xi0 xi0Var = this.d;
        xi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        xi0Var.draw(canvas);
        this.f24814f.c((w0Var.getWidth() - this.f24814f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f24814f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24815g.length; i11++) {
            i10 = (int) (Math.max(this.f24815g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f24815g.length) {
            float max = Math.max(this.f24815g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            g01 g01Var = this.f24815g[i12];
            g01Var.c(f10 - (g01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            g01 g01Var2 = this.h[i12];
            g01Var2.c(f10 - (g01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f24816i) {
            canvas.save();
            float l4 = this.f24817j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f24818k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f24820m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f24819l);
            this.f24817j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        c5.m(this.f24812b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new x2(this, 11), null, true, false, this.f24813c).f18442a.show();
    }
}
