package org.telegram.ui.Components;

import android.graphics.Paint;
public final class a implements Runnable {
    public final int f31612a;
    public final g0 f31613b;

    public a(g0 g0Var, int i7) {
        this.f31612a = i7;
        this.f31613b = g0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f31612a;
        g0 g0Var = this.f31613b;
        switch (i7) {
            case 0:
                fi.m3 m3Var = g0Var.f33750t2;
                if (m3Var != null) {
                    m3Var.f(true);
                    g0Var.f33750t2 = null;
                }
                fi.m3 m3Var2 = new fi.m3(g0Var.getContext(), 1);
                g0Var.f33750t2 = m3Var2;
                m3Var2.t();
                g0Var.f33750t2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                g0Var.f33750t2.s(20.0f);
                fi.m3 m3Var3 = g0Var.f33750t2;
                float L = org.telegram.messenger.g0.L(12.0f);
                float L2 = org.telegram.messenger.g0.L(4.0f);
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                Paint paint = m3Var3.F;
                m3Var3.f12428i0 = L;
                m3Var3.f12429j0 = L2;
                m3Var3.f12430k0 = r12;
                paint.setShadowLayer(L, 0.0f, L2, r12);
                g0Var.f33750t2.u(org.telegram.messenger.hd.M0(2131755000, null));
                g0Var.f33750t2.o(0.5f, 0.0f);
                fi.m3 m3Var4 = g0Var.f33750t2;
                m3Var4.d = 8000L;
                g0Var.f28615b.addView(m3Var4, c8.ha.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                g0Var.f33750t2.w();
                g0Var.w1();
                return;
            case 1:
                if (!g0Var.C2) {
                    g0Var.f33752v2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (g0Var.C2) {
                    g0Var.f33751u2.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.K3(g0Var.f33749s2.d);
                return;
            default:
                g0Var.q1(0, 0, false);
                g0Var.dismiss();
                return;
        }
    }
}
