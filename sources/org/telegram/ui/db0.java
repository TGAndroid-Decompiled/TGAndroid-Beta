package org.telegram.ui;
public final class db0 implements Runnable {
    public final int f36344a;
    public final ib0 f36345b;

    public db0(ib0 ib0Var, int i10) {
        this.f36344a = i10;
        this.f36345b = ib0Var;
    }

    @Override
    public final void run() {
        switch (this.f36344a) {
            case 0:
                this.f36345b.b();
                return;
            default:
                this.f36345b.c();
                return;
        }
    }
}
