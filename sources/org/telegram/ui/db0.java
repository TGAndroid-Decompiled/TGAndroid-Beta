package org.telegram.ui;
public final class db0 implements Runnable {
    public final int f36327a;
    public final ib0 f36328b;

    public db0(ib0 ib0Var, int i10) {
        this.f36327a = i10;
        this.f36328b = ib0Var;
    }

    @Override
    public final void run() {
        switch (this.f36327a) {
            case 0:
                this.f36328b.b();
                return;
            default:
                this.f36328b.c();
                return;
        }
    }
}
