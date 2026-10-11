package org.telegram.ui;
public final class d80 implements Runnable {
    public final int f36947a;
    public final k80 f36948b;

    public d80(k80 k80Var, int i10) {
        this.f36947a = i10;
        this.f36948b = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f36947a) {
            case 0:
                k80 k80Var = this.f36948b;
                k80Var.h.postOnAnimation(new d80(k80Var, 1));
                return;
            default:
                this.f36948b.Y();
                return;
        }
    }
}
