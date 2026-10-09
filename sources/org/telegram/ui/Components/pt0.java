package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class pt0 extends g.o {
    public final int f29945c;
    public final Object d;
    public final ViewGroup f29946e;

    public pt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f29945c = i10;
        this.f29946e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f29945c) {
            case 0:
                uu0 uu0Var = (uu0) this.d;
                s4.i0 adapter = uu0Var.f31625r.getAdapter();
                bw0 bw0Var = (bw0) this.f29946e;
                vv0 vv0Var = bw0Var.I;
                if (adapter == vv0Var) {
                    if (vv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return uu0Var.f31626s.J;
                } else if (bw0.v(bw0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((yv0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                c71 c71Var = ((k71) this.f29946e).W2;
                if (c71Var == null) {
                    return iVar.J;
                }
                p61 G = c71Var.G(i10);
                if (G == null || (i11 = G.f29743u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
