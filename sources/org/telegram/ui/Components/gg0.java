package org.telegram.ui.Components;
public final class gg0 implements Runnable {
    public final int f26587a;
    public final lg0 f26588b;

    public gg0(lg0 lg0Var, int i10) {
        this.f26587a = i10;
        this.f26588b = lg0Var;
    }

    @Override
    public final void run() {
        switch (this.f26587a) {
            case 0:
                this.f26588b.e();
                return;
            default:
                this.f26588b.g();
                return;
        }
    }
}
