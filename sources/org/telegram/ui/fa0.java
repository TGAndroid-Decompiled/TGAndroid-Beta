package org.telegram.ui;
public final class fa0 implements Runnable {
    public final int f37216a;
    public final ma0 f37217b;

    public fa0(ma0 ma0Var, int i10) {
        this.f37216a = i10;
        this.f37217b = ma0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f37216a;
        ma0 ma0Var = this.f37217b;
        switch (i10) {
            case 0:
                gf.f.r(ma0Var.getParentActivity(), org.telegram.messenger.cd.L0(2131746173, null));
                return;
            case 1:
                ma0Var.f39615r.d.requestFocus();
                org.telegram.messenger.i0.J3(ma0Var.f39615r.d);
                return;
            default:
                ma0Var.f39615r.d.clearFocus();
                org.telegram.messenger.i0.v1(ma0Var.f39615r.d);
                return;
        }
    }
}
