package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ns0 extends g.p {
    public final int f26535c;
    public final Object d;
    public final ViewGroup e;

    public ns0(ViewGroup viewGroup, Object obj, int i10) {
        this.f26535c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f26535c) {
            case 0:
                st0 st0Var = (st0) this.d;
                s4.h0 adapter = st0Var.f27922r.getAdapter();
                zu0 zu0Var = (zu0) this.e;
                tu0 tu0Var = zu0Var.I;
                if (adapter == tu0Var) {
                    if (tu0Var.j(i10) != 2) {
                        return 1;
                    }
                    return st0Var.f27923s.J;
                } else if (zu0.v(zu0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((wu0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                x51 x51Var = ((f61) this.e).Y2;
                if (x51Var == null) {
                    return iVar.J;
                }
                j51 G = x51Var.G(i10);
                if (G == null || (i11 = G.f25133u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
