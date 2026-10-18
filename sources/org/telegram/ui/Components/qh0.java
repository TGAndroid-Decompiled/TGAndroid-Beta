package org.telegram.ui.Components;
public final class qh0 implements Runnable {
    public final int f29692a;
    public final th0 f29693b;

    public qh0(th0 th0Var, int i10) {
        this.f29692a = i10;
        this.f29693b = th0Var;
    }

    @Override
    public final void run() {
        switch (this.f29692a) {
            case 0:
                this.f29693b.a(true);
                return;
            default:
                this.f29693b.d();
                return;
        }
    }
}
