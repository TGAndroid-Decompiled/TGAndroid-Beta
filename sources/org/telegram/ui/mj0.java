package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f39931a;
    public final sj0 f39932b;

    public mj0(sj0 sj0Var, int i10) {
        this.f39931a = i10;
        this.f39932b = sj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39931a) {
            case 0:
                this.f39932b.dismiss();
                return;
            case 1:
                this.f39932b.V(true, false);
                return;
            default:
                this.f39932b.V(true, false);
                return;
        }
    }
}
