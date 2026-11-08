package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f43576a;
    public final org.telegram.messenger.c20 f43577b;
    public final long f43578c;

    public a6(int i7, long j3, org.telegram.messenger.c20 c20Var) {
        this.f43576a = i7;
        this.f43577b = c20Var;
        this.f43578c = j3;
    }

    @Override
    public final void run() {
        switch (this.f43576a) {
            case 0:
                this.f43577b.a(Long.valueOf(this.f43578c));
                return;
            default:
                this.f43577b.a(Long.valueOf(this.f43578c));
                return;
        }
    }
}
