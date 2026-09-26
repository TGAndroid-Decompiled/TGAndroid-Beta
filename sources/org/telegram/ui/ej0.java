package org.telegram.ui;
public final class ej0 implements Runnable {
    public final int f33428a;
    public final kj0 f33429b;

    public ej0(kj0 kj0Var, int i10) {
        this.f33428a = i10;
        this.f33429b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33428a) {
            case 0:
                this.f33429b.dismiss();
                return;
            case 1:
                this.f33429b.U(true, false);
                return;
            default:
                this.f33429b.U(true, false);
                return;
        }
    }
}
