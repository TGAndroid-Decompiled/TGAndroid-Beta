package org.telegram.ui;
public final class ea0 implements Runnable {
    public final int f36784a;
    public final la0 f36785b;

    public ea0(la0 la0Var, int i10) {
        this.f36784a = i10;
        this.f36785b = la0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f36784a;
        la0 la0Var = this.f36785b;
        switch (i10) {
            case 0:
                gf.f.r(la0Var.getParentActivity(), org.telegram.messenger.dd.L0(2131746173, null));
                return;
            case 1:
                la0Var.f39172r.d.requestFocus();
                org.telegram.messenger.i0.J3(la0Var.f39172r.d);
                return;
            default:
                la0Var.f39172r.d.clearFocus();
                org.telegram.messenger.i0.v1(la0Var.f39172r.d);
                return;
        }
    }
}
