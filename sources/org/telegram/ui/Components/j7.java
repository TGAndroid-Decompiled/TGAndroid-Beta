package org.telegram.ui.Components;
public final class j7 implements Runnable {
    public final int f25242a;
    public final h8 f25243b;

    public j7(h8 h8Var, int i10) {
        this.f25242a = i10;
        this.f25243b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f25242a) {
            case 0:
                h8.n(this.f25243b);
                return;
            default:
                h8.G(this.f25243b);
                return;
        }
    }
}
