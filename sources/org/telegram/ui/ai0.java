package org.telegram.ui;
public final class ai0 implements Runnable {
    public final int f35657a;
    public final gi0 f35658b;

    public ai0(gi0 gi0Var, int i10) {
        this.f35657a = i10;
        this.f35658b = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f35657a) {
            case 0:
                org.telegram.messenger.i0.v1(this.f35658b.f37559i1);
                return;
            default:
                org.telegram.messenger.i0.J3(this.f35658b.f37560j1.getEditText());
                return;
        }
    }
}
