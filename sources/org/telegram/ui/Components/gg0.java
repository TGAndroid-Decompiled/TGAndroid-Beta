package org.telegram.ui.Components;
public final class gg0 implements Runnable {
    public final int f26583a;
    public final lg0 f26584b;

    public gg0(lg0 lg0Var, int i10) {
        this.f26583a = i10;
        this.f26584b = lg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26583a) {
            case 0:
                this.f26584b.e();
                return;
            default:
                this.f26584b.g();
                return;
        }
    }
}
