package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ls0 extends f2.v {
    public final int f28869c;
    public final Object d;
    public final ViewGroup f28870e;

    public ls0(ViewGroup viewGroup, Object obj, int i10) {
        this.f28869c = i10;
        this.f28870e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f28869c) {
            case 0:
                qt0 qt0Var = (qt0) this.d;
                f2.p0 adapter = qt0Var.f30522r.getAdapter();
                yu0 yu0Var = (yu0) this.f28870e;
                su0 su0Var = yu0Var.F;
                if (adapter == su0Var) {
                    if (su0Var.j(i10) != 2) {
                        return 1;
                    }
                    return qt0Var.f30523s.J;
                } else if (yu0.v(yu0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((vu0) adapter).getClass();
                    return 1;
                }
            default:
                g61 g61Var = (g61) this.d;
                w51 w51Var = ((h61) this.f28870e).V2;
                if (w51Var == null) {
                    return g61Var.J;
                }
                h51 G = w51Var.G(i10);
                if (G == null || (i11 = G.f27384u) == -1) {
                    return g61Var.J;
                }
                return i11;
        }
    }
}
