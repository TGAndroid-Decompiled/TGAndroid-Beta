package org.telegram.ui.Components;
public final class ai0 implements Runnable {
    public final int f24612a;
    public final di0 f24613b;

    public ai0(di0 di0Var, int i10) {
        this.f24612a = i10;
        this.f24613b = di0Var;
    }

    @Override
    public final void run() {
        switch (this.f24612a) {
            case 0:
                this.f24613b.a(true);
                return;
            default:
                this.f24613b.d();
                return;
        }
    }
}
