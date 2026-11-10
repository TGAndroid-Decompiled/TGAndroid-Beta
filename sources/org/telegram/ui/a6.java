package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f43578a;
    public final org.telegram.messenger.c20 f43579b;
    public final long f43580c;

    public a6(int i7, long j3, org.telegram.messenger.c20 c20Var) {
        this.f43578a = i7;
        this.f43579b = c20Var;
        this.f43580c = j3;
    }

    @Override
    public final void run() {
        switch (this.f43578a) {
            case 0:
                this.f43579b.a(Long.valueOf(this.f43580c));
                return;
            default:
                this.f43579b.a(Long.valueOf(this.f43580c));
                return;
        }
    }
}
