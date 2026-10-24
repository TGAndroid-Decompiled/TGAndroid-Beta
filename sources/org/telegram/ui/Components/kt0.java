package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class kt0 extends g.o {
    public final int f28085c;
    public final Object d;
    public final ViewGroup e;

    public kt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f28085c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f28085c) {
            case 0:
                pu0 pu0Var = (pu0) this.d;
                s4.g0 adapter = pu0Var.f29677r.getAdapter();
                wv0 wv0Var = (wv0) this.e;
                qv0 qv0Var = wv0Var.I;
                if (adapter == qv0Var) {
                    if (qv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return pu0Var.f29678s.J;
                } else if (wv0.p(wv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((tv0) adapter).getClass();
                    return 1;
                }
            default:
                di.h hVar = (di.h) this.d;
                a71 a71Var = ((i71) this.e).Z2;
                if (a71Var == null) {
                    return hVar.J;
                }
                l61 G = a71Var.G(i10);
                if (G == null || (i11 = G.f28236u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
