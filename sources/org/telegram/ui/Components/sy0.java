package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class sy0 {
    public final int f28225a;
    public final org.telegram.ui.Cells.w0 f28226b;
    public final org.telegram.ui.ActionBar.f6 f28227c;
    public final hj0 d;
    public TL_account.TL_birthday e;
    public u01 f28228f;
    public u01[] f28229g;
    public u01[] h;
    public boolean f28230i;
    public u01 f28231j;
    public final RectF f28232k = new RectF();
    public final Paint f28233l = new Paint(1);
    public final yc f28234m;

    public sy0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28225a = i10;
        this.f28226b = w0Var;
        this.f28227c = f6Var;
        hj0 hj0Var = new hj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = hj0Var;
        hj0Var.H(false);
        this.f28234m = new yc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f28226b;
        int width = (w0Var.getWidth() - dp) / 2;
        hj0 hj0Var = this.d;
        hj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        hj0Var.draw(canvas);
        this.f28228f.c((w0Var.getWidth() - this.f28228f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f28228f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28229g.length; i11++) {
            i10 = (int) (Math.max(this.f28229g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f28229g.length) {
            float max = Math.max(this.f28229g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            u01 u01Var = this.f28229g[i12];
            u01Var.c(f10 - (u01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            u01 u01Var2 = this.h[i12];
            u01Var2.c(f10 - (u01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f28230i) {
            canvas.save();
            float l4 = this.f28231j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f28232k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f28234m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f28233l);
            this.f28231j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        d5.m(this.f28226b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new x2(this, 11), null, true, false, this.f28227c).f18659a.show();
    }
}
