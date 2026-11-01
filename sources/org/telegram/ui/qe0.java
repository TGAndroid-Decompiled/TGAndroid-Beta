package org.telegram.ui;
public final class qe0 implements Runnable {
    public final int f40760a;
    public final s3 f40761b;

    public qe0(s3 s3Var, int i10) {
        this.f40760a = i10;
        this.f40761b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f40760a) {
            case 0:
                org.telegram.messenger.i0.g3(new qe0(this.f40761b, 1));
                return;
            default:
                this.f40761b.a("CANCELLED");
                return;
        }
    }
}
