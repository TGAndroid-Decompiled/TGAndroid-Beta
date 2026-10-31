package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.tgnet.tl.TL_account;
public final class nx0 {
    public final int f28904a;
    public final org.telegram.ui.Cells.s0 f28905b;
    public final org.telegram.ui.ActionBar.p6 f28906c;
    public final bi0 d;
    public TL_account.TL_birthday e;
    public qz0 f28907f;
    public qz0[] f28908g;
    public qz0[] h;
    public boolean f28909i;
    public qz0 f28910j;
    public final RectF f28911k = new RectF();
    public final Paint f28912l = new Paint(1);
    public final dc f28913m;

    public nx0(int i10, org.telegram.ui.Cells.s0 s0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f28904a = i10;
        this.f28905b = s0Var;
        this.f28906c = p6Var;
        bi0 bi0Var = new bi0(2131623955, org.telegram.messenger.i0.L(66.0f), org.telegram.messenger.i0.L(66.0f), true, null);
        this.d = bi0Var;
        bi0Var.H(false);
        this.f28913m = new dc(s0Var);
    }

    public final void a(Canvas canvas) {
        int L = org.telegram.messenger.i0.L(66.0f);
        org.telegram.ui.Cells.s0 s0Var = this.f28905b;
        int width = (s0Var.getWidth() - L) / 2;
        bi0 bi0Var = this.d;
        bi0Var.setBounds(width, org.telegram.messenger.i0.L(13.0f), width + L, org.telegram.messenger.i0.L(13.0f) + L);
        bi0Var.draw(canvas);
        this.f28907f.c((s0Var.getWidth() - this.f28907f.k()) / 2.0f, org.telegram.messenger.i0.L(19.0f) + L, 1.0f, -1, canvas);
        int i10 = (int) (this.f28907f.i() + org.telegram.messenger.i0.L(19.0f) + L + org.telegram.messenger.i0.L(17.0f));
        int i11 = 0;
        for (int i12 = 0; i12 < this.f28908g.length; i12++) {
            i11 = (int) (Math.max(this.f28908g[i12].k(), this.h[i12].k()) + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(9.0f) + i11);
        }
        int width2 = (s0Var.getWidth() - i11) / 2;
        int i13 = 0;
        while (i13 < this.f28908g.length) {
            float max = Math.max(this.f28908g[i13].k(), this.h[i13].k()) + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(9.0f);
            float f7 = width2;
            float f10 = (max / 2.0f) + f7;
            int i14 = (int) (f7 + max);
            qz0 qz0Var = this.f28908g[i13];
            qz0Var.c(f10 - (qz0Var.k() / 2.0f), i10, 0.75f, -1, canvas);
            qz0 qz0Var2 = this.h[i13];
            qz0Var2.c(f10 - (qz0Var2.k() / 2.0f), org.telegram.messenger.i0.L(16.0f) + i10, 1.0f, -1, canvas);
            i13++;
            width2 = i14;
        }
        if (this.f28909i) {
            canvas.save();
            float k10 = this.f28910j.k() + org.telegram.messenger.i0.L(26.0f);
            float L2 = org.telegram.messenger.i0.L(30.0f);
            float L3 = org.telegram.messenger.i0.L(38.0f) + i10;
            RectF rectF = this.f28911k;
            rectF.set((s0Var.getWidth() - k10) / 2.0f, L3, (s0Var.getWidth() + k10) / 2.0f, L3 + L2);
            float a2 = this.f28913m.a(0.1f);
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float f11 = L2 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.f28912l);
            this.f28910j.c(rectF.left + org.telegram.messenger.i0.L(13.0f), rectF.centerY(), 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final void b() {
        ((org.telegram.ui.ActionBar.z2) s4.l(this.f28905b.getContext(), org.telegram.messenger.cd.L0(2131751673, null), org.telegram.messenger.cd.L0(2131751672, null), this.e, new r2(this, 11), null, true, false, this.f28906c).f11587b).show();
    }
}
