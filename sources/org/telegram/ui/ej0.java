package org.telegram.ui;
public final class ej0 implements Runnable {
    public final int f33512a;
    public final kj0 f33513b;

    public ej0(kj0 kj0Var, int i10) {
        this.f33512a = i10;
        this.f33513b = kj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33512a) {
            case 0:
                this.f33513b.dismiss();
                return;
            case 1:
                this.f33513b.U(true, false);
                return;
            default:
                this.f33513b.U(true, false);
                return;
        }
    }
}
