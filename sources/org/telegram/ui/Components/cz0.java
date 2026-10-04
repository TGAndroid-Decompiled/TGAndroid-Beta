package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class cz0 {
    public final int f25477a;
    public final org.telegram.ui.Cells.w0 f25478b;
    public final org.telegram.ui.ActionBar.d6 f25479c;
    public final kj0 d;
    public TL_account.TL_birthday f25480e;
    public e11 f25481f;
    public e11[] f25482g;
    public e11[] h;
    public boolean f25483i;
    public e11 f25484j;
    public final RectF f25485k = new RectF();
    public final Paint f25486l = new Paint(1);
    public final zc f25487m;

    public cz0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25477a = i10;
        this.f25478b = w0Var;
        this.f25479c = d6Var;
        kj0 kj0Var = new kj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = kj0Var;
        kj0Var.H(false);
        this.f25487m = new zc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f25478b;
        int width = (w0Var.getWidth() - dp) / 2;
        kj0 kj0Var = this.d;
        kj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        kj0Var.draw(canvas);
        this.f25481f.c((w0Var.getWidth() - this.f25481f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f25481f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f25482g.length; i11++) {
            i10 = (int) (Math.max(this.f25482g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f25482g.length) {
            float max = Math.max(this.f25482g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            e11 e11Var = this.f25482g[i12];
            e11Var.c(f10 - (e11Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            e11 e11Var2 = this.h[i12];
            e11Var2.c(f10 - (e11Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f25483i) {
            canvas.save();
            float l4 = this.f25484j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f25485k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f25487m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f25486l);
            this.f25484j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        e5.m(this.f25478b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f25480e, new y2(this, 12), null, true, false, this.f25479c).f20373a.show();
    }
}
