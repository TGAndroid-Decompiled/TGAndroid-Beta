package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f38750a;
    public final tj0 f38751b;

    public mj0(tj0 tj0Var, int i10) {
        this.f38750a = i10;
        this.f38751b = tj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38750a) {
            case 0:
                this.f38751b.dismiss();
                return;
            case 1:
                this.f38751b.U(true, false);
                return;
            default:
                this.f38751b.U(true, false);
                return;
        }
    }
}
