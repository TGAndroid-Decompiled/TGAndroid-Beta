package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rq0 extends g.p {
    public final int f37762c;
    public final Object d;
    public final ViewGroup f37763e;

    public rq0(ViewGroup viewGroup, Object obj, int i7) {
        this.f37762c = i7;
        this.f37763e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f37762c) {
            case 0:
                sr0 sr0Var = (sr0) this.d;
                v4.g0 adapter = sr0Var.f38106n.getAdapter();
                xs0 xs0Var = (xs0) this.f37763e;
                rs0 rs0Var = xs0Var.K;
                if (adapter == rs0Var) {
                    if (rs0Var.d(i7) != 2) {
                        return 1;
                    }
                    return sr0Var.f38107r.J;
                } else if (xs0.y(xs0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((us0) adapter).getClass();
                    return 1;
                }
            case 1:
                n41 n41Var = (n41) this.d;
                k41 k41Var = ((p41) this.f37763e).f36781f3;
                if (k41Var == null) {
                    return n41Var.J;
                }
                w31 G = k41Var.G(i7);
                if (G == null || (i10 = G.f39839u) == -1) {
                    return n41Var.J;
                }
                return i10;
            default:
                n41 n41Var2 = (n41) this.d;
                k41 k41Var2 = ((p41) this.f37763e).f36781f3;
                if (k41Var2 == null) {
                    return n41Var2.J;
                }
                w31 G2 = k41Var2.G(i7);
                if (G2 == null || (i11 = G2.f39839u) == -1) {
                    return n41Var2.J;
                }
                return i11;
        }
    }
}
