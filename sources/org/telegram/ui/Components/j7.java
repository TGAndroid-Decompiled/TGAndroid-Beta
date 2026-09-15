package org.telegram.ui.Components;
public final class j7 implements Runnable {
    public final int f25245a;
    public final h8 f25246b;

    public j7(h8 h8Var, int i10) {
        this.f25245a = i10;
        this.f25246b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f25245a) {
            case 0:
                h8.n(this.f25246b);
                return;
            default:
                h8.G(this.f25246b);
                return;
        }
    }
}
