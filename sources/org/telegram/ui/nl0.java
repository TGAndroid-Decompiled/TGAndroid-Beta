package org.telegram.ui;
public final class nl0 implements org.telegram.messenger.y10 {
    public final int f50213a;
    public final lm0 f50214b;

    public nl0(lm0 lm0Var, int i7) {
        this.f50213a = i7;
        this.f50214b = lm0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f50213a) {
            case 0:
                Integer num = (Integer) obj;
                hi.i1 i1Var = this.f50214b.J;
                if (i1Var != null) {
                    i1Var.A(num.intValue());
                    return;
                }
                return;
            default:
                lm0 lm0Var = this.f50214b;
                lm0Var.f49657r = false;
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
