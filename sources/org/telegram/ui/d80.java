package org.telegram.ui;
public final class d80 implements Runnable {
    public final int f36981a;
    public final k80 f36982b;

    public d80(k80 k80Var, int i10) {
        this.f36981a = i10;
        this.f36982b = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f36981a) {
            case 0:
                k80 k80Var = this.f36982b;
                k80Var.h.postOnAnimation(new d80(k80Var, 1));
                return;
            default:
                this.f36982b.Y();
                return;
        }
    }
}
