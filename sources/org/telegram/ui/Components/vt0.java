package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class vt0 extends g.o {
    public final int f32174c;
    public final Object d;
    public final ViewGroup f32175e;

    public vt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f32174c = i10;
        this.f32175e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f32174c) {
            case 0:
                av0 av0Var = (av0) this.d;
                s4.i0 adapter = av0Var.f24488r.getAdapter();
                hw0 hw0Var = (hw0) this.f32175e;
                bw0 bw0Var = hw0Var.I;
                if (adapter == bw0Var) {
                    if (bw0Var.j(i10) != 2) {
                        return 1;
                    }
                    return av0Var.f24489s.J;
                } else if (hw0.v(hw0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((ew0) adapter).getClass();
                    return 1;
                }
            default:
                bi.i iVar = (bi.i) this.d;
                h71 h71Var = ((p71) this.f32175e).W2;
                if (h71Var == null) {
                    return iVar.J;
                }
                u61 G = h71Var.G(i10);
                if (G == null || (i11 = G.f31080u) == -1) {
                    return iVar.J;
                }
                return i11;
        }
    }
}
