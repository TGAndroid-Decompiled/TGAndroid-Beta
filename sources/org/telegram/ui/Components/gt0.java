package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class gt0 extends g.o {
    public final int f26674c;
    public final Object d;
    public final ViewGroup e;

    public gt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f26674c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f26674c) {
            case 0:
                lu0 lu0Var = (lu0) this.d;
                s4.g0 adapter = lu0Var.f28339r.getAdapter();
                sv0 sv0Var = (sv0) this.e;
                mv0 mv0Var = sv0Var.I;
                if (adapter == mv0Var) {
                    if (mv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return lu0Var.f28340s.J;
                } else if (sv0.p(sv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((pv0) adapter).getClass();
                    return 1;
                }
            default:
                di.h hVar = (di.h) this.d;
                s61 s61Var = ((a71) this.e).W2;
                if (s61Var == null) {
                    return hVar.J;
                }
                f61 G = s61Var.G(i10);
                if (G == null || (i11 = G.f26156u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
