package org.telegram.ui;
public final class db0 implements Runnable {
    public final int f36316a;
    public final ib0 f36317b;

    public db0(ib0 ib0Var, int i10) {
        this.f36316a = i10;
        this.f36317b = ib0Var;
    }

    @Override
    public final void run() {
        switch (this.f36316a) {
            case 0:
                this.f36317b.b();
                return;
            default:
                this.f36317b.c();
                return;
        }
    }
}
