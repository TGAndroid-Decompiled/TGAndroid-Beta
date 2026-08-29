package org.telegram.ui.Components;
public final class k7 implements Runnable {
    public final int f29953a;
    public final g8 f29954b;

    public k7(g8 g8Var, int i10) {
        this.f29953a = i10;
        this.f29954b = g8Var;
    }

    @Override
    public final void run() {
        switch (this.f29953a) {
            case 0:
                g8.n(this.f29954b);
                return;
            default:
                g8.F(this.f29954b);
                return;
        }
    }
}
