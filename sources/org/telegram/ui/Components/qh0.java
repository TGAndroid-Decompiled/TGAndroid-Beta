package org.telegram.ui.Components;
public final class qh0 implements Runnable {
    public final int f29685a;
    public final th0 f29686b;

    public qh0(th0 th0Var, int i10) {
        this.f29685a = i10;
        this.f29686b = th0Var;
    }

    @Override
    public final void run() {
        switch (this.f29685a) {
            case 0:
                this.f29686b.a(true);
                return;
            default:
                this.f29686b.d();
                return;
        }
    }
}
