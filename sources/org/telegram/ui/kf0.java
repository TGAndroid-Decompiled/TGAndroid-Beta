package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class kf0 implements Runnable {
    public final int f38871a;
    public final of0 f38872b;

    public kf0(of0 of0Var, int i10) {
        this.f38871a = i10;
        this.f38872b = of0Var;
    }

    @Override
    public final void run() {
        hi.f fVar;
        gh.b[] bVarArr;
        int i10 = this.f38871a;
        of0 of0Var = this.f38872b;
        switch (i10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = of0Var.S) != null) {
                    fVar.f7719c.d = 0L;
                    of0Var.T.f7719c.d = 0L;
                    of0Var.i0();
                    return;
                }
                return;
            case 1:
                of0.f0(of0Var);
                return;
            case 2:
                of0Var.getClass();
                j9.l0(of0Var);
                return;
            case 3:
                of0.h0(of0Var);
                return;
            case 4:
                of0.e0(of0Var);
                return;
            case 5:
                of0Var.getClass();
                new ei0(of0Var.getParentActivity(), of0Var).show();
                return;
            case 6:
                of0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                of0Var.presentFragment(new j9(bundle));
                return;
            case 7:
                if (of0Var.getParentActivity() != null && (bVarArr = of0Var.K) != null) {
                    gh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (of0Var.f37788b.getWidth() - ((bVar.getX() + of0Var.F.getX()) + bVar.getWidth()))) / org.telegram.messenger.i0.f16171p;
                    vh.p2 p2Var = new vh.p2(of0Var.getParentActivity(), 3);
                    of0Var.P = p2Var;
                    p2Var.setTranslationY(org.telegram.messenger.i0.L(4.0f) + (-of0Var.L));
                    of0Var.P.setPadding(org.telegram.messenger.i0.L(7.33f), 0, org.telegram.messenger.i0.L(7.33f), 0);
                    of0Var.P.p(false);
                    of0Var.P.i(true);
                    of0Var.P.s(org.telegram.messenger.dd.L0(2131744327, null));
                    of0Var.P.l(1.0f, (-width) + 7.33f);
                    of0Var.f37788b.addView(of0Var.P, w7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    vh.p2 p2Var2 = of0Var.P;
                    p2Var2.f51755l0 = new kf0(of0Var, 8);
                    p2Var2.d = 8000L;
                    p2Var2.u();
                    org.telegram.ui.Components.r30.f29870r.b();
                    return;
                }
                return;
            default:
                org.telegram.messenger.i0.E2(of0Var.P);
                return;
        }
    }
}
