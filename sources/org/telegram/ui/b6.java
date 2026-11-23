package org.telegram.ui;
public final class b6 implements Runnable {
    public final int f45960a;
    public final org.telegram.messenger.w10 f45961b;
    public final long f45962c;

    public b6(int i7, long j3, org.telegram.messenger.w10 w10Var) {
        this.f45960a = i7;
        this.f45961b = w10Var;
        this.f45962c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45960a) {
            case 0:
                this.f45961b.a(Long.valueOf(this.f45962c));
                return;
            default:
                this.f45961b.a(Long.valueOf(this.f45962c));
                return;
        }
    }
}
