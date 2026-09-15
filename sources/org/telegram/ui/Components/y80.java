package org.telegram.ui.Components;
public final class y80 implements Runnable {
    public final int f30177a;
    public final z80 f30178b;
    public final d90 f30179c;

    public y80(z80 z80Var, d90 d90Var, int i10) {
        this.f30177a = i10;
        this.f30178b = z80Var;
        this.f30179c = d90Var;
    }

    @Override
    public final void run() {
        switch (this.f30177a) {
            case 0:
                this.f30178b.k(this.f30179c, false);
                return;
            default:
                this.f30178b.k(this.f30179c, false);
                return;
        }
    }
}
