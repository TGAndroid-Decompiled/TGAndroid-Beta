package org.telegram.ui.Components;
public final class qh0 implements Runnable {
    public final int f29641a;
    public final th0 f29642b;

    public qh0(th0 th0Var, int i10) {
        this.f29641a = i10;
        this.f29642b = th0Var;
    }

    @Override
    public final void run() {
        switch (this.f29641a) {
            case 0:
                this.f29642b.a(true);
                return;
            default:
                this.f29642b.d();
                return;
        }
    }
}
