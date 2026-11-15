package org.telegram.ui;
public final class kl0 implements org.telegram.messenger.z10 {
    public final int f48718a;
    public final im0 f48719b;

    public kl0(im0 im0Var, int i7) {
        this.f48718a = i7;
        this.f48719b = im0Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f48718a) {
            case 0:
                Integer num = (Integer) obj;
                hi.i1 i1Var = this.f48719b.J;
                if (i1Var != null) {
                    i1Var.C(num.intValue());
                    return;
                }
                return;
            default:
                im0 im0Var = this.f48719b;
                im0Var.f48095r = false;
                im0Var.R.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    im0Var.C0();
                    im0Var.finishFragment();
                    im0Var.I0();
                    return;
                }
                return;
        }
    }
}
