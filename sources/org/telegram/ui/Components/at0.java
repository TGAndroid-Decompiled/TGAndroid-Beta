package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class at0 extends g.p {
    public final int f22712c;
    public final Object d;
    public final ViewGroup e;

    public at0(ViewGroup viewGroup, Object obj, int i10) {
        this.f22712c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f22712c) {
            case 0:
                fu0 fu0Var = (fu0) this.d;
                s4.h0 adapter = fu0Var.f24356r.getAdapter();
                mv0 mv0Var = (mv0) this.e;
                gv0 gv0Var = mv0Var.I;
                if (adapter == gv0Var) {
                    if (gv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return fu0Var.f24357s.J;
                } else if (mv0.v(mv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((jv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                m61 m61Var = ((u61) this.e).f28778f3;
                if (m61Var == null) {
                    return iVar.J;
                }
                y51 G = m61Var.G(i10);
                if (G == null || (i11 = G.f30646u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
