package org.telegram.ui.Components;
public final class j7 implements Runnable {
    public final int f25147a;
    public final h8 f25148b;

    public j7(h8 h8Var, int i10) {
        this.f25147a = i10;
        this.f25148b = h8Var;
    }

    @Override
    public final void run() {
        switch (this.f25147a) {
            case 0:
                h8.n(this.f25148b);
                return;
            default:
                h8.G(this.f25148b);
                return;
        }
    }
}
