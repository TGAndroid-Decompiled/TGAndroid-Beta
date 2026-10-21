package org.telegram.ui;
public final class db0 implements Runnable {
    public final int f36323a;
    public final ib0 f36324b;

    public db0(ib0 ib0Var, int i10) {
        this.f36323a = i10;
        this.f36324b = ib0Var;
    }

    @Override
    public final void run() {
        switch (this.f36323a) {
            case 0:
                this.f36324b.b();
                return;
            default:
                this.f36324b.c();
                return;
        }
    }
}
