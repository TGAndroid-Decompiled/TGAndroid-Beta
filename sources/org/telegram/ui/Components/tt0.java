package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class tt0 extends g.o {
    public final int f33147c;
    public final Object d;
    public final ViewGroup e;

    public tt0(ViewGroup viewGroup, Object obj, int i10) {
        this.f33147c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f33147c) {
            case 0:
                uu0 uu0Var = (uu0) this.d;
                s4.h0 adapter = uu0Var.f33468n.getAdapter();
                bw0 bw0Var = (bw0) this.e;
                vv0 vv0Var = bw0Var.K;
                if (adapter == vv0Var) {
                    if (vv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return uu0Var.f33469r.J;
                } else if (bw0.x(bw0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((yv0) adapter).getClass();
                    return 1;
                }
            default:
                ei.h hVar = (ei.h) this.d;
                k71 k71Var = ((s71) this.e).f32504g3;
                if (k71Var == null) {
                    return hVar.J;
                }
                u61 G = k71Var.G(i10);
                if (G == null || (i11 = G.f33258u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
