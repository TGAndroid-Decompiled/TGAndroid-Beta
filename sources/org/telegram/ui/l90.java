package org.telegram.ui;
public final class l90 implements Runnable {
    public final int f48908a;
    public final q90 f48909b;

    public l90(q90 q90Var, int i7) {
        this.f48908a = i7;
        this.f48909b = q90Var;
    }

    @Override
    public final void run() {
        switch (this.f48908a) {
            case 0:
                this.f48909b.b();
                return;
            default:
                this.f48909b.c();
                return;
        }
    }
}
