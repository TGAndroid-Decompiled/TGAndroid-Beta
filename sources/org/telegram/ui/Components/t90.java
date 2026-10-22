package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f30483a;
    public final u90 f30484b;
    public final y90 f30485c;

    public t90(u90 u90Var, y90 y90Var, int i10) {
        this.f30483a = i10;
        this.f30484b = u90Var;
        this.f30485c = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f30483a) {
            case 0:
                this.f30484b.k(this.f30485c, false);
                return;
            default:
                this.f30484b.k(this.f30485c, false);
                return;
        }
    }
}
