package org.telegram.ui.Components;

import android.graphics.Paint;
public final class a implements Runnable {
    public final int f31630a;
    public final f0 f31631b;

    public a(f0 f0Var, int i7) {
        this.f31630a = i7;
        this.f31631b = f0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f31630a;
        f0 f0Var = this.f31631b;
        switch (i7) {
            case 0:
                fi.m3 m3Var = f0Var.f33426w2;
                if (m3Var != null) {
                    m3Var.f(true);
                    f0Var.f33426w2 = null;
                }
                fi.m3 m3Var2 = new fi.m3(f0Var.getContext(), 1);
                f0Var.f33426w2 = m3Var2;
                m3Var2.t();
                f0Var.f33426w2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                f0Var.f33426w2.s(20.0f);
                fi.m3 m3Var3 = f0Var.f33426w2;
                float L = org.telegram.messenger.g0.L(12.0f);
                float L2 = org.telegram.messenger.g0.L(4.0f);
                int r12 = org.telegram.ui.ActionBar.m6.r1(0.25f, -16777216);
                Paint paint = m3Var3.F;
                m3Var3.f12430i0 = L;
                m3Var3.f12431j0 = L2;
                m3Var3.f12432k0 = r12;
                paint.setShadowLayer(L, 0.0f, L2, r12);
                f0Var.f33426w2.u(org.telegram.messenger.id.M0(2131755000, null));
                f0Var.f33426w2.o(0.5f, 0.0f);
                fi.m3 m3Var4 = f0Var.f33426w2;
                m3Var4.d = 8000L;
                f0Var.f28672b.addView(m3Var4, c8.ha.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                f0Var.f33426w2.w();
                f0Var.w1();
                return;
            case 1:
                if (!f0Var.F2) {
                    f0Var.f33428y2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (f0Var.F2) {
                    f0Var.f33427x2.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.K3(f0Var.f33425v2.d);
                return;
            default:
                f0Var.q1(0, 0, false);
                f0Var.dismiss();
                return;
        }
    }
}
