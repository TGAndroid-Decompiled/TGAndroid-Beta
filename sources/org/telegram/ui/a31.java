package org.telegram.ui;
public final class a31 implements Runnable {
    public final int f43556a;
    public final m31 f43557b;

    public a31(m31 m31Var, int i7) {
        this.f43556a = i7;
        this.f43557b = m31Var;
    }

    @Override
    public final void run() {
        int i7 = this.f43556a;
        m31 m31Var = this.f43557b;
        switch (i7) {
            case 0:
                org.telegram.messenger.qp.s1(m31Var.currentAccount).l0(null);
                return;
            case 1:
                vf.c.t(m31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131752154, null));
                return;
            default:
                m31Var.f47645c.f37160f3.O(true);
                return;
        }
    }
}
