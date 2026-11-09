package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f43590a;
    public final org.telegram.messenger.c20 f43591b;
    public final long f43592c;

    public a6(int i7, long j3, org.telegram.messenger.c20 c20Var) {
        this.f43590a = i7;
        this.f43591b = c20Var;
        this.f43592c = j3;
    }

    @Override
    public final void run() {
        switch (this.f43590a) {
            case 0:
                this.f43591b.a(Long.valueOf(this.f43592c));
                return;
            default:
                this.f43591b.a(Long.valueOf(this.f43592c));
                return;
        }
    }
}
