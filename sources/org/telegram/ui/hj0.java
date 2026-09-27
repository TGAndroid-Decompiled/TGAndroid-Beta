package org.telegram.ui;
public final class hj0 implements Runnable {
    public final int f34241a;
    public final nj0 f34242b;

    public hj0(nj0 nj0Var, int i10) {
        this.f34241a = i10;
        this.f34242b = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f34241a) {
            case 0:
                this.f34242b.dismiss();
                return;
            case 1:
                this.f34242b.U(true, false);
                return;
            default:
                this.f34242b.U(true, false);
                return;
        }
    }
}
