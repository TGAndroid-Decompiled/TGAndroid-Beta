package org.telegram.ui.Components;
public final class k90 implements Runnable {
    public final int f25675a;
    public final l90 f25676b;
    public final p90 f25677c;

    public k90(l90 l90Var, p90 p90Var, int i10) {
        this.f25675a = i10;
        this.f25676b = l90Var;
        this.f25677c = p90Var;
    }

    @Override
    public final void run() {
        switch (this.f25675a) {
            case 0:
                this.f25676b.k(this.f25677c, false);
                return;
            default:
                this.f25676b.k(this.f25677c, false);
                return;
        }
    }
}
