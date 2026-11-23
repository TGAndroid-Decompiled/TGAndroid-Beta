package org.telegram.ui;
public final class nl0 implements org.telegram.messenger.y10 {
    public final int f50217a;
    public final lm0 f50218b;

    public nl0(lm0 lm0Var, int i7) {
        this.f50217a = i7;
        this.f50218b = lm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50217a) {
            case 0:
                Integer num = (Integer) obj;
                hi.h1 h1Var = this.f50218b.J;
                if (h1Var != null) {
                    h1Var.A(num.intValue());
                    return;
                }
                return;
            default:
                lm0 lm0Var = this.f50218b;
                lm0Var.f49634r = false;
                lm0Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    lm0Var.C0();
                    lm0Var.finishFragment();
                    lm0Var.I0();
                    return;
                }
                return;
        }
    }
}
