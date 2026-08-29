package org.telegram.ui;
public final class l70 implements Runnable {
    public final int f40110a;
    public final s70 f40111b;

    public l70(s70 s70Var, int i10) {
        this.f40110a = i10;
        this.f40111b = s70Var;
    }

    @Override
    public final void run() {
        switch (this.f40110a) {
            case 0:
                s70 s70Var = this.f40111b;
                s70Var.h.postOnAnimation(new l70(s70Var, 1));
                return;
            default:
                this.f40111b.Y();
                return;
        }
    }
}
