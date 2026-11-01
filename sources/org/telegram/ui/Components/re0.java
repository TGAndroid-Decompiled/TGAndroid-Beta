package org.telegram.ui.Components;
public final class re0 implements Runnable {
    public final int f29980a;
    public final ve0 f29981b;

    public re0(ve0 ve0Var, int i10) {
        this.f29980a = i10;
        this.f29981b = ve0Var;
    }

    @Override
    public final void run() {
        switch (this.f29980a) {
            case 0:
                this.f29981b.e();
                return;
            default:
                this.f29981b.g();
                return;
        }
    }
}
