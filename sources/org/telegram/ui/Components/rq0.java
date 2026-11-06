package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rq0 extends g.p {
    public final int f37819c;
    public final Object d;
    public final ViewGroup f37820e;

    public rq0(ViewGroup viewGroup, Object obj, int i7) {
        this.f37819c = i7;
        this.f37820e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f37819c) {
            case 0:
                sr0 sr0Var = (sr0) this.d;
                v4.g0 adapter = sr0Var.f38146n.getAdapter();
                xs0 xs0Var = (xs0) this.f37820e;
                rs0 rs0Var = xs0Var.K;
                if (adapter == rs0Var) {
                    if (rs0Var.d(i7) != 2) {
                        return 1;
                    }
                    return sr0Var.f38147r.J;
                } else if (xs0.y(xs0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((us0) adapter).getClass();
                    return 1;
                }
            case 1:
                i41 i41Var = (i41) this.d;
                f41 f41Var = ((k41) this.f37820e).f35167f3;
                if (f41Var == null) {
                    return i41Var.J;
                }
                r31 G = f41Var.G(i7);
                if (G == null || (i10 = G.f37607u) == -1) {
                    return i41Var.J;
                }
                return i10;
            default:
                i41 i41Var2 = (i41) this.d;
                f41 f41Var2 = ((k41) this.f37820e).f35167f3;
                if (f41Var2 == null) {
                    return i41Var2.J;
                }
                r31 G2 = f41Var2.G(i7);
                if (G2 == null || (i11 = G2.f37607u) == -1) {
                    return i41Var2.J;
                }
                return i11;
        }
    }
}
