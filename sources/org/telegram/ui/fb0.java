package org.telegram.ui;
public final class fb0 implements Runnable {
    public final int f36882a;
    public final kb0 f36883b;

    public fb0(kb0 kb0Var, int i10) {
        this.f36882a = i10;
        this.f36883b = kb0Var;
    }

    @Override
    public final void run() {
        switch (this.f36882a) {
            case 0:
                this.f36883b.b();
                return;
            default:
                this.f36883b.c();
                return;
        }
    }
}
