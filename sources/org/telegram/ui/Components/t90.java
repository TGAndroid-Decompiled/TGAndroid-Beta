package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f30493a;
    public final u90 f30494b;
    public final y90 f30495c;

    public t90(u90 u90Var, y90 y90Var, int i10) {
        this.f30493a = i10;
        this.f30494b = u90Var;
        this.f30495c = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f30493a) {
            case 0:
                this.f30494b.k(this.f30495c, false);
                return;
            default:
                this.f30494b.k(this.f30495c, false);
                return;
        }
    }
}
