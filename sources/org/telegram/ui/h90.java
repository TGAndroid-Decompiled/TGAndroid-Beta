package org.telegram.ui;
public final class h90 implements Runnable {
    public final int f45866a;
    public final m90 f45867b;

    public h90(m90 m90Var, int i3) {
        this.f45866a = i3;
        this.f45867b = m90Var;
    }

    @Override
    public final void run() {
        switch (this.f45866a) {
            case 0:
                this.f45867b.b();
                return;
            default:
                this.f45867b.c();
                return;
        }
    }
}
