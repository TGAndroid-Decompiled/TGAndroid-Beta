package org.telegram.ui;
public final class d80 implements Runnable {
    public final int f35712a;
    public final k80 f35713b;

    public d80(k80 k80Var, int i10) {
        this.f35712a = i10;
        this.f35713b = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f35712a) {
            case 0:
                k80 k80Var = this.f35713b;
                k80Var.h.postOnAnimation(new d80(k80Var, 1));
                return;
            default:
                this.f35713b.X();
                return;
        }
    }
}
