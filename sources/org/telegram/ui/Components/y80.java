package org.telegram.ui.Components;
public final class y80 implements Runnable {
    public final int f30142a;
    public final z80 f30143b;
    public final d90 f30144c;

    public y80(z80 z80Var, d90 d90Var, int i10) {
        this.f30142a = i10;
        this.f30143b = z80Var;
        this.f30144c = d90Var;
    }

    @Override
    public final void run() {
        switch (this.f30142a) {
            case 0:
                this.f30143b.k(this.f30144c, false);
                return;
            default:
                this.f30143b.k(this.f30144c, false);
                return;
        }
    }
}
