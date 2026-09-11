package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class gy0 {
    public final int f26524a;
    public final org.telegram.ui.Cells.w0 f26525b;
    public final org.telegram.ui.ActionBar.f6 f26526c;
    public final xi0 d;
    public TL_account.TL_birthday f26527e;
    public f01 f26528f;
    public f01[] f26529g;
    public f01[] h;
    public boolean f26530i;
    public f01 f26531j;
    public final RectF f26532k = new RectF();
    public final Paint f26533l = new Paint(1);
    public final zc f26534m;

    public gy0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f26524a = i10;
        this.f26525b = w0Var;
        this.f26526c = f6Var;
        xi0 xi0Var = new xi0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = xi0Var;
        xi0Var.F(false);
        this.f26534m = new zc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f26525b;
        int width = (w0Var.getWidth() - dp) / 2;
        xi0 xi0Var = this.d;
        xi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        xi0Var.draw(canvas);
        this.f26528f.c((w0Var.getWidth() - this.f26528f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f26528f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f26529g.length; i11++) {
            i10 = (int) (Math.max(this.f26529g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f26529g.length) {
            float max = Math.max(this.f26529g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            f01 f01Var = this.f26529g[i12];
            f01Var.c(f10 - (f01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            f01 f01Var2 = this.h[i12];
            f01Var2.c(f10 - (f01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f26530i) {
            canvas.save();
            float l4 = this.f26531j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f26532k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f26534m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f26533l);
            this.f26531j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        e5.m(this.f26525b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f26527e, new y2(this, 11), null, true, false, this.f26526c).f20204a.show();
    }
}
