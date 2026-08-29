package org.telegram.ui.Components;
public final class u80 implements Runnable {
    public final int f33157a;
    public final v80 f33158b;
    public final z80 f33159c;

    public u80(v80 v80Var, z80 z80Var, int i10) {
        this.f33157a = i10;
        this.f33158b = v80Var;
        this.f33159c = z80Var;
    }

    @Override
    public final void run() {
        switch (this.f33157a) {
            case 0:
                this.f33158b.k(this.f33159c, false);
                return;
            default:
                this.f33158b.k(this.f33159c, false);
                return;
        }
    }
}
