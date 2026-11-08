package org.telegram.ui;
public final class k90 implements Runnable {
    public final int f47146a;
    public final p90 f47147b;

    public k90(p90 p90Var, int i7) {
        this.f47146a = i7;
        this.f47147b = p90Var;
    }

    @Override
    public final void run() {
        switch (this.f47146a) {
            case 0:
                this.f47147b.b();
                return;
            default:
                this.f47147b.c();
                return;
        }
    }
}
