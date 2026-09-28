package org.telegram.ui;
public final class ej0 implements Runnable {
    public final int f33429a;
    public final kj0 f33430b;

    public ej0(kj0 kj0Var, int i10) {
        this.f33429a = i10;
        this.f33430b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33429a) {
            case 0:
                this.f33430b.dismiss();
                return;
            case 1:
                this.f33430b.U(true, false);
                return;
            default:
                this.f33430b.U(true, false);
                return;
        }
    }
}
