package org.telegram.ui.Components;

import android.view.ViewGroup;

public final class tr0 extends f2.w {

    public final int f32868c;
    public final Object d;

    public final ViewGroup f32869e;

    public tr0(ViewGroup viewGroup, Object obj, int i10) {
        this.f32868c = i10;
        this.f32869e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f32868c) {
            case 0:
                zs0 zs0Var = (zs0) this.d;
                f2.q0 adapter = zs0Var.f35340r.getAdapter();
                hu0 hu0Var = (hu0) this.f32869e;
                bu0 bu0Var = hu0Var.E;
                if (adapter == bu0Var) {
                    if (bu0Var.j(i10) == 2) {
                        return zs0Var.f35341s.J;
                    }
                    return 1;
                }
                if (hu0.v(hu0Var, adapter) == -1) {
                    return 1;
                }
                ((eu0) adapter).getClass();
                return 1;
            default:
                kh.i iVar = (kh.i) this.d;
                b51 b51Var = ((k51) this.f32869e).U2;
                if (b51Var == null) {
                    return iVar.J;
                }
                n41 n41VarG = b51Var.G(i10);
                return (n41VarG == null || (i11 = n41VarG.f30853u) == -1) ? iVar.J : i11;
        }
    }
}
