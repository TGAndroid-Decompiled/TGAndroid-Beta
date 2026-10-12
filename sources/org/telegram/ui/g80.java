package org.telegram.ui;
public final class g80 implements Runnable {
    public final int f37977a;
    public final n80 f37978b;

    public g80(n80 n80Var, int i10) {
        this.f37977a = i10;
        this.f37978b = n80Var;
    }

    @Override
    public final void run() {
        switch (this.f37977a) {
            case 0:
                n80 n80Var = this.f37978b;
                n80Var.h.postOnAnimation(new g80(n80Var, 1));
                return;
            default:
                this.f37978b.Y();
                return;
        }
    }
}
