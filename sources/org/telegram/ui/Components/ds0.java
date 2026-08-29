package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ds0 extends f2.v {
    public final int f27869c;
    public final Object d;
    public final ViewGroup f27870e;

    public ds0(ViewGroup viewGroup, Object obj, int i10) {
        this.f27869c = i10;
        this.f27870e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f27869c) {
            case 0:
                it0 it0Var = (it0) this.d;
                f2.p0 adapter = it0Var.f29469r.getAdapter();
                qu0 qu0Var = (qu0) this.f27870e;
                ku0 ku0Var = qu0Var.E;
                if (adapter == ku0Var) {
                    if (ku0Var.j(i10) != 2) {
                        return 1;
                    }
                    return it0Var.f29470s.J;
                } else if (qu0.v(qu0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((nu0) adapter).getClass();
                    return 1;
                }
            default:
                mh.h hVar = (mh.h) this.d;
                k51 k51Var = ((u51) this.f27870e).U2;
                if (k51Var == null) {
                    return hVar.J;
                }
                w41 G = k51Var.G(i10);
                if (G == null || (i11 = G.f34309u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
