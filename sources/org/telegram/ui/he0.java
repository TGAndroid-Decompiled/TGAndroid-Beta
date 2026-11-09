package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class he0 implements Runnable {
    public final int f46301a;
    public final le0 f46302b;

    public he0(le0 le0Var, int i7) {
        this.f46301a = i7;
        this.f46302b = le0Var;
    }

    @Override
    public final void run() {
        ri.f fVar;
        qh.b[] bVarArr;
        int i7 = this.f46301a;
        le0 le0Var = this.f46302b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = le0Var.S) != null) {
                    fVar.f54583c.d = 0L;
                    le0Var.T.f54583c.d = 0L;
                    le0Var.i0();
                    return;
                }
                return;
            case 1:
                le0.g0(le0Var);
                return;
            case 2:
                le0Var.getClass();
                i9.l0(le0Var);
                return;
            case 3:
                le0.h0(le0Var);
                return;
            case 4:
                le0.f0(le0Var);
                return;
            case 5:
                org.telegram.messenger.g0.E2(le0Var.P);
                return;
            case 6:
                le0Var.getClass();
                new ch0(le0Var.getParentActivity(), le0Var).show();
                return;
            case 7:
                le0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                le0Var.presentFragment(new i9(bundle));
                return;
            default:
                if (le0Var.getParentActivity() != null && (bVarArr = le0Var.K) != null) {
                    qh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (le0Var.f49013b.getWidth() - ((bVar.getX() + le0Var.F.getX()) + bVar.getWidth()))) / org.telegram.messenger.g0.f22562p;
                    fi.m3 m3Var = new fi.m3(le0Var.getParentActivity(), 3);
                    le0Var.P = m3Var;
                    m3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-le0Var.L));
                    le0Var.P.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    le0Var.P.r(false);
                    le0Var.P.k(true);
                    le0Var.P.u(org.telegram.messenger.id.M0(2131744301, null));
                    le0Var.P.o(1.0f, (-width) + 7.33f);
                    le0Var.f49013b.addView(le0Var.P, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.m3 m3Var2 = le0Var.P;
                    m3Var2.f12437q0 = new he0(le0Var, 5);
                    m3Var2.d = 8000L;
                    m3Var2.w();
                    org.telegram.ui.Components.a30.f31693r.b();
                    return;
                }
                return;
        }
    }
}
