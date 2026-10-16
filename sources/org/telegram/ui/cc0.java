package org.telegram.ui;
public final class cc0 implements Runnable {
    public final int f34556a;
    public final ic0 f34557b;

    public cc0(ic0 ic0Var, int i10) {
        this.f34556a = i10;
        this.f34557b = ic0Var;
    }

    @Override
    public final void run() {
        switch (this.f34556a) {
            case 0:
                this.f34557b.b();
                return;
            default:
                this.f34557b.c();
                return;
        }
    }
}
