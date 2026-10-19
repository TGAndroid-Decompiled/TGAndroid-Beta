package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f30455a;
    public final u90 f30456b;
    public final y90 f30457c;

    public t90(u90 u90Var, y90 y90Var, int i10) {
        this.f30455a = i10;
        this.f30456b = u90Var;
        this.f30457c = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f30455a) {
            case 0:
                this.f30456b.k(this.f30457c, false);
                return;
            default:
                this.f30456b.k(this.f30457c, false);
                return;
        }
    }
}
