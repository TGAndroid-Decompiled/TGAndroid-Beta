package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class st0 extends g.o {
    public final int f32677c;
    public final Object d;
    public final ViewGroup e;

    public st0(ViewGroup viewGroup, Object obj, int i10) {
        this.f32677c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f32677c) {
            case 0:
                tu0 tu0Var = (tu0) this.d;
                s4.h0 adapter = tu0Var.f33157n.getAdapter();
                aw0 aw0Var = (aw0) this.e;
                uv0 uv0Var = aw0Var.K;
                if (adapter == uv0Var) {
                    if (uv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return tu0Var.f33158r.J;
                } else if (aw0.x(aw0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((xv0) adapter).getClass();
                    return 1;
                }
            default:
                ei.h hVar = (ei.h) this.d;
                j71 j71Var = ((r71) this.e).f32150g3;
                if (j71Var == null) {
                    return hVar.J;
                }
                t61 G = j71Var.G(i10);
                if (G == null || (i11 = G.f32881u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
