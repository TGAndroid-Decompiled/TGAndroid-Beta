package org.telegram.ui;
public final class fb0 implements Runnable {
    public final int f36859a;
    public final kb0 f36860b;

    public fb0(kb0 kb0Var, int i10) {
        this.f36859a = i10;
        this.f36860b = kb0Var;
    }

    @Override
    public final void run() {
        switch (this.f36859a) {
            case 0:
                this.f36860b.b();
                return;
            default:
                this.f36860b.c();
                return;
        }
    }
}
