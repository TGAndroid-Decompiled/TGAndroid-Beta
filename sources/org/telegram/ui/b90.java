package org.telegram.ui;
public final class b90 implements Runnable {
    public final int f45655a;
    public final i90 f45656b;

    public b90(i90 i90Var, int i7) {
        this.f45655a = i7;
        this.f45656b = i90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45655a;
        i90 i90Var = this.f45656b;
        switch (i7) {
            case 0:
                vf.c.t(i90Var.getParentActivity(), org.telegram.messenger.hd.M0(2131746156, null));
                return;
            case 1:
                i90Var.f47992r.d.requestFocus();
                org.telegram.messenger.g0.J3(i90Var.f47992r.d);
                return;
            default:
                i90Var.f47992r.d.clearFocus();
                org.telegram.messenger.g0.v1(i90Var.f47992r.d);
                return;
        }
    }
}
