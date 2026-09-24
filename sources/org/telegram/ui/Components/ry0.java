package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class ry0 {
    public final int f28053a;
    public final org.telegram.ui.Cells.w0 f28054b;
    public final org.telegram.ui.ActionBar.d6 f28055c;
    public final ij0 d;
    public TL_account.TL_birthday e;
    public t01 f28056f;
    public t01[] f28057g;
    public t01[] h;
    public boolean f28058i;
    public t01 f28059j;
    public final RectF f28060k = new RectF();
    public final Paint f28061l = new Paint(1);
    public final zc f28062m;

    public ry0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28053a = i10;
        this.f28054b = w0Var;
        this.f28055c = d6Var;
        ij0 ij0Var = new ij0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = ij0Var;
        ij0Var.H(false);
        this.f28062m = new zc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f28054b;
        int width = (w0Var.getWidth() - dp) / 2;
        ij0 ij0Var = this.d;
        ij0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        ij0Var.draw(canvas);
        this.f28056f.c((w0Var.getWidth() - this.f28056f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f28056f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28057g.length; i11++) {
            i10 = (int) (Math.max(this.f28057g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f28057g.length) {
            float max = Math.max(this.f28057g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            t01 t01Var = this.f28057g[i12];
            t01Var.c(f10 - (t01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            t01 t01Var2 = this.h[i12];
            t01Var2.c(f10 - (t01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f28058i) {
            canvas.save();
            float l4 = this.f28059j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f28060k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f28062m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f28061l);
            this.f28059j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        e5.m(this.f28054b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new y2(this, 12), null, true, false, this.f28055c).f19935a.show();
    }
}
