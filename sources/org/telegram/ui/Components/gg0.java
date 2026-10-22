package org.telegram.ui.Components;
public final class gg0 implements Runnable {
    public final int f26586a;
    public final lg0 f26587b;

    public gg0(lg0 lg0Var, int i10) {
        this.f26586a = i10;
        this.f26587b = lg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26586a) {
            case 0:
                this.f26587b.e();
                return;
            default:
                this.f26587b.g();
                return;
        }
    }
}
