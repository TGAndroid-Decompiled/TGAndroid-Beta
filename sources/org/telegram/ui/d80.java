package org.telegram.ui;
public final class d80 implements Runnable {
    public final int f35700a;
    public final k80 f35701b;

    public d80(k80 k80Var, int i10) {
        this.f35700a = i10;
        this.f35701b = k80Var;
    }

    @Override
    public final void run() {
        switch (this.f35700a) {
            case 0:
                k80 k80Var = this.f35701b;
                k80Var.h.postOnAnimation(new d80(k80Var, 1));
                return;
            default:
                this.f35701b.X();
                return;
        }
    }
}
