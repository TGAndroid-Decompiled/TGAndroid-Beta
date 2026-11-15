package org.telegram.ui;
public final class b6 implements Runnable {
    public final int f45591a;
    public final org.telegram.messenger.z10 f45592b;
    public final long f45593c;

    public b6(int i7, long j3, org.telegram.messenger.z10 z10Var) {
        this.f45591a = i7;
        this.f45592b = z10Var;
        this.f45593c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45591a) {
            case 0:
                this.f45592b.a(Long.valueOf(this.f45593c));
                return;
            default:
                this.f45592b.a(Long.valueOf(this.f45593c));
                return;
        }
    }
}
