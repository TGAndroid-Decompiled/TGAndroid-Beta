package org.telegram.ui;
public final class k90 implements Runnable {
    public final int f47145a;
    public final p90 f47146b;

    public k90(p90 p90Var, int i7) {
        this.f47145a = i7;
        this.f47146b = p90Var;
    }

    @Override
    public final void run() {
        switch (this.f47145a) {
            case 0:
                this.f47146b.b();
                return;
            default:
                this.f47146b.c();
                return;
        }
    }
}
