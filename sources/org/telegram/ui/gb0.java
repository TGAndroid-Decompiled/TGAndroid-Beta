package org.telegram.ui;
public final class gb0 implements Runnable {
    public final int f39601a;
    public final lb0 f39602b;

    public gb0(lb0 lb0Var, int i10) {
        this.f39601a = i10;
        this.f39602b = lb0Var;
    }

    @Override
    public final void run() {
        switch (this.f39601a) {
            case 0:
                this.f39602b.b();
                return;
            default:
                this.f39602b.c();
                return;
        }
    }
}
