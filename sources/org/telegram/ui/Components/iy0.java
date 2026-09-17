package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class iy0 {
    public final int f25048a;
    public final org.telegram.ui.Cells.w0 f25049b;
    public final org.telegram.ui.ActionBar.f6 f25050c;
    public final yi0 d;
    public TL_account.TL_birthday e;
    public h01 f25051f;
    public h01[] f25052g;
    public h01[] h;
    public boolean f25053i;
    public h01 f25054j;
    public final RectF f25055k = new RectF();
    public final Paint f25056l = new Paint(1);
    public final wc f25057m;

    public iy0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25048a = i10;
        this.f25049b = w0Var;
        this.f25050c = f6Var;
        yi0 yi0Var = new yi0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = yi0Var;
        yi0Var.H(false);
        this.f25057m = new wc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f25049b;
        int width = (w0Var.getWidth() - dp) / 2;
        yi0 yi0Var = this.d;
        yi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        yi0Var.draw(canvas);
        this.f25051f.c((w0Var.getWidth() - this.f25051f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f25051f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25052g.length; i11++) {
            i10 = (int) (Math.max(this.f25052g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f25052g.length) {
            float max = Math.max(this.f25052g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            h01 h01Var = this.f25052g[i12];
            h01Var.c(f10 - (h01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            h01 h01Var2 = this.h[i12];
            h01Var2.c(f10 - (h01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f25053i) {
            canvas.save();
            float l4 = this.f25054j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f25055k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f25057m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f25056l);
            this.f25054j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        c5.m(this.f25049b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new x2(this, 11), null, true, false, this.f25050c).f18470a.show();
    }
}
