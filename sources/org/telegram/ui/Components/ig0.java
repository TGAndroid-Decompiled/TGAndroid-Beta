package org.telegram.ui.Components;
public final class ig0 implements Runnable {
    public final int f29329a;
    public final ng0 f29330b;

    public ig0(ng0 ng0Var, int i10) {
        this.f29329a = i10;
        this.f29330b = ng0Var;
    }

    @Override
    public final void run() {
        switch (this.f29329a) {
            case 0:
                this.f29330b.e();
                return;
            default:
                this.f29330b.g();
                return;
        }
    }
}
