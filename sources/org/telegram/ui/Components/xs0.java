package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class xs0 extends g.p {
    public final int f30398c;
    public final Object d;
    public final ViewGroup e;

    public xs0(ViewGroup viewGroup, Object obj, int i10) {
        this.f30398c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f30398c) {
            case 0:
                cu0 cu0Var = (cu0) this.d;
                s4.h0 adapter = cu0Var.f23400r.getAdapter();
                jv0 jv0Var = (jv0) this.e;
                dv0 dv0Var = jv0Var.I;
                if (adapter == dv0Var) {
                    if (dv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return cu0Var.f23401s.J;
                } else if (jv0.v(jv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((gv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                j61 j61Var = ((r61) this.e).Y2;
                if (j61Var == null) {
                    return iVar.J;
                }
                v51 G = j61Var.G(i10);
                if (G == null || (i11 = G.f29058u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
