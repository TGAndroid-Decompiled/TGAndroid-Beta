package org.telegram.ui.Components;

import android.graphics.Paint;
public final class a implements Runnable {
    public final int f24258a;
    public final g0 f24259b;

    public a(g0 g0Var, int i10) {
        this.f24258a = i10;
        this.f24259b = g0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f24258a;
        g0 g0Var = this.f24259b;
        switch (i10) {
            case 0:
                vh.p2 p2Var = g0Var.f26258t2;
                if (p2Var != null) {
                    p2Var.e(true);
                    g0Var.f26258t2 = null;
                }
                vh.p2 p2Var2 = new vh.p2(g0Var.getContext(), 1);
                g0Var.f26258t2 = p2Var2;
                p2Var2.r();
                g0Var.f26258t2.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
                g0Var.f26258t2.q(20.0f);
                vh.p2 p2Var3 = g0Var.f26258t2;
                float L = org.telegram.messenger.i0.L(12.0f);
                float L2 = org.telegram.messenger.i0.L(4.0f);
                int r12 = org.telegram.ui.ActionBar.t6.r1(0.25f, -16777216);
                Paint paint = p2Var3.F;
                p2Var3.f51752i0 = L;
                p2Var3.f51753j0 = L2;
                p2Var3.f51754k0 = r12;
                paint.setShadowLayer(L, 0.0f, L2, r12);
                g0Var.f26258t2.s(org.telegram.messenger.dd.L0(2131755000, null));
                g0Var.f26258t2.l(0.5f, 0.0f);
                vh.p2 p2Var4 = g0Var.f26258t2;
                p2Var4.d = 8000L;
                g0Var.f21587b.addView(p2Var4, w7.b6.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                g0Var.f26258t2.u();
                g0Var.w1();
                return;
            case 1:
                if (!g0Var.C2) {
                    g0Var.f26260v2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (g0Var.C2) {
                    g0Var.f26259u2.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.i0.J3(g0Var.f26257s2.d);
                return;
            default:
                g0Var.q1(0, 0, false);
                g0Var.dismiss();
                return;
        }
    }
}
