package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class kf0 implements Runnable {
    public final int f38790a;
    public final pf0 f38791b;

    public kf0(pf0 pf0Var, int i10) {
        this.f38790a = i10;
        this.f38791b = pf0Var;
    }

    @Override
    public final void run() {
        gh.b[] bVarArr;
        int i10 = this.f38790a;
        pf0 pf0Var = this.f38791b;
        switch (i10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    hi.f fVar = pf0Var.S;
                    if (fVar != null) {
                        fVar.f7718c.d = 0L;
                        pf0Var.h0();
                        return;
                    }
                    return;
                }
                pf0Var.getClass();
                return;
            case 1:
                pf0.e0(pf0Var);
                return;
            case 2:
                pf0Var.getClass();
                j9.k0(pf0Var);
                return;
            case 3:
                pf0.g0(pf0Var);
                return;
            case 4:
                pf0.d0(pf0Var);
                return;
            case 5:
                pf0Var.getClass();
                new gi0(pf0Var.getParentActivity(), pf0Var).show();
                return;
            case 6:
                pf0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                pf0Var.presentFragment(new j9(bundle));
                return;
            case 7:
                if (pf0Var.getParentActivity() != null && (bVarArr = pf0Var.K) != null) {
                    gh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (pf0Var.f38498b.getWidth() - ((bVar.getX() + pf0Var.F.getX()) + bVar.getWidth()))) / org.telegram.messenger.i0.f16025p;
                    vh.p2 p2Var = new vh.p2(pf0Var.getParentActivity(), 3);
                    pf0Var.P = p2Var;
                    p2Var.setTranslationY(org.telegram.messenger.i0.L(4.0f) + (-pf0Var.L));
                    pf0Var.P.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                    pf0Var.P.p(false);
                    pf0Var.P.i(true);
                    pf0Var.P.s(org.telegram.messenger.cd.L0(2131744327, null));
                    pf0Var.P.l(1.0f, (-width) + 7.33f);
                    pf0Var.f38498b.addView(pf0Var.P, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    vh.p2 p2Var2 = pf0Var.P;
                    p2Var2.f51740l0 = new kf0(pf0Var, 8);
                    p2Var2.d = 8000L;
                    p2Var2.u();
                    org.telegram.ui.Components.r30.f29812r.b();
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.E2(pf0Var.P);
                return;
        }
    }
}
