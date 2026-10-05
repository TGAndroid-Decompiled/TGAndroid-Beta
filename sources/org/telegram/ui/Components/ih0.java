package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f27515a;
    public final lh0 f27516b;

    public ih0(lh0 lh0Var, int i10) {
        this.f27515a = i10;
        this.f27516b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f27515a) {
            case 0:
                this.f27516b.a(true);
                return;
            default:
                this.f27516b.d();
                return;
        }
    }
}
