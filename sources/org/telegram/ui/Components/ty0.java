package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class ty0 {
    public final int f27511a;
    public final org.telegram.ui.Cells.w0 f27512b;
    public final org.telegram.ui.ActionBar.f6 f27513c;
    public final hj0 d;
    public TL_account.TL_birthday e;
    public t01 f27514f;
    public t01[] f27515g;
    public t01[] h;
    public boolean f27516i;
    public t01 f27517j;
    public final RectF f27518k = new RectF();
    public final Paint f27519l = new Paint(1);
    public final xc f27520m;

    public ty0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27511a = i10;
        this.f27512b = w0Var;
        this.f27513c = f6Var;
        hj0 hj0Var = new hj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = hj0Var;
        hj0Var.H(false);
        this.f27520m = new xc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f27512b;
        int width = (w0Var.getWidth() - dp) / 2;
        hj0 hj0Var = this.d;
        hj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        hj0Var.draw(canvas);
        this.f27514f.c((w0Var.getWidth() - this.f27514f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f27514f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27515g.length; i11++) {
            i10 = (int) (Math.max(this.f27515g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f27515g.length) {
            float max = Math.max(this.f27515g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            t01 t01Var = this.f27515g[i12];
            t01Var.c(f10 - (t01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            t01 t01Var2 = this.h[i12];
            t01Var2.c(f10 - (t01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f27516i) {
            canvas.save();
            float l4 = this.f27517j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f27518k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f27520m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f27519l);
            this.f27517j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        d5.m(this.f27512b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new y2(this, 11), null, true, false, this.f27513c).f17571a.show();
    }
}
