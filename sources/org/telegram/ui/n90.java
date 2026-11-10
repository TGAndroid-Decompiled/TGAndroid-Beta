package org.telegram.ui;
public final class n90 implements Runnable {
    public final int f48163a;
    public final s90 f48164b;

    public n90(s90 s90Var, int i7) {
        this.f48163a = i7;
        this.f48164b = s90Var;
    }

    @Override
    public final void run() {
        switch (this.f48163a) {
            case 0:
                this.f48164b.b();
                return;
            default:
                this.f48164b.c();
                return;
        }
    }
}
