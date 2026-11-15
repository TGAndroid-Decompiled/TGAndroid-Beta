package org.telegram.ui.Components;

import android.graphics.Paint;
public final class a implements Runnable {
    public final int f32796a;
    public final d0 f32797b;

    public a(d0 d0Var, int i7) {
        this.f32796a = i7;
        this.f32797b = d0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f32796a;
        d0 d0Var = this.f32797b;
        switch (i7) {
            case 0:
                hi.l3 l3Var = d0Var.f33769x2;
                if (l3Var != null) {
                    l3Var.f(true);
                    d0Var.f33769x2 = null;
                }
                hi.l3 l3Var2 = new hi.l3(d0Var.getContext(), 1);
                d0Var.f33769x2 = l3Var2;
                l3Var2.t();
                d0Var.f33769x2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                d0Var.f33769x2.s(20.0f);
                hi.l3 l3Var3 = d0Var.f33769x2;
                float L = org.telegram.messenger.g0.L(12.0f);
                float L2 = org.telegram.messenger.g0.L(4.0f);
                int r12 = org.telegram.ui.ActionBar.j6.r1(0.25f, -16777216);
                Paint paint = l3Var3.G;
                l3Var3.f14561j0 = L;
                l3Var3.f14562k0 = L2;
                l3Var3.f14563l0 = r12;
                paint.setShadowLayer(L, 0.0f, L2, r12);
                d0Var.f33769x2.u(org.telegram.messenger.hd.M0(2131755000, null));
                d0Var.f33769x2.o(0.5f, 0.0f);
                hi.l3 l3Var4 = d0Var.f33769x2;
                l3Var4.d = 8000L;
                d0Var.f29682b.addView(l3Var4, c8.ja.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                d0Var.f33769x2.w();
                d0Var.w1();
                return;
            case 1:
                if (!d0Var.G2) {
                    d0Var.f33771z2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (d0Var.G2) {
                    d0Var.f33770y2.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.J3(d0Var.f33768w2.d);
                return;
            default:
                d0Var.q1(0, 0, false);
                d0Var.dismiss();
                return;
        }
    }
}
