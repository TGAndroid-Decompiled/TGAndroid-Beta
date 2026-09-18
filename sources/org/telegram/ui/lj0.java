package org.telegram.ui;
public final class lj0 implements Runnable {
    public final int f35390a;
    public final sj0 f35391b;

    public lj0(sj0 sj0Var, int i10) {
        this.f35390a = i10;
        this.f35391b = sj0Var;
    }

    @Override
    public final void run() {
        switch (this.f35390a) {
            case 0:
                this.f35391b.dismiss();
                return;
            case 1:
                this.f35391b.U(true, false);
                return;
            default:
                this.f35391b.U(true, false);
                return;
        }
    }
}
