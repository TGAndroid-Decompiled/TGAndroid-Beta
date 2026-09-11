package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f38722a;
    public final tj0 f38723b;

    public mj0(tj0 tj0Var, int i10) {
        this.f38722a = i10;
        this.f38723b = tj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38722a) {
            case 0:
                this.f38723b.dismiss();
                return;
            case 1:
                this.f38723b.U(true, false);
                return;
            default:
                this.f38723b.U(true, false);
                return;
        }
    }
}
