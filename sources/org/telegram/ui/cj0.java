package org.telegram.ui;
public final class cj0 implements Runnable {
    public final int f35816a;
    public final ij0 f35817b;

    public cj0(ij0 ij0Var, int i10) {
        this.f35816a = i10;
        this.f35817b = ij0Var;
    }

    @Override
    public final void run() {
        switch (this.f35816a) {
            case 0:
                this.f35817b.dismiss();
                return;
            case 1:
                this.f35817b.U(true, false);
                return;
            default:
                this.f35817b.U(true, false);
                return;
        }
    }
}
