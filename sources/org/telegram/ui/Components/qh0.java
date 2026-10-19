package org.telegram.ui.Components;
public final class qh0 implements Runnable {
    public final int f29643a;
    public final th0 f29644b;

    public qh0(th0 th0Var, int i10) {
        this.f29643a = i10;
        this.f29644b = th0Var;
    }

    @Override
    public final void run() {
        switch (this.f29643a) {
            case 0:
                this.f29644b.a(true);
                return;
            default:
                this.f29644b.d();
                return;
        }
    }
}
