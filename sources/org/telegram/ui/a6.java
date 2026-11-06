package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f43574a;
    public final org.telegram.messenger.c20 f43575b;
    public final long f43576c;

    public a6(int i7, long j3, org.telegram.messenger.c20 c20Var) {
        this.f43574a = i7;
        this.f43575b = c20Var;
        this.f43576c = j3;
    }

    @Override
    public final void run() {
        switch (this.f43574a) {
            case 0:
                this.f43575b.a(Long.valueOf(this.f43576c));
                return;
            default:
                this.f43575b.a(Long.valueOf(this.f43576c));
                return;
        }
    }
}
