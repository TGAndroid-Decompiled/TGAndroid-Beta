package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class dr0 extends g.p {
    public final int f34554c;
    public final Object d;
    public final ViewGroup f34555e;

    public dr0(ViewGroup viewGroup, Object obj, int i7) {
        this.f34554c = i7;
        this.f34555e = viewGroup;
        this.d = obj;
    }

    @Override
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.f34554c) {
            case 0:
                ds0 ds0Var = (ds0) this.d;
                v4.i0 adapter = ds0Var.f34566n.getAdapter();
                jt0 jt0Var = (jt0) this.f34555e;
                dt0 dt0Var = jt0Var.L;
                if (adapter == dt0Var) {
                    if (dt0Var.d(i7) != 2) {
                        return 1;
                    }
                    return ds0Var.f34567r.J;
                } else if (jt0.y(jt0Var, adapter) == -1) {
                    return 1;
                } else {
                    ((gt0) adapter).getClass();
                    return 1;
                }
            case 1:
                f51 f51Var = (f51) this.d;
                c51 c51Var = ((h51) this.f34555e).f35796g3;
                if (c51Var == null) {
                    return f51Var.J;
                }
                o41 G = c51Var.G(i7);
                if (G == null || (i10 = G.v) == -1) {
                    return f51Var.J;
                }
                return i10;
            default:
                f51 f51Var2 = (f51) this.d;
                c51 c51Var2 = ((h51) this.f34555e).f35796g3;
                if (c51Var2 == null) {
                    return f51Var2.J;
                }
                o41 G2 = c51Var2.G(i7);
                if (G2 == null || (i11 = G2.v) == -1) {
                    return f51Var2.J;
                }
                return i11;
        }
    }
}
