package org.telegram.ui;

import android.os.Build;
import android.os.Bundle;
public final class he0 implements Runnable {
    public final int f48338a;
    public final me0 f48339b;

    public he0(me0 me0Var, int i7) {
        this.f48338a = i7;
        this.f48339b = me0Var;
    }

    @Override
    public final void run() {
        ui.f fVar;
        qh.b[] bVarArr;
        int i7 = this.f48338a;
        me0 me0Var = this.f48339b;
        switch (i7) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = me0Var.T) != null) {
                    fVar.f59006c.d = 0L;
                    me0Var.U.f59006c.d = 0L;
                    me0Var.i0();
                    return;
                }
                return;
            case 1:
                me0.f0(me0Var);
                return;
            case 2:
                me0Var.getClass();
                i9.l0(me0Var);
                return;
            case 3:
                me0.h0(me0Var);
                return;
            case 4:
                me0.e0(me0Var);
                return;
            case 5:
                me0Var.getClass();
                new fh0(me0Var.getParentActivity(), me0Var).show();
                return;
            case 6:
                me0Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                me0Var.presentFragment(new i9(bundle));
                return;
            case 7:
                if (me0Var.getParentActivity() != null && (bVarArr = me0Var.L) != null) {
                    qh.b bVar = bVarArr[4];
                    float width = ((bVar.getWidth() / 2.0f) + (me0Var.f51152b.getWidth() - ((bVar.getX() + me0Var.G.getX()) + bVar.getWidth()))) / org.telegram.messenger.g0.f24117p;
                    hi.m3 m3Var = new hi.m3(me0Var.getParentActivity(), 3);
                    me0Var.Q = m3Var;
                    m3Var.setTranslationY(org.telegram.messenger.g0.L(4.0f) + (-me0Var.M));
                    me0Var.Q.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    me0Var.Q.r(false);
                    me0Var.Q.k(true);
                    me0Var.Q.v(org.telegram.messenger.gd.M0(2131744066, null));
                    me0Var.Q.o(1.0f, (-width) + 7.33f);
                    me0Var.f51152b.addView(me0Var.Q, c8.ma.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    hi.m3 m3Var2 = me0Var.Q;
                    m3Var2.f15011r0 = new he0(me0Var, 8);
                    m3Var2.d = 8000L;
                    m3Var2.x();
                    org.telegram.ui.Components.k30.f36657r.b();
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.E2(me0Var.Q);
                return;
        }
    }
}
