package org.telegram.ui;
public final class il0 implements org.telegram.messenger.c20 {
    public final int f46685a;
    public final hm0 f46686b;

    public il0(hm0 hm0Var, int i7) {
        this.f46685a = i7;
        this.f46686b = hm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f46685a) {
            case 0:
                Integer num = (Integer) obj;
                fi.g1 g1Var = this.f46686b.I;
                if (g1Var != null) {
                    g1Var.E(num.intValue());
                    return;
                }
                return;
            default:
                hm0 hm0Var = this.f46686b;
                hm0Var.f46459r = false;
                hm0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    hm0Var.C0();
                    hm0Var.finishFragment();
                    hm0Var.I0();
                    return;
                }
                return;
        }
    }
}
