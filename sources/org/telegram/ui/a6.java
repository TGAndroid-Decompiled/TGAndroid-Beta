package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f45464a;
    public final org.telegram.messenger.x10 f45465b;
    public final long f45466c;

    public a6(int i7, long j3, org.telegram.messenger.x10 x10Var) {
        this.f45464a = i7;
        this.f45465b = x10Var;
        this.f45466c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45464a) {
            case 0:
                this.f45465b.a(Long.valueOf(this.f45466c));
                return;
            default:
                this.f45465b.a(Long.valueOf(this.f45466c));
                return;
        }
    }
}
