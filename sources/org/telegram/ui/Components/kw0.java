package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.tgnet.tl.TL_account;
public final class kw0 {
    public final int f35493a;
    public final org.telegram.ui.Cells.t0 f35494b;
    public final org.telegram.ui.ActionBar.g6 f35495c;
    public final ah0 d;
    public TL_account.TL_birthday f35496e;
    public ny0 f35497f;
    public ny0[] f35498g;
    public ny0[] h;
    public boolean f35499i;
    public ny0 f35500j;
    public final RectF f35501k = new RectF();
    public final Paint f35502l = new Paint(1);
    public final ic f35503m;

    public kw0(int i7, org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f35493a = i7;
        this.f35494b = t0Var;
        this.f35495c = g6Var;
        ah0 ah0Var = new ah0(2131623955, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = ah0Var;
        ah0Var.H(false);
        this.f35503m = new ic(t0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.t0 t0Var = this.f35494b;
        int width = (t0Var.getWidth() - L) / 2;
        ah0 ah0Var = this.d;
        ah0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, org.telegram.messenger.g0.L(13.0f) + L);
        ah0Var.draw(canvas);
        this.f35497f.c((t0Var.getWidth() - this.f35497f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i7 = (int) (this.f35497f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f35498g.length; i11++) {
            i10 = (int) (Math.max(this.f35498g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (t0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f35498g.length) {
            float max = Math.max(this.f35498g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            ny0 ny0Var = this.f35498g[i12];
            ny0Var.c(f11 - (ny0Var.k() / 2.0f), i7, 0.75f, -1, canvas);
            ny0 ny0Var2 = this.h[i12];
            ny0Var2.c(f11 - (ny0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i7, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f35499i) {
            canvas.save();
            float k10 = this.f35500j.k() + org.telegram.messenger.g0.L(26.0f);
            float L2 = org.telegram.messenger.g0.L(30.0f);
            float L3 = org.telegram.messenger.g0.L(38.0f) + i7;
            RectF rectF = this.f35501k;
            rectF.set((t0Var.getWidth() - k10) / 2.0f, L3, (t0Var.getWidth() + k10) / 2.0f, L3 + L2);
            float a10 = this.f35503m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f12 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f35502l);
            this.f35500j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ((org.telegram.ui.ActionBar.v2) v4.l(this.f35494b.getContext(), org.telegram.messenger.id.M0(2131751672, null), org.telegram.messenger.id.M0(2131751671, null), this.f35496e, new s2(this, 11), null, true, false, this.f35495c).f14323b).show();
    }
}
