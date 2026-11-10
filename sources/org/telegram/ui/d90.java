package org.telegram.ui;
public final class d90 implements Runnable {
    public final int f44935a;
    public final k90 f44936b;

    public d90(k90 k90Var, int i7) {
        this.f44935a = i7;
        this.f44936b = k90Var;
    }

    @Override
    public final void run() {
        int i7 = this.f44935a;
        k90 k90Var = this.f44936b;
        switch (i7) {
            case 0:
                vf.c.t(k90Var.getParentActivity(), org.telegram.messenger.id.M0(2131746156, null));
                return;
            case 1:
                k90Var.f47230r.d.requestFocus();
                org.telegram.messenger.g0.K3(k90Var.f47230r.d);
                return;
            default:
                k90Var.f47230r.d.clearFocus();
                org.telegram.messenger.g0.v1(k90Var.f47230r.d);
                return;
        }
    }
}
