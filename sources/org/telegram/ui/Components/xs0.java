package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class xs0 extends g.p {
    public final int f30359c;
    public final Object d;
    public final ViewGroup e;

    public xs0(ViewGroup viewGroup, Object obj, int i10) {
        this.f30359c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f30359c) {
            case 0:
                cu0 cu0Var = (cu0) this.d;
                s4.h0 adapter = cu0Var.f23407r.getAdapter();
                jv0 jv0Var = (jv0) this.e;
                dv0 dv0Var = jv0Var.I;
                if (adapter == dv0Var) {
                    if (dv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return cu0Var.f23408s.J;
                } else if (jv0.v(jv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((gv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                k61 k61Var = ((s61) this.e).Y2;
                if (k61Var == null) {
                    return iVar.J;
                }
                w51 G = k61Var.G(i10);
                if (G == null || (i11 = G.f29957u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
