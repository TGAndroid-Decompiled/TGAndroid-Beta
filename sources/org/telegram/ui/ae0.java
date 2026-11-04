package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class ae0 implements Runnable {
    public final int f43764a;
    public final ee0 f43765b;

    public ae0(ee0 ee0Var, int i3) {
        this.f43764a = i3;
        this.f43765b = ee0Var;
    }

    @Override
    public final void run() {
        si.f fVar;
        rh.b[] bVarArr;
        int i3 = this.f43764a;
        ee0 ee0Var = this.f43765b;
        switch (i3) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = ee0Var.T) != null) {
                    fVar.f54754c.d = 0L;
                    ee0Var.U.f54754c.d = 0L;
                    ee0Var.i0();
                    return;
                }
                return;
            case 1:
                ee0.g0(ee0Var);
                return;
            case 2:
                ee0Var.getClass();
                h9.l0(ee0Var);
                return;
            case 3:
                ee0.h0(ee0Var);
                return;
            case 4:
                ee0.f0(ee0Var);
                return;
            case 5:
                org.telegram.messenger.g0.E2(ee0Var.Q);
                return;
            case 6:
                ee0Var.getClass();
                new vg0(ee0Var.getParentActivity(), ee0Var).show();
                return;
            case 7:
                ee0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ee0Var.presentFragment(new h9(bundle));
                return;
            default:
                if (ee0Var.getParentActivity() != null && (bVarArr = ee0Var.L) != null) {
                    rh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (ee0Var.f45621b.getWidth() - ((bVar.getX() + ee0Var.G.getX()) + bVar.getWidth()))) / org.telegram.messenger.g0.f22607p;
                    gi.l3 l3Var = new gi.l3(ee0Var.getParentActivity(), 3);
                    ee0Var.Q = l3Var;
                    l3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-ee0Var.M));
                    ee0Var.Q.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    ee0Var.Q.r(false);
                    ee0Var.Q.k(true);
                    ee0Var.Q.u(org.telegram.messenger.bd.M0(2131744311, null));
                    ee0Var.Q.o(1.0f, (-width) + 7.33f);
                    ee0Var.f45621b.addView(ee0Var.Q, b8.mf.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    gi.l3 l3Var2 = ee0Var.Q;
                    l3Var2.f13100r0 = new ae0(ee0Var, 5);
                    l3Var2.d = 8000L;
                    l3Var2.w();
                    org.telegram.ui.Components.v20.f38964r.b();
                    return;
                }
                return;
        }
    }
}
