package org.telegram.ui.Components;
public final class re0 implements Runnable {
    public final int f29902a;
    public final ve0 f29903b;

    public re0(ve0 ve0Var, int i10) {
        this.f29902a = i10;
        this.f29903b = ve0Var;
    }

    @Override
    public final void run() {
        switch (this.f29902a) {
            case 0:
                this.f29903b.e();
                return;
            default:
                this.f29903b.g();
                return;
        }
    }
}
