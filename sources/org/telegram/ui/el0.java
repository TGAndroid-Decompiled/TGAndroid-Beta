package org.telegram.ui;
public final class el0 implements org.telegram.messenger.u10 {
    public final int f45001a;
    public final cm0 f45002b;

    public el0(cm0 cm0Var, int i3) {
        this.f45001a = i3;
        this.f45002b = cm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f45001a) {
            case 0:
                Integer num = (Integer) obj;
                gi.g1 g1Var = this.f45002b.J;
                if (g1Var != null) {
                    g1Var.D(num.intValue());
                    return;
                }
                return;
            default:
                cm0 cm0Var = this.f45002b;
                cm0Var.f44399r = false;
                cm0Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    cm0Var.C0();
                    cm0Var.finishFragment();
                    cm0Var.I0();
                    return;
                }
                return;
        }
    }
}
