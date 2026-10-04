package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f27414a;
    public final lh0 f27415b;

    public ih0(lh0 lh0Var, int i10) {
        this.f27414a = i10;
        this.f27415b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f27414a) {
            case 0:
                this.f27415b.a(true);
                return;
            default:
                this.f27415b.d();
                return;
        }
    }
}
