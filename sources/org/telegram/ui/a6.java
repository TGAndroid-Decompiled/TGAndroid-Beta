package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f45504a;
    public final org.telegram.messenger.x10 f45505b;
    public final long f45506c;

    public a6(int i7, long j3, org.telegram.messenger.x10 x10Var) {
        this.f45504a = i7;
        this.f45505b = x10Var;
        this.f45506c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45504a) {
            case 0:
                this.f45505b.a(Long.valueOf(this.f45506c));
                return;
            default:
                this.f45505b.a(Long.valueOf(this.f45506c));
                return;
        }
    }
}
