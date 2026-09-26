package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ys0 extends g.p {
    public final int f30699c;
    public final Object d;
    public final ViewGroup e;

    public ys0(ViewGroup viewGroup, Object obj, int i10) {
        this.f30699c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f30699c) {
            case 0:
                du0 du0Var = (du0) this.d;
                s4.h0 adapter = du0Var.f23757r.getAdapter();
                kv0 kv0Var = (kv0) this.e;
                ev0 ev0Var = kv0Var.I;
                if (adapter == ev0Var) {
                    if (ev0Var.j(i10) != 2) {
                        return 1;
                    }
                    return du0Var.f23758s.J;
                } else if (kv0.v(kv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((hv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                k61 k61Var = ((s61) this.e).Y2;
                if (k61Var == null) {
                    return iVar.J;
                }
                w51 G = k61Var.G(i10);
                if (G == null || (i11 = G.f29904u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
