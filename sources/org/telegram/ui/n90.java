package org.telegram.ui;
public final class n90 implements Runnable {
    public final int f50133a;
    public final r90 f50134b;

    public n90(r90 r90Var, int i7) {
        this.f50133a = i7;
        this.f50134b = r90Var;
    }

    @Override
    public final void run() {
        switch (this.f50133a) {
            case 0:
                this.f50134b.b();
                return;
            default:
                this.f50134b.c();
                return;
        }
    }
}
