package org.telegram.ui.Components;
public final class r11 implements Runnable {
    public final int f30329a;
    public final u11 f30330b;
    public final t11 f30331c;

    public r11(u11 u11Var, t11 t11Var, int i10) {
        this.f30329a = i10;
        this.f30330b = u11Var;
        this.f30331c = t11Var;
    }

    @Override
    public final void run() {
        switch (this.f30329a) {
            case 0:
                this.f30330b.b(this.f30331c);
                return;
            case 1:
                this.f30330b.b(this.f30331c);
                return;
            default:
                this.f30330b.b(this.f30331c);
                return;
        }
    }
}
