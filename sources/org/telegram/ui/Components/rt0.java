package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class rt0 extends g.o {
    public final int f30543c;
    public final Object d;
    public final ViewGroup f30544e;

    public rt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f30543c = i10;
        this.f30544e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f30543c) {
            case 0:
                wu0 wu0Var = (wu0) this.d;
                s4.i0 adapter = wu0Var.f32744r.getAdapter();
                dw0 dw0Var = (dw0) this.f30544e;
                xv0 xv0Var = dw0Var.I;
                if (adapter == xv0Var) {
                    if (xv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return wu0Var.f32745s.J;
                } else if (dw0.v(dw0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((aw0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                e71 e71Var = ((m71) this.f30544e).W2;
                if (e71Var == null) {
                    return iVar.J;
                }
                r61 G = e71Var.G(i10);
                if (G == null || (i11 = G.f30370u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
