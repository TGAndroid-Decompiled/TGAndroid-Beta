package org.telegram.ui;
public final class lj0 implements Runnable {
    public final int f39722a;
    public final rj0 f39723b;

    public lj0(rj0 rj0Var, int i10) {
        this.f39722a = i10;
        this.f39723b = rj0Var;
    }

    @Override
    public final void run() {
        switch (this.f39722a) {
            case 0:
                this.f39723b.dismiss();
                return;
            case 1:
                this.f39723b.V(true, false);
                return;
            default:
                this.f39723b.V(true, false);
                return;
        }
    }
}
