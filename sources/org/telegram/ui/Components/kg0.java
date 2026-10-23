package org.telegram.ui.Components;
public final class kg0 implements Runnable {
    public final int f28035a;
    public final pg0 f28036b;

    public kg0(pg0 pg0Var, int i10) {
        this.f28035a = i10;
        this.f28036b = pg0Var;
    }

    @Override
    public final void run() {
        switch (this.f28035a) {
            case 0:
                this.f28036b.e();
                return;
            default:
                this.f28036b.g();
                return;
        }
    }
}
