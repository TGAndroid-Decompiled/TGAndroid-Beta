package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f35568a;
    public final org.telegram.messenger.q20 f35569b;
    public final long f35570c;

    public a6(int i10, long j10, org.telegram.messenger.q20 q20Var) {
        this.f35568a = i10;
        this.f35569b = q20Var;
        this.f35570c = j10;
    }

    @Override
    public final void run() {
        switch (this.f35568a) {
            case 0:
                this.f35569b.a(Long.valueOf(this.f35570c));
                return;
            default:
                this.f35569b.a(Long.valueOf(this.f35570c));
                return;
        }
    }
}
