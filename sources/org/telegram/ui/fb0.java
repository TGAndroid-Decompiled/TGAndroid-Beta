package org.telegram.ui;
public final class fb0 implements Runnable {
    public final int f36866a;
    public final kb0 f36867b;

    public fb0(kb0 kb0Var, int i10) {
        this.f36866a = i10;
        this.f36867b = kb0Var;
    }

    @Override
    public final void run() {
        switch (this.f36866a) {
            case 0:
                this.f36867b.b();
                return;
            default:
                this.f36867b.c();
                return;
        }
    }
}
