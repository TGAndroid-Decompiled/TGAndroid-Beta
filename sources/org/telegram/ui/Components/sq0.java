package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class sq0 extends g.p {
    public final int f38044c;
    public final Object d;
    public final ViewGroup f38045e;

    public sq0(ViewGroup viewGroup, Object obj, int i7) {
        this.f38044c = i7;
        this.f38045e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f38044c) {
            case 0:
                tr0 tr0Var = (tr0) this.d;
                v4.g0 adapter = tr0Var.f38386n.getAdapter();
                ys0 ys0Var = (ys0) this.f38045e;
                ss0 ss0Var = ys0Var.K;
                if (adapter == ss0Var) {
                    if (ss0Var.d(i7) != 2) {
                        return 1;
                    }
                    return tr0Var.f38387r.J;
                } else if (ys0.y(ys0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((vs0) adapter).getClass();
                    return 1;
                }
            case 1:
                p41 p41Var = (p41) this.d;
                m41 m41Var = ((r41) this.f38045e).f37496f3;
                if (m41Var == null) {
                    return p41Var.J;
                }
                x31 G = m41Var.G(i7);
                if (G == null || (i10 = G.f40165u) == -1) {
                    return p41Var.J;
                }
                return i10;
            default:
                p41 p41Var2 = (p41) this.d;
                m41 m41Var2 = ((r41) this.f38045e).f37496f3;
                if (m41Var2 == null) {
                    return p41Var2.J;
                }
                x31 G2 = m41Var2.G(i7);
                if (G2 == null || (i11 = G2.f40165u) == -1) {
                    return p41Var2.J;
                }
                return i11;
        }
    }
}
