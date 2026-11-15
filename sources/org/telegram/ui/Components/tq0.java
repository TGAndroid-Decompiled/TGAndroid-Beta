package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class tq0 extends g.p {
    public final int f39783c;
    public final Object d;
    public final ViewGroup f39784e;

    public tq0(ViewGroup viewGroup, Object obj, int i7) {
        this.f39783c = i7;
        this.f39784e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f39783c) {
            case 0:
                tr0 tr0Var = (tr0) this.d;
                v4.h0 adapter = tr0Var.f39795n.getAdapter();
                ys0 ys0Var = (ys0) this.f39784e;
                ss0 ss0Var = ys0Var.L;
                if (adapter == ss0Var) {
                    if (ss0Var.d(i7) != 2) {
                        return 1;
                    }
                    return tr0Var.f39796r.J;
                } else if (ys0.y(ys0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((vs0) adapter).getClass();
                    return 1;
                }
            case 1:
                s41 s41Var = (s41) this.d;
                p41 p41Var = ((u41) this.f39784e).f39895g3;
                if (p41Var == null) {
                    return s41Var.J;
                }
                b41 G = p41Var.G(i7);
                if (G == null || (i10 = G.f33190u) == -1) {
                    return s41Var.J;
                }
                return i10;
            default:
                s41 s41Var2 = (s41) this.d;
                p41 p41Var2 = ((u41) this.f39784e).f39895g3;
                if (p41Var2 == null) {
                    return s41Var2.J;
                }
                b41 G2 = p41Var2.G(i7);
                if (G2 == null || (i11 = G2.f33190u) == -1) {
                    return s41Var2.J;
                }
                return i11;
        }
    }
}
