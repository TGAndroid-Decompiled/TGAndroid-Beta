package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f27415a;
    public final lh0 f27416b;

    public ih0(lh0 lh0Var, int i10) {
        this.f27415a = i10;
        this.f27416b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f27415a) {
            case 0:
                this.f27416b.a(true);
                return;
            default:
                this.f27416b.d();
                return;
        }
    }
}
