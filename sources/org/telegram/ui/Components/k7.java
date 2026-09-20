package org.telegram.ui.Components;
public final class k7 implements Runnable {
    public final int f25683a;
    public final i8 f25684b;

    public k7(i8 i8Var, int i10) {
        this.f25683a = i10;
        this.f25684b = i8Var;
    }

    @Override
    public final void run() {
        switch (this.f25683a) {
            case 0:
                i8.n(this.f25684b);
                return;
            default:
                i8.G(this.f25684b);
                return;
        }
    }
}
