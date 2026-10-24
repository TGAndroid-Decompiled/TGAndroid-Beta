package org.telegram.ui.Components;
public final class t11 implements Runnable {
    public final int f30683a;
    public final v11 f30684b;
    public final u11 f30685c;

    public t11(v11 v11Var, u11 u11Var, int i10) {
        this.f30683a = i10;
        this.f30684b = v11Var;
        this.f30685c = u11Var;
    }

    @Override
    public final void run() {
        switch (this.f30683a) {
            case 0:
                this.f30684b.b(this.f30685c);
                return;
            case 1:
                this.f30684b.b(this.f30685c);
                return;
            default:
                this.f30684b.b(this.f30685c);
                return;
        }
    }
}
