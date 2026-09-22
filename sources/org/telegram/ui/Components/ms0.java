package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ms0 extends g.p {
    public final int f26246c;
    public final Object d;
    public final ViewGroup e;

    public ms0(ViewGroup viewGroup, Object obj, int i10) {
        this.f26246c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f26246c) {
            case 0:
                rt0 rt0Var = (rt0) this.d;
                s4.h0 adapter = rt0Var.f27685r.getAdapter();
                yu0 yu0Var = (yu0) this.e;
                su0 su0Var = yu0Var.I;
                if (adapter == su0Var) {
                    if (su0Var.j(i10) != 2) {
                        return 1;
                    }
                    return rt0Var.f27686s.J;
                } else if (yu0.v(yu0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((vu0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                w51 w51Var = ((e61) this.e).Y2;
                if (w51Var == null) {
                    return iVar.J;
                }
                i51 G = w51Var.G(i10);
                if (G == null || (i11 = G.f24909u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
