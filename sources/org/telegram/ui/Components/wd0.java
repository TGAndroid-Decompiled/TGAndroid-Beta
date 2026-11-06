package org.telegram.ui.Components;
public final class wd0 implements Runnable {
    public final int f39946a;
    public final ae0 f39947b;

    public wd0(ae0 ae0Var, int i7) {
        this.f39946a = i7;
        this.f39947b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f39946a) {
            case 0:
                this.f39947b.e();
                return;
            default:
                this.f39947b.g();
                return;
        }
    }
}
