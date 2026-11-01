package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f35690a;
    public final org.telegram.messenger.r20 f35691b;
    public final long f35692c;

    public a6(int i10, long j10, org.telegram.messenger.r20 r20Var) {
        this.f35690a = i10;
        this.f35691b = r20Var;
        this.f35692c = j10;
    }

    @Override
    public final void run() {
        switch (this.f35690a) {
            case 0:
                this.f35691b.a(Long.valueOf(this.f35692c));
                return;
            default:
                this.f35691b.a(Long.valueOf(this.f35692c));
                return;
        }
    }
}
