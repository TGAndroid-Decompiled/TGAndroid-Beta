package org.telegram.ui.Components;
public final class qh0 implements Runnable {
    public final int f29686a;
    public final th0 f29687b;

    public qh0(th0 th0Var, int i10) {
        this.f29686a = i10;
        this.f29687b = th0Var;
    }

    @Override
    public final void run() {
        switch (this.f29686a) {
            case 0:
                this.f29687b.a(true);
                return;
            default:
                this.f29687b.d();
                return;
        }
    }
}
