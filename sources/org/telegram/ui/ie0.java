package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class ie0 implements Runnable {
    public final int f46626a;
    public final me0 f46627b;

    public ie0(me0 me0Var, int i7) {
        this.f46626a = i7;
        this.f46627b = me0Var;
    }

    @Override
    public final void run() {
        ri.f fVar;
        qh.b[] bVarArr;
        int i7 = this.f46626a;
        me0 me0Var = this.f46627b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = me0Var.S) != null) {
                    fVar.f54582c.d = 0L;
                    me0Var.T.f54582c.d = 0L;
                    me0Var.i0();
                    return;
                }
                return;
            case 1:
                me0.g0(me0Var);
                return;
            case 2:
                me0Var.getClass();
                i9.l0(me0Var);
                return;
            case 3:
                me0.h0(me0Var);
                return;
            case 4:
                me0.f0(me0Var);
                return;
            case 5:
                org.telegram.messenger.g0.E2(me0Var.P);
                return;
            case 6:
                me0Var.getClass();
                new dh0(me0Var.getParentActivity(), me0Var).show();
                return;
            case 7:
                me0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                me0Var.presentFragment(new i9(bundle));
                return;
            default:
                if (me0Var.getParentActivity() != null && (bVarArr = me0Var.K) != null) {
                    qh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (me0Var.f49344b.getWidth() - ((bVar.getX() + me0Var.F.getX()) + bVar.getWidth()))) / org.telegram.messenger.g0.f22566p;
                    fi.m3 m3Var = new fi.m3(me0Var.getParentActivity(), 3);
                    me0Var.P = m3Var;
                    m3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-me0Var.L));
                    me0Var.P.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    me0Var.P.r(false);
                    me0Var.P.k(true);
                    me0Var.P.u(org.telegram.messenger.id.M0(2131744301, null));
                    me0Var.P.o(1.0f, (-width) + 7.33f);
                    me0Var.f49344b.addView(me0Var.P, c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    fi.m3 m3Var2 = me0Var.P;
                    m3Var2.f12438q0 = new ie0(me0Var, 5);
                    m3Var2.d = 8000L;
                    m3Var2.w();
                    org.telegram.ui.Components.z20.f40835r.b();
                    return;
                }
                return;
        }
    }
}
