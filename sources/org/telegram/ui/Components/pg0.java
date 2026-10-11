package org.telegram.ui.Components;
public final class pg0 implements Runnable {
    public final int f29722a;
    public final ug0 f29723b;

    public pg0(ug0 ug0Var, int i10) {
        this.f29722a = i10;
        this.f29723b = ug0Var;
    }

    @Override
    public final void run() {
        switch (this.f29722a) {
            case 0:
                this.f29723b.e();
                return;
            default:
                this.f29723b.g();
                return;
        }
    }
}
