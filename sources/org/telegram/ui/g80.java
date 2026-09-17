package org.telegram.ui;
public final class g80 implements Runnable {
    public final int f33906a;
    public final n80 f33907b;

    public g80(n80 n80Var, int i10) {
        this.f33906a = i10;
        this.f33907b = n80Var;
    }

    @Override
    public final void run() {
        switch (this.f33906a) {
            case 0:
                n80 n80Var = this.f33907b;
                n80Var.h.postOnAnimation(new g80(n80Var, 1));
                return;
            default:
                this.f33907b.Y();
                return;
        }
    }
}
