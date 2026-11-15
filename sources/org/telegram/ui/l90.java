package org.telegram.ui;
public final class l90 implements Runnable {
    public final int f48904a;
    public final q90 f48905b;

    public l90(q90 q90Var, int i7) {
        this.f48904a = i7;
        this.f48905b = q90Var;
    }

    @Override
    public final void run() {
        switch (this.f48904a) {
            case 0:
                this.f48905b.b();
                return;
            default:
                this.f48905b.c();
                return;
        }
    }
}
