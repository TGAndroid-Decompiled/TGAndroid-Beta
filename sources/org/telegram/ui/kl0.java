package org.telegram.ui;
public final class kl0 implements org.telegram.messenger.c20 {
    public final int f47309a;
    public final jm0 f47310b;

    public kl0(jm0 jm0Var, int i7) {
        this.f47309a = i7;
        this.f47310b = jm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f47309a) {
            case 0:
                Integer num = (Integer) obj;
                fi.g1 g1Var = this.f47310b.I;
                if (g1Var != null) {
                    g1Var.E(num.intValue());
                    return;
                }
                return;
            default:
                jm0 jm0Var = this.f47310b;
                jm0Var.f47046r = false;
                jm0Var.Q.setLoading(false);
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
