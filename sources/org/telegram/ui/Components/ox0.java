package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class ox0 {
    public final int f31461a;
    public final org.telegram.ui.Cells.w0 f31462b;
    public final org.telegram.ui.ActionBar.b6 f31463c;
    public final mi0 d;
    public TL_account.TL_birthday f31464e;
    public nz0 f31465f;
    public nz0[] f31466g;
    public nz0[] h;
    public boolean f31467i;
    public nz0 f31468j;
    public final RectF f31469k = new RectF();
    public final Paint f31470l = new Paint(1);
    public final pc f31471m;

    public ox0(int i9, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f31461a = i9;
        this.f31462b = w0Var;
        this.f31463c = b6Var;
        mi0 mi0Var = new mi0(R.raw.cake, "cake", AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = mi0Var;
        mi0Var.F(false);
        this.f31471m = new pc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f31462b;
        int width = (w0Var.getWidth() - dp) / 2;
        mi0 mi0Var = this.d;
        mi0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        mi0Var.draw(canvas);
        this.f31465f.c((w0Var.getWidth() - this.f31465f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j10 = (int) (this.f31465f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i9 = 0;
        for (int i10 = 0; i10 < this.f31466g.length; i10++) {
            i9 = (int) (Math.max(this.f31466g[i10].l(), this.h[i10].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i9);
        }
        int width2 = (w0Var.getWidth() - i9) / 2;
        int i11 = 0;
        while (i11 < this.f31466g.length) {
            float max = Math.max(this.f31466g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i12 = (int) (f10 + max);
            nz0 nz0Var = this.f31466g[i11];
            nz0Var.c(f11 - (nz0Var.l() / 2.0f), j10, 0.75f, -1, canvas);
            nz0 nz0Var2 = this.h[i11];
            nz0Var2.c(f11 - (nz0Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j10, 1.0f, -1, canvas);
            i11++;
            width2 = i12;
        }
        if (this.f31467i) {
            canvas.save();
            float l10 = this.f31468j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j10;
            RectF rectF = this.f31469k;
            rectF.set((w0Var.getWidth() - l10) / 2.0f, dp3, (w0Var.getWidth() + l10) / 2.0f, dp3 + dp2);
            float a2 = this.f31471m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f12 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f31470l);
            this.f31468j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        y4.m(this.f31462b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.f31464e, new v2(this, 11), null, true, false, this.f31463c).f22713a.show();
    }
}
