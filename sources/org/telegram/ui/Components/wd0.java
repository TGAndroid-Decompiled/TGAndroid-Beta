package org.telegram.ui.Components;
public final class wd0 implements Runnable {
    public final int f41328a;
    public final ae0 f41329b;

    public wd0(ae0 ae0Var, int i7) {
        this.f41328a = i7;
        this.f41329b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f41328a) {
            case 0:
                this.f41329b.e();
                return;
            default:
                this.f41329b.g();
                return;
        }
    }
}
