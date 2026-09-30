package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class zs0 extends g.p {
    public final int f30968c;
    public final Object d;
    public final ViewGroup e;

    public zs0(ViewGroup viewGroup, Object obj, int i10) {
        this.f30968c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f30968c) {
            case 0:
                eu0 eu0Var = (eu0) this.d;
                s4.h0 adapter = eu0Var.f24067r.getAdapter();
                lv0 lv0Var = (lv0) this.e;
                fv0 fv0Var = lv0Var.I;
                if (adapter == fv0Var) {
                    if (fv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return eu0Var.f24068s.J;
                } else if (lv0.v(lv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((iv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                l61 l61Var = ((t61) this.e).Y2;
                if (l61Var == null) {
                    return iVar.J;
                }
                x51 G = l61Var.G(i10);
                if (G == null || (i11 = G.f30287u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
