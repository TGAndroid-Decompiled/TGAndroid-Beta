package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rq0 extends g.p {
    public final int f37722c;
    public final Object d;
    public final ViewGroup f37723e;

    public rq0(ViewGroup viewGroup, Object obj, int i7) {
        this.f37722c = i7;
        this.f37723e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f37722c) {
            case 0:
                sr0 sr0Var = (sr0) this.d;
                v4.g0 adapter = sr0Var.f38110n.getAdapter();
                xs0 xs0Var = (xs0) this.f37723e;
                rs0 rs0Var = xs0Var.K;
                if (adapter == rs0Var) {
                    if (rs0Var.d(i7) != 2) {
                        return 1;
                    }
                    return sr0Var.f38111r.J;
                } else if (xs0.y(xs0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((us0) adapter).getClass();
                    return 1;
                }
            case 1:
                o41 o41Var = (o41) this.d;
                l41 l41Var = ((q41) this.f37723e).f37160f3;
                if (l41Var == null) {
                    return o41Var.J;
                }
                x31 G = l41Var.G(i7);
                if (G == null || (i10 = G.f40168u) == -1) {
                    return o41Var.J;
                }
                return i10;
            default:
                o41 o41Var2 = (o41) this.d;
                l41 l41Var2 = ((q41) this.f37723e).f37160f3;
                if (l41Var2 == null) {
                    return o41Var2.J;
                }
                x31 G2 = l41Var2.G(i7);
                if (G2 == null || (i11 = G2.f40168u) == -1) {
                    return o41Var2.J;
                }
                return i11;
        }
    }
}
