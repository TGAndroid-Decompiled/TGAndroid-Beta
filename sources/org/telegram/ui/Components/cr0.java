package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class cr0 extends g.p {
    public final int f34113c;
    public final Object d;
    public final ViewGroup f34114e;

    public cr0(ViewGroup viewGroup, Object obj, int i7) {
        this.f34113c = i7;
        this.f34114e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f34113c) {
            case 0:
                ds0 ds0Var = (ds0) this.d;
                v4.i0 adapter = ds0Var.f34446n.getAdapter();
                it0 it0Var = (it0) this.f34114e;
                ct0 ct0Var = it0Var.L;
                if (adapter == ct0Var) {
                    if (ct0Var.d(i7) != 2) {
                        return 1;
                    }
                    return ds0Var.f34447r.J;
                } else if (it0.y(it0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((ft0) adapter).getClass();
                    return 1;
                }
            case 1:
                e51 e51Var = (e51) this.d;
                b51 b51Var = ((g51) this.f34114e).f35323g3;
                if (b51Var == null) {
                    return e51Var.J;
                }
                n41 G = b51Var.G(i7);
                if (G == null || (i10 = G.v) == -1) {
                    return e51Var.J;
                }
                return i10;
            default:
                e51 e51Var2 = (e51) this.d;
                b51 b51Var2 = ((g51) this.f34114e).f35323g3;
                if (b51Var2 == null) {
                    return e51Var2.J;
                }
                n41 G2 = b51Var2.G(i7);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return e51Var2.J;
                }
                return i11;
        }
    }
}
