package org.telegram.ui;
public final class ll0 implements org.telegram.messenger.w10 {
    public final int f49778a;
    public final jm0 f49779b;

    public ll0(jm0 jm0Var, int i7) {
        this.f49778a = i7;
        this.f49779b = jm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f49778a) {
            case 0:
                Integer num = (Integer) obj;
                hi.q1 q1Var = this.f49779b.J;
                if (q1Var != null) {
                    q1Var.C(num.intValue());
                    return;
                }
                return;
            default:
                jm0 jm0Var = this.f49779b;
                jm0Var.f49165r = false;
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
