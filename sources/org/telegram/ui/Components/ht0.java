package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ht0 extends g.o {
    public final int f26933c;
    public final Object d;
    public final ViewGroup e;

    public ht0(ViewGroup viewGroup, Object obj, int i10) {
        this.f26933c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f26933c) {
            case 0:
                mu0 mu0Var = (mu0) this.d;
                s4.g0 adapter = mu0Var.f28609r.getAdapter();
                tv0 tv0Var = (tv0) this.e;
                nv0 nv0Var = tv0Var.I;
                if (adapter == nv0Var) {
                    if (nv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return mu0Var.f28610s.J;
                } else if (tv0.p(tv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((qv0) adapter).getClass();
                    return 1;
                }
            default:
                di.h hVar = (di.h) this.d;
                t61 t61Var = ((b71) this.e).W2;
                if (t61Var == null) {
                    return hVar.J;
                }
                g61 G = t61Var.G(i10);
                if (G == null || (i11 = G.f26506u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
