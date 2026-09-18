package org.telegram.ui.Components;
public final class y80 implements Runnable {
    public final int f30145a;
    public final z80 f30146b;
    public final d90 f30147c;

    public y80(z80 z80Var, d90 d90Var, int i10) {
        this.f30145a = i10;
        this.f30146b = z80Var;
        this.f30147c = d90Var;
    }

    @Override
    public final void run() {
        switch (this.f30145a) {
            case 0:
                this.f30146b.k(this.f30147c, false);
                return;
            default:
                this.f30146b.k(this.f30147c, false);
                return;
        }
    }
}
