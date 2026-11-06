package org.telegram.ui.Components;
public final class wd0 implements Runnable {
    public final int f39961a;
    public final ae0 f39962b;

    public wd0(ae0 ae0Var, int i7) {
        this.f39961a = i7;
        this.f39962b = ae0Var;
    }

    @Override
    public final void run() {
        switch (this.f39961a) {
            case 0:
                this.f39962b.e();
                return;
            default:
                this.f39962b.g();
                return;
        }
    }
}
