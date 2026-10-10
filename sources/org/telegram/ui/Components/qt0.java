package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class qt0 extends g.o {
    public final int f30292c;
    public final Object d;
    public final ViewGroup f30293e;

    public qt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f30292c = i10;
        this.f30293e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f30292c) {
            case 0:
                vu0 vu0Var = (vu0) this.d;
                s4.i0 adapter = vu0Var.f32519r.getAdapter();
                cw0 cw0Var = (cw0) this.f30293e;
                wv0 wv0Var = cw0Var.I;
                if (adapter == wv0Var) {
                    if (wv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return vu0Var.f32520s.J;
                } else if (cw0.v(cw0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((zv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                d71 d71Var = ((l71) this.f30293e).W2;
                if (d71Var == null) {
                    return iVar.J;
                }
                q61 G = d71Var.G(i10);
                if (G == null || (i11 = G.f30072u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
