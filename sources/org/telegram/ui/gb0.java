package org.telegram.ui;
public final class gb0 implements Runnable {
    public final int f39604a;
    public final lb0 f39605b;

    public gb0(lb0 lb0Var, int i10) {
        this.f39604a = i10;
        this.f39605b = lb0Var;
    }

    @Override
    public final void run() {
        switch (this.f39604a) {
            case 0:
                this.f39605b.b();
                return;
            default:
                this.f39605b.c();
                return;
        }
    }
}
