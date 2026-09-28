package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f25112a;
    public final lh0 f25113b;

    public ih0(lh0 lh0Var, int i10) {
        this.f25112a = i10;
        this.f25113b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f25112a) {
            case 0:
                this.f25113b.a(true);
                return;
            default:
                this.f25113b.d();
                return;
        }
    }
}
