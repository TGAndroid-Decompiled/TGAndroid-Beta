package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class lt0 extends g.o {
    public final int f28424c;
    public final Object d;
    public final ViewGroup e;

    public lt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f28424c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f28424c) {
            case 0:
                qu0 qu0Var = (qu0) this.d;
                s4.g0 adapter = qu0Var.f30004r.getAdapter();
                xv0 xv0Var = (xv0) this.e;
                rv0 rv0Var = xv0Var.I;
                if (adapter == rv0Var) {
                    if (rv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return qu0Var.f30005s.J;
                } else if (xv0.p(xv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((uv0) adapter).getClass();
                    return 1;
                }
            default:
                di.h hVar = (di.h) this.d;
                b71 b71Var = ((j71) this.e).Z2;
                if (b71Var == null) {
                    return hVar.J;
                }
                m61 G = b71Var.G(i10);
                if (G == null || (i11 = G.f28568u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
