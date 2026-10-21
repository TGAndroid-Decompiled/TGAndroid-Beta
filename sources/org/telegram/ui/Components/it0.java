package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class it0 extends g.o {
    public final int f27336c;
    public final Object d;
    public final ViewGroup e;

    public it0(ViewGroup viewGroup, Object obj, int i10) {
        this.f27336c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f27336c) {
            case 0:
                nu0 nu0Var = (nu0) this.d;
                s4.g0 adapter = nu0Var.f28881r.getAdapter();
                uv0 uv0Var = (uv0) this.e;
                ov0 ov0Var = uv0Var.I;
                if (adapter == ov0Var) {
                    if (ov0Var.j(i10) != 2) {
                        return 1;
                    }
                    return nu0Var.f28882s.J;
                } else if (uv0.p(uv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((rv0) adapter).getClass();
                    return 1;
                }
            default:
                di.h hVar = (di.h) this.d;
                u61 u61Var = ((c71) this.e).W2;
                if (u61Var == null) {
                    return hVar.J;
                }
                h61 G = u61Var.G(i10);
                if (G == null || (i11 = G.f26791u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
