package org.telegram.ui.Components;
public final class j7 implements Runnable {
    public final int f25150a;
    public final h8 f25151b;

    public j7(h8 h8Var, int i10) {
        this.f25150a = i10;
        this.f25151b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f25150a) {
            case 0:
                h8.n(this.f25151b);
                return;
            default:
                h8.G(this.f25151b);
                return;
        }
    }
}
