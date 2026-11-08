package org.telegram.ui.Components;
public final class wd0 implements Runnable {
    public final int f39911a;
    public final ae0 f39912b;

    public wd0(ae0 ae0Var, int i7) {
        this.f39911a = i7;
        this.f39912b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f39911a) {
            case 0:
                this.f39912b.e();
                return;
            default:
                this.f39912b.g();
                return;
        }
    }
}
