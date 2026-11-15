package org.telegram.ui;
public final class b6 implements Runnable {
    public final int f45597a;
    public final org.telegram.messenger.z10 f45598b;
    public final long f45599c;

    public b6(int i7, long j3, org.telegram.messenger.z10 z10Var) {
        this.f45597a = i7;
        this.f45598b = z10Var;
        this.f45599c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45597a) {
            case 0:
                this.f45598b.a(Long.valueOf(this.f45599c));
                return;
            default:
                this.f45598b.a(Long.valueOf(this.f45599c));
                return;
        }
    }
}
