package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ls0 extends f2.v {
    public final int f26880c;
    public final Object d;
    public final ViewGroup e;

    public ls0(ViewGroup viewGroup, Object obj, int i10) {
        this.f26880c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f26880c) {
            case 0:
                qt0 qt0Var = (qt0) this.d;
                f2.o0 adapter = qt0Var.f28242r.getAdapter();
                yu0 yu0Var = (yu0) this.e;
                su0 su0Var = yu0Var.F;
                if (adapter == su0Var) {
                    if (su0Var.j(i10) != 2) {
                        return 1;
                    }
                    return qt0Var.f28243s.J;
                } else if (yu0.v(yu0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((vu0) adapter).getClass();
                    return 1;
                }
            default:
                oh.h hVar = (oh.h) this.d;
                w51 w51Var = ((g61) this.e).V2;
                if (w51Var == null) {
                    return hVar.J;
                }
                i51 G = w51Var.G(i10);
                if (G == null || (i11 = G.f25574u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
