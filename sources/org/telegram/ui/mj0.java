package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f35827a;
    public final tj0 f35828b;

    public mj0(tj0 tj0Var, int i10) {
        this.f35827a = i10;
        this.f35828b = tj0Var;
    }

    @Override
    public final void run() {
        switch (this.f35827a) {
            case 0:
                this.f35828b.dismiss();
                return;
            case 1:
                this.f35828b.U(true, false);
                return;
            default:
                this.f35828b.U(true, false);
                return;
        }
    }
}
