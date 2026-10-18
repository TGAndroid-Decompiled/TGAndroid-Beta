package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f30500a;
    public final u90 f30501b;
    public final y90 f30502c;

    public t90(u90 u90Var, y90 y90Var, int i10) {
        this.f30500a = i10;
        this.f30501b = u90Var;
        this.f30502c = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f30500a) {
            case 0:
                this.f30501b.k(this.f30502c, false);
                return;
            default:
                this.f30501b.k(this.f30502c, false);
                return;
        }
    }
}
