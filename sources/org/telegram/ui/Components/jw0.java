package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.tgnet.tl.TL_account;
public final class jw0 {
    public final int f35058a;
    public final org.telegram.ui.Cells.t0 f35059b;
    public final org.telegram.ui.ActionBar.f6 f35060c;
    public final zg0 d;
    public TL_account.TL_birthday f35061e;
    public ly0 f35062f;
    public ly0[] f35063g;
    public ly0[] h;
    public boolean f35064i;
    public ly0 f35065j;
    public final RectF f35066k = new RectF();
    public final Paint f35067l = new Paint(1);
    public final ic f35068m;

    public jw0(int i7, org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f35058a = i7;
        this.f35059b = t0Var;
        this.f35060c = f6Var;
        zg0 zg0Var = new zg0(2131623955, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = zg0Var;
        zg0Var.H(false);
        this.f35068m = new ic(t0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.t0 t0Var = this.f35059b;
        int width = (t0Var.getWidth() - L) / 2;
        zg0 zg0Var = this.d;
        zg0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, org.telegram.messenger.g0.L(13.0f) + L);
        zg0Var.draw(canvas);
        this.f35062f.c((t0Var.getWidth() - this.f35062f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i7 = (int) (this.f35062f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f35063g.length; i11++) {
            i10 = (int) (Math.max(this.f35063g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (t0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f35063g.length) {
            float max = Math.max(this.f35063g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            ly0 ly0Var = this.f35063g[i12];
            ly0Var.c(f11 - (ly0Var.k() / 2.0f), i7, 0.75f, -1, canvas);
            ly0 ly0Var2 = this.h[i12];
            ly0Var2.c(f11 - (ly0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i7, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f35064i) {
            canvas.save();
            float k10 = this.f35065j.k() + org.telegram.messenger.g0.L(26.0f);
            float L2 = org.telegram.messenger.g0.L(30.0f);
            float L3 = org.telegram.messenger.g0.L(38.0f) + i7;
            RectF rectF = this.f35066k;
            rectF.set((t0Var.getWidth() - k10) / 2.0f, L3, (t0Var.getWidth() + k10) / 2.0f, L3 + L2);
            float a10 = this.f35068m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f12 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f35067l);
            this.f35065j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ((org.telegram.ui.ActionBar.v2) v4.l(this.f35059b.getContext(), org.telegram.messenger.hd.M0(2131751673, null), org.telegram.messenger.hd.M0(2131751672, null), this.f35061e, new s2(this, 11), null, true, false, this.f35060c).f14323b).show();
    }
}
