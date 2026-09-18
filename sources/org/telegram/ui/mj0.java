package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f35832a;
    public final tj0 f35833b;

    public mj0(tj0 tj0Var, int i10) {
        this.f35832a = i10;
        this.f35833b = tj0Var;
    }

    @Override
    public final void run() {
        switch (this.f35832a) {
            case 0:
                this.f35833b.dismiss();
                return;
            case 1:
                this.f35833b.U(true, false);
                return;
            default:
                this.f35833b.U(true, false);
                return;
        }
    }
}
