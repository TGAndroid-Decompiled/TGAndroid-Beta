package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class gy0 {
    public final int f24442a;
    public final org.telegram.ui.Cells.w0 f24443b;
    public final org.telegram.ui.ActionBar.d6 f24444c;
    public final yi0 d;
    public TL_account.TL_birthday e;
    public f01 f24445f;
    public f01[] f24446g;
    public f01[] h;
    public boolean f24447i;
    public f01 f24448j;
    public final RectF f24449k = new RectF();
    public final Paint f24450l = new Paint(1);
    public final yc f24451m;

    public gy0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24442a = i10;
        this.f24443b = w0Var;
        this.f24444c = d6Var;
        yi0 yi0Var = new yi0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = yi0Var;
        yi0Var.H(false);
        this.f24451m = new yc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f24443b;
        int width = (w0Var.getWidth() - dp) / 2;
        yi0 yi0Var = this.d;
        yi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        yi0Var.draw(canvas);
        this.f24445f.c((w0Var.getWidth() - this.f24445f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f24445f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f24446g.length; i11++) {
            i10 = (int) (Math.max(this.f24446g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f24446g.length) {
            float max = Math.max(this.f24446g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            f01 f01Var = this.f24446g[i12];
            f01Var.c(f10 - (f01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            f01 f01Var2 = this.h[i12];
            f01Var2.c(f10 - (f01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f24447i) {
            canvas.save();
            float l4 = this.f24448j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f24449k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f24451m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f24450l);
            this.f24448j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        e5.m(this.f24443b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new x2(this, 12), null, true, false, this.f24444c).f18414a.show();
    }
}
