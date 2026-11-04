package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.tgnet.tl.TL_account;
public final class iw0 {
    public final int f34837a;
    public final org.telegram.ui.Cells.t0 f34838b;
    public final org.telegram.ui.ActionBar.e6 f34839c;
    public final ch0 d;
    public TL_account.TL_birthday f34840e;
    public ly0 f34841f;
    public ly0[] f34842g;
    public ly0[] h;
    public boolean f34843i;
    public ly0 f34844j;
    public final RectF f34845k = new RectF();
    public final Paint f34846l = new Paint(1);
    public final gc f34847m;

    public iw0(int i3, org.telegram.ui.Cells.t0 t0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f34837a = i3;
        this.f34838b = t0Var;
        this.f34839c = e6Var;
        ch0 ch0Var = new ch0(2131623955, org.telegram.messenger.g0.L(66.0f), org.telegram.messenger.g0.L(66.0f), true, null);
        this.d = ch0Var;
        ch0Var.H(false);
        this.f34847m = new gc(t0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.g0.L(66.0f);
        org.telegram.ui.Cells.t0 t0Var = this.f34838b;
        int width = (t0Var.getWidth() - L) / 2;
        ch0 ch0Var = this.d;
        ch0Var.setBounds(width, org.telegram.messenger.g0.L(13.0f), width + L, org.telegram.messenger.g0.L(13.0f) + L);
        ch0Var.draw(canvas);
        this.f34841f.c((t0Var.getWidth() - this.f34841f.k()) / 2.0f, org.telegram.messenger.g0.L(19.0f) + L, 1.0f, -1, canvas);
        int i3 = (int) (this.f34841f.i() + org.telegram.messenger.g0.L(19.0f) + L + org.telegram.messenger.g0.L(17.0f));
        int i10 = 0;
        for (int i11 = 0; i11 < this.f34842g.length; i11++) {
            i10 = (int) (Math.max(this.f34842g[i11].k(), this.h[i11].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f) + i10);
        }
        int width2 = (t0Var.getWidth() - i10) / 2;
        int i12 = 0;
        while (i12 < this.f34842g.length) {
            float max = Math.max(this.f34842g[i12].k(), this.h[i12].k()) + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(9.0f);
            float f10 = width2;
            float f11 = (max / 2.0f) + f10;
            int i13 = (int) (f10 + max);
            ly0 ly0Var = this.f34842g[i12];
            ly0Var.c(f11 - (ly0Var.k() / 2.0f), i3, 0.75f, -1, canvas);
            ly0 ly0Var2 = this.h[i12];
            ly0Var2.c(f11 - (ly0Var2.k() / 2.0f), org.telegram.messenger.g0.L(16.0f) + i3, 1.0f, -1, canvas);
            i12++;
            width2 = i13;
        }
        if (this.f34843i) {
            canvas.save();
            float k10 = this.f34844j.k() + org.telegram.messenger.g0.L(26.0f);
            float L2 = org.telegram.messenger.g0.L(30.0f);
            float L3 = org.telegram.messenger.g0.L(38.0f) + i3;
            RectF rectF = this.f34845k;
            rectF.set((t0Var.getWidth() - k10) / 2.0f, L3, (t0Var.getWidth() + k10) / 2.0f, L3 + L2);
            float a10 = this.f34847m.a(0.1f);
            canvas.scale(a10, a10, rectF.centerX(), rectF.centerY());
            float f12 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f12, f12, this.f34846l);
            this.f34844j.c(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ((org.telegram.ui.ActionBar.t2) t4.l(this.f34838b.getContext(), org.telegram.messenger.bd.M0(2131751673, null), org.telegram.messenger.bd.M0(2131751672, null), this.f34840e, new p2(this, 11), null, true, false, this.f34839c).f14429b).show();
    }
}
