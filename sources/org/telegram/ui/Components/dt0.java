package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class dt0 extends g.p {
    public final int f25822c;
    public final Object d;
    public final ViewGroup f25823e;

    public dt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f25822c = i10;
        this.f25823e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f25822c) {
            case 0:
                iu0 iu0Var = (iu0) this.d;
                s4.h0 adapter = iu0Var.f27501r.getAdapter();
                pv0 pv0Var = (pv0) this.f25823e;
                jv0 jv0Var = pv0Var.I;
                if (adapter == jv0Var) {
                    if (jv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return iu0Var.f27502s.J;
                } else if (pv0.v(pv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((mv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                u61 u61Var = ((c71) this.f25823e).f25244f3;
                if (u61Var == null) {
                    return iVar.J;
                }
                g61 G = u61Var.G(i10);
                if (G == null || (i11 = G.f26677u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
