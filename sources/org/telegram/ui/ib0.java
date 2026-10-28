package org.telegram.ui;
public final class ib0 implements Runnable {
    public final int f40103a;
    public final ob0 f40104b;

    public ib0(ob0 ob0Var, int i10) {
        this.f40103a = i10;
        this.f40104b = ob0Var;
    }

    @Override
    public final void run() {
        switch (this.f40103a) {
            case 0:
                this.f40104b.b();
                return;
            default:
                this.f40104b.c();
                return;
        }
    }
}
