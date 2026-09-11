package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ls0 extends g.p {
    public final int f28300c;
    public final Object d;
    public final ViewGroup f28301e;

    public ls0(ViewGroup viewGroup, Object obj, int i10) {
        this.f28300c = i10;
        this.f28301e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f28300c) {
            case 0:
                qt0 qt0Var = (qt0) this.d;
                s4.h0 adapter = qt0Var.f29821r.getAdapter();
                xu0 xu0Var = (xu0) this.f28301e;
                ru0 ru0Var = xu0Var.I;
                if (adapter == ru0Var) {
                    if (ru0Var.j(i10) != 2) {
                        return 1;
                    }
                    return qt0Var.f29822s.J;
                } else if (xu0.v(xu0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((uu0) adapter).getClass();
                    return 1;
                }
            default:
                ci.h hVar = (ci.h) this.d;
                v51 v51Var = ((d61) this.f28301e).Y2;
                if (v51Var == null) {
                    return hVar.J;
                }
                h51 G = v51Var.G(i10);
                if (G == null || (i11 = G.f26603u) == -1) {
                    return hVar.J;
                }
                return i11;
        }
    }
}
