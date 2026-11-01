package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class tr0 extends g.o {
    public final int f30704c;
    public final Object d;
    public final ViewGroup e;

    public tr0(ViewGroup viewGroup, Object obj, int i10) {
        this.f30704c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.f30704c) {
            case 0:
                ts0 ts0Var = (ts0) this.d;
                s4.g0 adapter = ts0Var.f30719n.getAdapter();
                au0 au0Var = (au0) this.e;
                ut0 ut0Var = au0Var.K;
                if (adapter == ut0Var) {
                    if (ut0Var.d(i10) != 2) {
                        return 1;
                    }
                    return ts0Var.f30720r.J;
                } else if (au0.w(au0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((xt0) adapter).getClass();
                    return 1;
                }
            case 1:
                t51 t51Var = (t51) this.d;
                q51 q51Var = ((v51) this.e).f31183f3;
                if (q51Var == null) {
                    return t51Var.J;
                }
                b51 G = q51Var.G(i10);
                if (G == null || (i11 = G.f24652u) == -1) {
                    return t51Var.J;
                }
                return i11;
            default:
                t51 t51Var2 = (t51) this.d;
                q51 q51Var2 = ((v51) this.e).f31183f3;
                if (q51Var2 == null) {
                    return t51Var2.J;
                }
                b51 G2 = q51Var2.G(i10);
                if (G2 == null || (i12 = G2.f24652u) == -1) {
                    return t51Var2.J;
                }
                return i12;
        }
    }
}
