package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rq0 extends g.p {
    public final int f37778c;
    public final Object d;
    public final ViewGroup f37779e;

    public rq0(ViewGroup viewGroup, Object obj, int i3) {
        this.f37778c = i3;
        this.f37779e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i3) {
        int i10;
        int i11;
        switch (this.f37778c) {
            case 0:
                rr0 rr0Var = (rr0) this.d;
                u4.h0 adapter = rr0Var.f37787n.getAdapter();
                ws0 ws0Var = (ws0) this.f37779e;
                qs0 qs0Var = ws0Var.L;
                if (adapter == qs0Var) {
                    if (qs0Var.d(i3) != 2) {
                        return 1;
                    }
                    return rr0Var.f37788r.J;
                } else if (ws0.y(ws0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((ts0) adapter).getClass();
                    return 1;
                }
            case 1:
                j41 j41Var = (j41) this.d;
                f41 f41Var = ((l41) this.f37779e).f35594g3;
                if (f41Var == null) {
                    return j41Var.J;
                }
                r31 G = f41Var.G(i3);
                if (G == null || (i10 = G.f37636u) == -1) {
                    return j41Var.J;
                }
                return i10;
            default:
                j41 j41Var2 = (j41) this.d;
                f41 f41Var2 = ((l41) this.f37779e).f35594g3;
                if (f41Var2 == null) {
                    return j41Var2.J;
                }
                r31 G2 = f41Var2.G(i3);
                if (G2 == null || (i11 = G2.f37636u) == -1) {
                    return j41Var2.J;
                }
                return i11;
        }
    }
}
