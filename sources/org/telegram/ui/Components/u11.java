package org.telegram.ui.Components;
public final class u11 implements Runnable {
    public final int f29240a;
    public final x11 f29241b;
    public final w11 f29242c;

    public u11(x11 x11Var, w11 w11Var, int i10) {
        this.f29240a = i10;
        this.f29241b = x11Var;
        this.f29242c = w11Var;
    }

    @Override
    public final void run() {
        switch (this.f29240a) {
            case 0:
                this.f29241b.b(this.f29242c);
                return;
            case 1:
                this.f29241b.b(this.f29242c);
                return;
            default:
                this.f29241b.b(this.f29242c);
                return;
        }
    }
}
