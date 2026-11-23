package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class ge0 implements Runnable {
    public final int f48035a;
    public final le0 f48036b;

    public ge0(le0 le0Var, int i7) {
        this.f48035a = i7;
        this.f48036b = le0Var;
    }

    @Override
    public final void run() {
        ui.f fVar;
        qh.b[] bVarArr;
        int i7 = this.f48035a;
        le0 le0Var = this.f48036b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = le0Var.T) != null) {
                    fVar.f59013c.d = 0L;
                    le0Var.U.f59013c.d = 0L;
                    le0Var.i0();
                    return;
                }
                return;
            case 1:
                le0.f0(le0Var);
                return;
            case 2:
                le0Var.getClass();
                i9.l0(le0Var);
                return;
            case 3:
                le0.h0(le0Var);
                return;
            case 4:
                le0.e0(le0Var);
                return;
            case 5:
                le0Var.getClass();
                new fh0(le0Var.getParentActivity(), le0Var).show();
                return;
            case 6:
                le0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                le0Var.presentFragment(new i9(bundle));
                return;
            case 7:
                if (le0Var.getParentActivity() != null && (bVarArr = le0Var.L) != null) {
                    qh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (le0Var.f51133b.getWidth() - ((bVar.getX() + le0Var.G.getX()) + bVar.getWidth()))) / org.telegram.messenger.g0.f24009p;
                    hi.l3 l3Var = new hi.l3(le0Var.getParentActivity(), 3);
                    le0Var.Q = l3Var;
                    l3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-le0Var.M));
                    le0Var.Q.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    le0Var.Q.r(false);
                    le0Var.Q.k(true);
                    le0Var.Q.v(org.telegram.messenger.hd.N0(2131744060, null));
                    le0Var.Q.o(1.0f, (-width) + 7.33f);
                    le0Var.f51133b.addView(le0Var.Q, c8.na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    hi.l3 l3Var2 = le0Var.Q;
                    l3Var2.f14868r0 = new ge0(le0Var, 8);
                    l3Var2.d = 8000L;
                    l3Var2.x();
                    org.telegram.ui.Components.n30.f37714r.b();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.E2(le0Var.Q);
                return;
        }
    }
}
