package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f45474a;
    public final org.telegram.messenger.y10 f45475b;
    public final long f45476c;

    public a6(int i7, long j3, org.telegram.messenger.y10 y10Var) {
        this.f45474a = i7;
        this.f45475b = y10Var;
        this.f45476c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45474a) {
            case 0:
                this.f45475b.a(Long.valueOf(this.f45476c));
                return;
            default:
                this.f45475b.a(Long.valueOf(this.f45476c));
                return;
        }
    }
}
