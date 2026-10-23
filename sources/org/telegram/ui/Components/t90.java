package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f30484a;
    public final u90 f30485b;
    public final y90 f30486c;

    public t90(u90 u90Var, y90 y90Var, int i10) {
        this.f30484a = i10;
        this.f30485b = u90Var;
        this.f30486c = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f30484a) {
            case 0:
                this.f30485b.k(this.f30486c, false);
                return;
            default:
                this.f30485b.k(this.f30486c, false);
                return;
        }
    }
}
