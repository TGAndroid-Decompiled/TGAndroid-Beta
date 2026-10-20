package org.telegram.ui.Components;
public final class t90 implements Runnable {
    public final int f30479a;
    public final u90 f30480b;
    public final y90 f30481c;

    public t90(u90 u90Var, y90 y90Var, int i10) {
        this.f30479a = i10;
        this.f30480b = u90Var;
        this.f30481c = y90Var;
    }

    @Override
    public final void run() {
        switch (this.f30479a) {
            case 0:
                this.f30480b.k(this.f30481c, false);
                return;
            default:
                this.f30480b.k(this.f30481c, false);
                return;
        }
    }
}
