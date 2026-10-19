package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f30457a;
    public final u90 f30458b;
    public final y90 f30459c;

    public t90(u90 u90Var, y90 y90Var, int i10) {
        this.f30457a = i10;
        this.f30458b = u90Var;
        this.f30459c = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f30457a) {
            case 0:
                this.f30458b.k(this.f30459c, false);
                return;
            default:
                this.f30458b.k(this.f30459c, false);
                return;
        }
    }
}
