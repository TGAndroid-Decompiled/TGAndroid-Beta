package org.telegram.ui;
public final class a6 implements Runnable {
    public final int f43573a;
    public final org.telegram.messenger.c20 f43574b;
    public final long f43575c;

    public a6(int i7, long j3, org.telegram.messenger.c20 c20Var) {
        this.f43573a = i7;
        this.f43574b = c20Var;
        this.f43575c = j3;
    }

    @Override
    public final void run() {
        switch (this.f43573a) {
            case 0:
                this.f43574b.a(Long.valueOf(this.f43575c));
                return;
            default:
                this.f43574b.a(Long.valueOf(this.f43575c));
                return;
        }
    }
}
