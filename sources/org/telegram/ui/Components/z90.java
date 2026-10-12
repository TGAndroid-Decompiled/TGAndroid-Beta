package org.telegram.ui.Components;
public final class z90 implements Runnable {
    public final int f31823a;
    public final aa0 f31824b;
    public final ea0 f31825c;

    public z90(aa0 aa0Var, ea0 ea0Var, int i10) {
        this.f31823a = i10;
        this.f31824b = aa0Var;
        this.f31825c = ea0Var;
    }

    @Override
    public final void run() {
        switch (this.f31823a) {
            case 0:
                this.f31824b.k(this.f31825c, false);
                return;
            default:
                this.f31824b.k(this.f31825c, false);
                return;
        }
    }
}
