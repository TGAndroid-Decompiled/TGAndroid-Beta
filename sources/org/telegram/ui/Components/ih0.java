package org.telegram.ui.Components;
public final class ih0 implements Runnable {
    public final int f25113a;
    public final lh0 f25114b;

    public ih0(lh0 lh0Var, int i10) {
        this.f25113a = i10;
        this.f25114b = lh0Var;
    }

    @Override
    public final void run() {
        switch (this.f25113a) {
            case 0:
                this.f25114b.a(true);
                return;
            default:
                this.f25114b.d();
                return;
        }
    }
}
