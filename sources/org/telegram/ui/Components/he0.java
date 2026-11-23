package org.telegram.ui.Components;
public final class he0 implements Runnable {
    public final int f35873a;
    public final le0 f35874b;

    public he0(le0 le0Var, int i7) {
        this.f35873a = i7;
        this.f35874b = le0Var;
    }

    @Override
    public final void run() {
        switch (this.f35873a) {
            case 0:
                this.f35874b.e();
                return;
            default:
                this.f35874b.g();
                return;
        }
    }
}
