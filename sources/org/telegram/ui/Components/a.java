package org.telegram.ui.Components;

import android.graphics.Paint;
public final class a implements Runnable {
    public final int f31691a;
    public final e0 f31692b;

    public a(e0 e0Var, int i3) {
        this.f31691a = i3;
        this.f31692b = e0Var;
    }

    @Override
    public final void run() {
        int i3 = this.f31691a;
        e0 e0Var = this.f31692b;
        switch (i3) {
            case 0:
                gi.l3 l3Var = e0Var.f33253u2;
                if (l3Var != null) {
                    l3Var.f(true);
                    e0Var.f33253u2 = null;
                }
                gi.l3 l3Var2 = new gi.l3(e0Var.getContext(), 1);
                e0Var.f33253u2 = l3Var2;
                l3Var2.t();
                e0Var.f33253u2.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
                e0Var.f33253u2.s(20.0f);
                gi.l3 l3Var3 = e0Var.f33253u2;
                float L = org.telegram.messenger.g0.L(12.0f);
                float L2 = org.telegram.messenger.g0.L(4.0f);
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.25f, -16777216);
                Paint paint = l3Var3.G;
                l3Var3.f13091j0 = L;
                l3Var3.f13092k0 = L2;
                l3Var3.f13093l0 = r12;
                paint.setShadowLayer(L, 0.0f, L2, r12);
                e0Var.f33253u2.u(org.telegram.messenger.bd.M0(2131755000, null));
                e0Var.f33253u2.o(0.5f, 0.0f);
                gi.l3 l3Var4 = e0Var.f33253u2;
                l3Var4.d = 8000L;
                e0Var.f28586b.addView(l3Var4, b8.mf.d(-1, 200.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
                e0Var.f33253u2.w();
                e0Var.w1();
                return;
            case 1:
                if (!e0Var.D2) {
                    e0Var.f33255w2.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (e0Var.D2) {
                    e0Var.f33254v2.setVisibility(8);
                    return;
                }
                return;
            case 3:
                org.telegram.messenger.g0.K3(e0Var.f33252t2.d);
                return;
            default:
                e0Var.q1(0, 0, false);
                e0Var.dismiss();
                return;
        }
    }
}
