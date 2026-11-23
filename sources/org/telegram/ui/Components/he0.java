package org.telegram.ui.Components;
public final class he0 implements Runnable {
    public final int f35872a;
    public final le0 f35873b;

    public he0(le0 le0Var, int i7) {
        this.f35872a = i7;
        this.f35873b = le0Var;
    }

    @Override
    public final void run() {
        switch (this.f35872a) {
            case 0:
                this.f35873b.e();
                return;
            default:
                this.f35873b.g();
                return;
        }
    }
}
