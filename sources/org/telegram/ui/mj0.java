package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f39977a;
    public final sj0 f39978b;

    public mj0(sj0 sj0Var, int i10) {
        this.f39977a = i10;
        this.f39978b = sj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39977a) {
            case 0:
                this.f39978b.dismiss();
                return;
            case 1:
                this.f39978b.V(true, false);
                return;
            default:
                this.f39978b.V(true, false);
                return;
        }
    }
}
