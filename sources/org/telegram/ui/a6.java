package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f45508a;
    public final org.telegram.messenger.y10 f45509b;
    public final long f45510c;

    public a6(int i7, long j3, org.telegram.messenger.y10 y10Var) {
        this.f45508a = i7;
        this.f45509b = y10Var;
        this.f45510c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45508a) {
            case 0:
                this.f45509b.a(Long.valueOf(this.f45510c));
                return;
            default:
                this.f45509b.a(Long.valueOf(this.f45510c));
                return;
        }
    }
}
