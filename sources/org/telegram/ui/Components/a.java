package org.telegram.ui.Components;
public final class a implements Runnable {
    public final int f33226a;
    public final n0 f33227b;

    public a(n0 n0Var, int i7) {
        this.f33226a = i7;
        this.f33227b = n0Var;
    }

    @Override
    public final void run() {
        int i7 = this.f33226a;
        n0 n0Var = this.f33227b;
        switch (i7) {
            case 0:
                m0 m0Var = n0Var.f37704v2;
                if (m0Var == null || m0Var.getSelectedTone() == null) {
                    hi.l3 l3Var = n0Var.f37708z2;
                    if (l3Var != null) {
                        l3Var.f(true);
                        n0Var.f37708z2 = null;
                    }
                    hi.l3 l3Var2 = new hi.l3(n0Var.getContext(), 1);
                    n0Var.f37708z2 = l3Var2;
                    l3Var2.t();
                    n0Var.f37708z2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                    n0Var.f37708z2.s(20.0f);
                    n0Var.f37708z2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.r1(0.25f, -16777216));
                    n0Var.f37708z2.v(org.telegram.messenger.gd.N0(2131755000, null));
                    if (i0.a.h(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29378d6, n0Var.J0)) < 0.5d) {
                        n0Var.f37708z2.j(956301311);
                        hi.l3 l3Var3 = n0Var.f37708z2;
                        l3Var3.I.u(-1);
                        l3Var3.K.setColor(-1);
                        n0Var.f37708z2.u(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.m6.r1(0.12f, -16777216));
                    }
                    n0Var.f37708z2.o(0.5f, 0.0f);
                    hi.l3 l3Var4 = n0Var.f37708z2;
                    l3Var4.d = 8000L;
                    n0Var.f30173b.addView(l3Var4, c8.ma.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                    n0Var.f37708z2.x();
                    n0Var.D1();
                    return;
                }
                return;
            case 1:
                if (!n0Var.I2) {
                    n0Var.B2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (n0Var.I2) {
                    n0Var.A2.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.I3(n0Var.f37707y2.d);
                return;
            default:
                n0Var.u1(0, 0, false);
                n0Var.dismiss();
                return;
        }
    }
}
