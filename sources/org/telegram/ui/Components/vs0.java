package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class vs0 extends g.p {
    public final int f28594c;
    public final Object d;
    public final ViewGroup e;

    public vs0(ViewGroup viewGroup, Object obj, int i10) {
        this.f28594c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f28594c) {
            case 0:
                au0 au0Var = (au0) this.d;
                s4.h0 adapter = au0Var.f21595r.getAdapter();
                iv0 iv0Var = (iv0) this.e;
                cv0 cv0Var = iv0Var.I;
                if (adapter == cv0Var) {
                    if (cv0Var.j(i10) != 2) {
                        return 1;
                    }
                    return au0Var.f21596s.J;
                } else if (iv0.v(iv0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((fv0) adapter).getClass();
                    return 1;
                }
            default:
                ai.n nVar = (ai.n) this.d;
                j61 j61Var = ((r61) this.e).Y2;
                if (j61Var == null) {
                    return nVar.J;
                }
                v51 G = j61Var.G(i10);
                if (G == null || (i11 = G.f27838u) == -1) {
                    return nVar.J;
                }
                return i11;
        }
    }
}
