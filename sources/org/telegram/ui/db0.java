package org.telegram.ui;
public final class db0 implements Runnable {
    public final int f36326a;
    public final ib0 f36327b;

    public db0(ib0 ib0Var, int i10) {
        this.f36326a = i10;
        this.f36327b = ib0Var;
    }

    @Override
    public final void run() {
        switch (this.f36326a) {
            case 0:
                this.f36327b.b();
                return;
            default:
                this.f36327b.c();
                return;
        }
    }
}
