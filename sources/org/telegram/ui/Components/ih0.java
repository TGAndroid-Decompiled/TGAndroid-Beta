package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f25134a;
    public final lh0 f25135b;

    public ih0(lh0 lh0Var, int i10) {
        this.f25134a = i10;
        this.f25135b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f25134a) {
            case 0:
                this.f25135b.a(true);
                return;
            default:
                this.f25135b.d();
                return;
        }
    }
}
