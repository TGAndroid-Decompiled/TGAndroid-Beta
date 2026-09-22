package org.telegram.ui;
public final class nj0 implements Runnable {
    public final int f36060a;
    public final uj0 f36061b;

    public nj0(uj0 uj0Var, int i10) {
        this.f36060a = i10;
        this.f36061b = uj0Var;
    }

    @Override
    public final void run() {
        switch (this.f36060a) {
            case 0:
                this.f36061b.dismiss();
                return;
            case 1:
                this.f36061b.U(true, false);
                return;
            default:
                this.f36061b.U(true, false);
                return;
        }
    }
}
