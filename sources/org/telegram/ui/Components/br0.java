package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class br0 extends g.p {
    public final int f33759c;
    public final Object d;
    public final ViewGroup f33760e;

    public br0(ViewGroup viewGroup, Object obj, int i7) {
        this.f33759c = i7;
        this.f33760e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f33759c) {
            case 0:
                bs0 bs0Var = (bs0) this.d;
                v4.i0 adapter = bs0Var.f33771n.getAdapter();
                gt0 gt0Var = (gt0) this.f33760e;
                at0 at0Var = gt0Var.L;
                if (adapter == at0Var) {
                    if (at0Var.d(i7) != 2) {
                        return 1;
                    }
                    return bs0Var.f33772r.J;
                } else if (gt0.y(gt0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((dt0) adapter).getClass();
                    return 1;
                }
            case 1:
                c51 c51Var = (c51) this.d;
                z41 z41Var = ((e51) this.f33760e).f34607g3;
                if (z41Var == null) {
                    return c51Var.J;
                }
                l41 G = z41Var.G(i7);
                if (G == null || (i10 = G.v) == -1) {
                    return c51Var.J;
                }
                return i10;
            default:
                c51 c51Var2 = (c51) this.d;
                z41 z41Var2 = ((e51) this.f33760e).f34607g3;
                if (z41Var2 == null) {
                    return c51Var2.J;
                }
                l41 G2 = z41Var2.G(i7);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return c51Var2.J;
                }
                return i11;
        }
    }
}
