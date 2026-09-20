package org.telegram.ui;
public final class nj0 implements Runnable {
    public final int f36044a;
    public final uj0 f36045b;

    public nj0(uj0 uj0Var, int i10) {
        this.f36044a = i10;
        this.f36045b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36044a) {
            case 0:
                this.f36045b.dismiss();
                return;
            case 1:
                this.f36045b.U(true, false);
                return;
            default:
                this.f36045b.U(true, false);
                return;
        }
    }
}
