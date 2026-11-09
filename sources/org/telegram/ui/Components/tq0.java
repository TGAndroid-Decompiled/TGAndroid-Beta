package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class tq0 extends g.p {
    public final int f38472c;
    public final Object d;
    public final ViewGroup f38473e;

    public tq0(ViewGroup viewGroup, Object obj, int i7) {
        this.f38472c = i7;
        this.f38473e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f38472c) {
            case 0:
                ur0 ur0Var = (ur0) this.d;
                v4.g0 adapter = ur0Var.f38792n.getAdapter();
                zs0 zs0Var = (zs0) this.f38473e;
                ts0 ts0Var = zs0Var.K;
                if (adapter == ts0Var) {
                    if (ts0Var.d(i7) != 2) {
                        return 1;
                    }
                    return ur0Var.f38793r.J;
                } else if (zs0.y(zs0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((ws0) adapter).getClass();
                    return 1;
                }
            case 1:
                p41 p41Var = (p41) this.d;
                m41 m41Var = ((r41) this.f38473e).f37556f3;
                if (m41Var == null) {
                    return p41Var.J;
                }
                y31 G = m41Var.G(i7);
                if (G == null || (i10 = G.f40577u) == -1) {
                    return p41Var.J;
                }
                return i10;
            default:
                p41 p41Var2 = (p41) this.d;
                m41 m41Var2 = ((r41) this.f38473e).f37556f3;
                if (m41Var2 == null) {
                    return p41Var2.J;
                }
                y31 G2 = m41Var2.G(i7);
                if (G2 == null || (i11 = G2.f40577u) == -1) {
                    return p41Var2.J;
                }
                return i11;
        }
    }
}
