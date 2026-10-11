package org.telegram.ui;
public final class lj0 implements Runnable {
    public final int f39688a;
    public final rj0 f39689b;

    public lj0(rj0 rj0Var, int i10) {
        this.f39688a = i10;
        this.f39689b = rj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39688a) {
            case 0:
                this.f39689b.dismiss();
                return;
            case 1:
                this.f39689b.V(true, false);
                return;
            default:
                this.f39689b.V(true, false);
                return;
        }
    }
}
