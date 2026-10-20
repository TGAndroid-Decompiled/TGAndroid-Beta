package org.telegram.ui;
public final class db0 implements Runnable {
    public final int f36322a;
    public final ib0 f36323b;

    public db0(ib0 ib0Var, int i10) {
        this.f36322a = i10;
        this.f36323b = ib0Var;
    }

    @Override
    public final void run() {
        switch (this.f36322a) {
            case 0:
                this.f36323b.b();
                return;
            default:
                this.f36323b.c();
                return;
        }
    }
}
