package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f43549a;
    public final org.telegram.messenger.c20 f43550b;
    public final long f43551c;

    public a6(int i7, long j3, org.telegram.messenger.c20 c20Var) {
        this.f43549a = i7;
        this.f43550b = c20Var;
        this.f43551c = j3;
    }

    @Override
    public final void run() {
        switch (this.f43549a) {
            case 0:
                this.f43550b.a(Long.valueOf(this.f43551c));
                return;
            default:
                this.f43550b.a(Long.valueOf(this.f43551c));
                return;
        }
    }
}
