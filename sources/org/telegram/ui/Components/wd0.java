package org.telegram.ui.Components;
public final class wd0 implements Runnable {
    public final int f41331a;
    public final ae0 f41332b;

    public wd0(ae0 ae0Var, int i7) {
        this.f41331a = i7;
        this.f41332b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f41331a) {
            case 0:
                this.f41332b.e();
                return;
            default:
                this.f41332b.g();
                return;
        }
    }
}
