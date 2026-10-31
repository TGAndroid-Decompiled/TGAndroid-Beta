package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class sr0 extends g.o {
    public final int f30345c;
    public final Object d;
    public final ViewGroup e;

    public sr0(ViewGroup viewGroup, Object obj, int i10) {
        this.f30345c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.f30345c) {
            case 0:
                ss0 ss0Var = (ss0) this.d;
                s4.g0 adapter = ss0Var.f30352n.getAdapter();
                zt0 zt0Var = (zt0) this.e;
                tt0 tt0Var = zt0Var.K;
                if (adapter == tt0Var) {
                    if (tt0Var.d(i10) != 2) {
                        return 1;
                    }
                    return ss0Var.f30353r.J;
                } else if (zt0.w(zt0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((wt0) adapter).getClass();
                    return 1;
                }
            case 1:
                s51 s51Var = (s51) this.d;
                p51 p51Var = ((u51) this.e).f30819f3;
                if (p51Var == null) {
                    return s51Var.J;
                }
                a51 G = p51Var.G(i10);
                if (G == null || (i11 = G.f24301u) == -1) {
                    return s51Var.J;
                }
                return i11;
            default:
                s51 s51Var2 = (s51) this.d;
                p51 p51Var2 = ((u51) this.e).f30819f3;
                if (p51Var2 == null) {
                    return s51Var2.J;
                }
                a51 G2 = p51Var2.G(i10);
                if (G2 == null || (i12 = G2.f24301u) == -1) {
                    return s51Var2.J;
                }
                return i12;
        }
    }
}
