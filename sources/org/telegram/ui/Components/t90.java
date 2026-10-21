package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f30480a;
    public final u90 f30481b;
    public final y90 f30482c;

    public t90(u90 u90Var, y90 y90Var, int i10) {
        this.f30480a = i10;
        this.f30481b = u90Var;
        this.f30482c = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f30480a) {
            case 0:
                this.f30481b.k(this.f30482c, false);
                return;
            default:
                this.f30481b.k(this.f30482c, false);
                return;
        }
    }
}
