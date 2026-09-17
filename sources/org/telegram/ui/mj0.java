package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f38723a;
    public final tj0 f38724b;

    public mj0(tj0 tj0Var, int i10) {
        this.f38723a = i10;
        this.f38724b = tj0Var;
    }

    @Override
    public final void run() {
        switch (this.f38723a) {
            case 0:
                this.f38724b.dismiss();
                return;
            case 1:
                this.f38724b.U(true, false);
                return;
            default:
                this.f38724b.U(true, false);
                return;
        }
    }
}
