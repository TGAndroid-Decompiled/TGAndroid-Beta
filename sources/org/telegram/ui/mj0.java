package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f38749a;
    public final tj0 f38750b;

    public mj0(tj0 tj0Var, int i10) {
        this.f38749a = i10;
        this.f38750b = tj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38749a) {
            case 0:
                this.f38750b.dismiss();
                return;
            case 1:
                this.f38750b.U(true, false);
                return;
            default:
                this.f38750b.U(true, false);
                return;
        }
    }
}
