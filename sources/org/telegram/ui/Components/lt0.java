package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class lt0 extends g.o {
    public final int f26830c;
    public final Object d;
    public final ViewGroup e;

    public lt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f26830c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f26830c) {
            case 0:
                qu0 qu0Var = (qu0) this.d;
                s4.g0 adapter = qu0Var.f28366r.getAdapter();
                xv0 xv0Var = (xv0) this.e;
                rv0 rv0Var = xv0Var.I;
                if (adapter == rv0Var) {
                    if (rv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return qu0Var.f28367s.J;
                } else if (xv0.v(xv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((uv0) adapter).getClass();
                    return 1;
                }
            default:
                ci.h hVar = (ci.h) this.d;
                a71 a71Var = ((i71) this.e).W2;
                if (a71Var == null) {
                    return hVar.J;
                }
                m61 G = a71Var.G(i10);
                if (G == null || (i11 = G.f26955u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
