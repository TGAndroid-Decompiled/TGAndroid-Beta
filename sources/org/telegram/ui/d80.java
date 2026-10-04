package org.telegram.ui;
public final class d80 implements Runnable {
    public final int f35694a;
    public final k80 f35695b;

    public d80(k80 k80Var, int i10) {
        this.f35694a = i10;
        this.f35695b = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f35694a) {
            case 0:
                k80 k80Var = this.f35695b;
                k80Var.h.postOnAnimation(new d80(k80Var, 1));
                return;
            default:
                this.f35695b.X();
                return;
        }
    }
}
