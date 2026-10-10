package org.telegram.ui.Components;
public final class ai0 implements Runnable {
    public final int f24571a;
    public final ei0 f24572b;

    public ai0(ei0 ei0Var, int i10) {
        this.f24571a = i10;
        this.f24572b = ei0Var;
    }

    @Override
    public final void run() {
        switch (this.f24571a) {
            case 0:
                this.f24572b.a(true);
                return;
            default:
                this.f24572b.d();
                return;
        }
    }
}
