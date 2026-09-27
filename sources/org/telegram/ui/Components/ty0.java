package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
public final class ty0 {
    public final int f28705a;
    public final org.telegram.ui.Cells.w0 f28706b;
    public final org.telegram.ui.ActionBar.e6 f28707c;
    public final kj0 d;
    public TL_account.TL_birthday e;
    public v01 f28708f;
    public v01[] f28709g;
    public v01[] h;
    public boolean f28710i;
    public v01 f28711j;
    public final RectF f28712k = new RectF();
    public final Paint f28713l = new Paint(1);
    public final yc f28714m;

    public ty0(int i10, org.telegram.ui.Cells.w0 w0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f28705a = i10;
        this.f28706b = w0Var;
        this.f28707c = e6Var;
        kj0 kj0Var = new kj0(R.raw.cake, AndroidUtilities.dp(66.0f), AndroidUtilities.dp(66.0f), true, null);
        this.d = kj0Var;
        kj0Var.H(false);
        this.f28714m = new yc(w0Var);
    }

    public final void a(Canvas canvas) {
        int dp = AndroidUtilities.dp(66.0f);
        org.telegram.ui.Cells.w0 w0Var = this.f28706b;
        int width = (w0Var.getWidth() - dp) / 2;
        kj0 kj0Var = this.d;
        kj0Var.setBounds(width, AndroidUtilities.dp(13.0f), width + dp, AndroidUtilities.dp(13.0f) + dp);
        kj0Var.draw(canvas);
        this.f28708f.c((w0Var.getWidth() - this.f28708f.l()) / 2.0f, AndroidUtilities.dp(19.0f) + dp, 1.0f, -1, canvas);
        int j3 = (int) (this.f28708f.j() + AndroidUtilities.dp(19.0f) + dp + AndroidUtilities.dp(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f28709g.length; i11++) {
            i10 = (int) (Math.max(this.f28709g[i11].l(), this.h[i11].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f) + i10);
        }
        int width2 = (w0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f28709g.length) {
            float max = Math.max(this.f28709g[i12].l(), this.h[i12].l()) + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i13 = (int) (f7 + max);
            v01 v01Var = this.f28709g[i12];
            v01Var.c(f10 - (v01Var.l() / 2.0f), j3, 0.75f, -1, canvas);
            v01 v01Var2 = this.h[i12];
            v01Var2.c(f10 - (v01Var2.l() / 2.0f), AndroidUtilities.dp(16.0f) + j3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f28710i) {
            canvas.save();
            float l4 = this.f28711j.l() + AndroidUtilities.dp(26.0f);
            float dp2 = AndroidUtilities.dp(30.0f);
            float dp3 = AndroidUtilities.dp(38.0f) + j3;
            RectF rectF = this.f28712k;
            rectF.set((w0Var.getWidth() - l4) / 2.0f, dp3, (w0Var.getWidth() + l4) / 2.0f, dp3 + dp2);
            float a2 = this.f28714m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = dp2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f28713l);
            this.f28711j.c(rectF.left + AndroidUtilities.dp(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        e5.m(this.f28706b.getContext(), LocaleController.getString(R.string.DateOfBirth), LocaleController.getString(R.string.DateOfBirthAddToProfile), this.e, new y2(this, 12), null, true, false, this.f28707c).f18683a.show();
    }
}
