package org.telegram.ui;
public final class b90 implements Runnable {
    public final int f45649a;
    public final i90 f45650b;

    public b90(i90 i90Var, int i7) {
        this.f45649a = i7;
        this.f45650b = i90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f45649a;
        i90 i90Var = this.f45650b;
        switch (i7) {
            case 0:
                vf.c.t(i90Var.getParentActivity(), org.telegram.messenger.hd.M0(2131746156, null));
                return;
            case 1:
                i90Var.f47982r.d.requestFocus();
                org.telegram.messenger.g0.J3(i90Var.f47982r.d);
                return;
            default:
                i90Var.f47982r.d.clearFocus();
                org.telegram.messenger.g0.v1(i90Var.f47982r.d);
                return;
        }
    }
}
