package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class vt0 extends g.o {
    public final int f32188c;
    public final Object d;
    public final ViewGroup f32189e;

    public vt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f32188c = i10;
        this.f32189e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f32188c) {
            case 0:
                av0 av0Var = (av0) this.d;
                s4.i0 adapter = av0Var.f24500r.getAdapter();
                hw0 hw0Var = (hw0) this.f32189e;
                bw0 bw0Var = hw0Var.I;
                if (adapter == bw0Var) {
                    if (bw0Var.j(i10) != 2) {
                        return 1;
                    }
                    return av0Var.f24501s.J;
                } else if (hw0.v(hw0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((ew0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                h71 h71Var = ((p71) this.f32189e).W2;
                if (h71Var == null) {
                    return iVar.J;
                }
                u61 G = h71Var.G(i10);
                if (G == null || (i11 = G.f31085u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
