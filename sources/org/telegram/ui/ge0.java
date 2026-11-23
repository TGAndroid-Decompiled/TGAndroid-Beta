package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class ge0 implements Runnable {
    public final int f48282a;
    public final le0 f48283b;

    public ge0(le0 le0Var, int i7) {
        this.f48282a = i7;
        this.f48283b = le0Var;
    }

    @Override
    public final void run() {
        ui.f fVar;
        qh.b[] bVarArr;
        int i7 = this.f48282a;
        le0 le0Var = this.f48283b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = le0Var.T) != null) {
                    fVar.f59130c.d = 0L;
                    le0Var.U.f59130c.d = 0L;
                    le0Var.i0();
                    return;
                }
                return;
            case 1:
                le0.f0(le0Var);
                return;
            case 2:
                le0Var.getClass();
                j9.l0(le0Var);
                return;
            case 3:
                le0.h0(le0Var);
                return;
            case 4:
                le0.e0(le0Var);
                return;
            case 5:
                le0Var.getClass();
                new dh0(le0Var.getParentActivity(), le0Var).show();
                return;
            case 6:
                le0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                le0Var.presentFragment(new j9(bundle));
                return;
            case 7:
                if (le0Var.getParentActivity() != null && (bVarArr = le0Var.L) != null) {
                    qh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (le0Var.f50633b.getWidth() - ((bVar.getX() + le0Var.G.getX()) + bVar.getWidth()))) / org.telegram.messenger.g0.f24225p;
                    hi.u3 u3Var = new hi.u3(le0Var.getParentActivity(), 3);
                    le0Var.Q = u3Var;
                    u3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-le0Var.M));
                    le0Var.Q.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    le0Var.Q.r(false);
                    le0Var.Q.k(true);
                    le0Var.Q.v(org.telegram.messenger.gd.N0(2131744056, null));
                    le0Var.Q.o(1.0f, (-width) + 7.33f);
                    le0Var.f50633b.addView(le0Var.Q, c8.na.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    hi.u3 u3Var2 = le0Var.Q;
                    u3Var2.f15506r0 = new ge0(le0Var, 8);
                    u3Var2.d = 8000L;
                    u3Var2.x();
                    org.telegram.ui.Components.k30.f36625r.b();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.E2(le0Var.Q);
                return;
        }
    }
}
