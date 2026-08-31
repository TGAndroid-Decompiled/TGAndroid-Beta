package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ms0 extends f2.v {
    public final int f29243c;
    public final Object d;
    public final ViewGroup f29244e;

    public ms0(ViewGroup viewGroup, Object obj, int i10) {
        this.f29243c = i10;
        this.f29244e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i10) {
        int i11;
        switch (this.f29243c) {
            case 0:
                rt0 rt0Var = (rt0) this.d;
                f2.p0 adapter = rt0Var.f30850r.getAdapter();
                zu0 zu0Var = (zu0) this.f29244e;
                tu0 tu0Var = zu0Var.F;
                if (adapter == tu0Var) {
                    if (tu0Var.j(i10) != 2) {
                        return 1;
                    }
                    return rt0Var.f30851s.J;
                } else if (zu0.v(zu0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((wu0) adapter).getClass();
                    return 1;
                }
            default:
                h61 h61Var = (h61) this.d;
                x51 x51Var = ((i61) this.f29244e).V2;
                if (x51Var == null) {
                    return h61Var.J;
                }
                j51 G = x51Var.G(i10);
                if (G == null || (i11 = G.f28023u) == -1) {
                    return h61Var.J;
                }
                return i11;
        }
    }
}
