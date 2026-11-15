package org.telegram.ui;
public final class ll0 implements org.telegram.messenger.z10 {
    public final int f48999a;
    public final jm0 f49000b;

    public ll0(jm0 jm0Var, int i7) {
        this.f48999a = i7;
        this.f49000b = jm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48999a) {
            case 0:
                Integer num = (Integer) obj;
                hi.i1 i1Var = this.f49000b.J;
                if (i1Var != null) {
                    i1Var.C(num.intValue());
                    return;
                }
                return;
            default:
                jm0 jm0Var = this.f49000b;
                jm0Var.f48379r = false;
                jm0Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    jm0Var.C0();
                    jm0Var.finishFragment();
                    jm0Var.I0();
                    return;
                }
                return;
        }
    }
}
