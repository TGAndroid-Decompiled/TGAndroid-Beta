package org.telegram.ui;
public final class kj0 implements Runnable {
    public final int f35176a;
    public final rj0 f35177b;

    public kj0(rj0 rj0Var, int i10) {
        this.f35176a = i10;
        this.f35177b = rj0Var;
    }

    @Override
    public final void run() {
        switch (this.f35176a) {
            case 0:
                this.f35177b.dismiss();
                return;
            case 1:
                this.f35177b.U(true, false);
                return;
            default:
                this.f35177b.U(true, false);
                return;
        }
    }
}
