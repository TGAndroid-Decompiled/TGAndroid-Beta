package org.telegram.ui.Components;
public final class wd0 implements Runnable {
    public final int f39949a;
    public final ae0 f39950b;

    public wd0(ae0 ae0Var, int i7) {
        this.f39949a = i7;
        this.f39950b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f39949a) {
            case 0:
                this.f39950b.e();
                return;
            default:
                this.f39950b.g();
                return;
        }
    }
}
