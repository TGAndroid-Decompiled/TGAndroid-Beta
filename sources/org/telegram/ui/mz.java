package org.telegram.ui;
public final class mz implements Runnable {
    public final int f39793a;
    public final i00 f39794b;

    public mz(i00 i00Var, int i10) {
        this.f39793a = i10;
        this.f39794b = i00Var;
    }

    @Override
    public final void run() {
        switch (this.f39793a) {
            case 0:
                i00.Z(this.f39794b);
                return;
            default:
                i00.a0(this.f39794b);
                return;
        }
    }
}
