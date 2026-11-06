package org.telegram.ui;
public final class k90 implements Runnable {
    public final int f47123a;
    public final p90 f47124b;

    public k90(p90 p90Var, int i7) {
        this.f47123a = i7;
        this.f47124b = p90Var;
    }

    @Override
    public final void run() {
        switch (this.f47123a) {
            case 0:
                this.f47124b.b();
                return;
            default:
                this.f47124b.c();
                return;
        }
    }
}
