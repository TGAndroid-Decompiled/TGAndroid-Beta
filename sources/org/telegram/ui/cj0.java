package org.telegram.ui;
public final class cj0 implements Runnable {
    public final int f35864a;
    public final ij0 f35865b;

    public cj0(ij0 ij0Var, int i10) {
        this.f35864a = i10;
        this.f35865b = ij0Var;
    }

    @Override
    public final void run() {
        switch (this.f35864a) {
            case 0:
                this.f35865b.dismiss();
                return;
            case 1:
                this.f35865b.U(true, false);
                return;
            default:
                this.f35865b.U(true, false);
                return;
        }
    }
}
