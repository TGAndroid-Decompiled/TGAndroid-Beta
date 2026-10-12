package org.telegram.ui;
public final class nj0 implements Runnable {
    public final int f40428a;
    public final tj0 f40429b;

    public nj0(tj0 tj0Var, int i10) {
        this.f40428a = i10;
        this.f40429b = tj0Var;
    }

    @Override
    public final void run() {
        switch (this.f40428a) {
            case 0:
                this.f40429b.dismiss();
                return;
            case 1:
                this.f40429b.V(true, false);
                return;
            default:
                this.f40429b.V(true, false);
                return;
        }
    }
}
