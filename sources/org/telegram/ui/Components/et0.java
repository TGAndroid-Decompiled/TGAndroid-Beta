package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class et0 extends g.p {
    public final int f26208c;
    public final Object d;
    public final ViewGroup f26209e;

    public et0(ViewGroup viewGroup, Object obj, int i10) {
        this.f26208c = i10;
        this.f26209e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f26208c) {
            case 0:
                ju0 ju0Var = (ju0) this.d;
                s4.h0 adapter = ju0Var.f27977r.getAdapter();
                qv0 qv0Var = (qv0) this.f26209e;
                kv0 kv0Var = qv0Var.I;
                if (adapter == kv0Var) {
                    if (kv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return ju0Var.f27978s.J;
                } else if (qv0.v(qv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((nv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                w61 w61Var = ((e71) this.f26209e).f26034f3;
                if (w61Var == null) {
                    return iVar.J;
                }
                h61 G = w61Var.G(i10);
                if (G == null || (i11 = G.f27102u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
