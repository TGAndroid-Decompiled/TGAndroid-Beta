package org.telegram.ui;
public final class ll0 implements org.telegram.messenger.c20 {
    public final int f47631a;
    public final km0 f47632b;

    public ll0(km0 km0Var, int i7) {
        this.f47631a = i7;
        this.f47632b = km0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47631a) {
            case 0:
                Integer num = (Integer) obj;
                fi.g1 g1Var = this.f47632b.I;
                if (g1Var != null) {
                    g1Var.E(num.intValue());
                    return;
                }
                return;
            default:
                km0 km0Var = this.f47632b;
                km0Var.f47377r = false;
                km0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    km0Var.C0();
                    km0Var.finishFragment();
                    km0Var.I0();
                    return;
                }
                return;
        }
    }
}
