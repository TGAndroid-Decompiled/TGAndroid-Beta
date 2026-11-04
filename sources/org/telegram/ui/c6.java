package org.telegram.ui;
public final class c6 implements Runnable {
    public final int f44241a;
    public final org.telegram.messenger.u10 f44242b;
    public final long f44243c;

    public c6(int i3, long j10, org.telegram.messenger.u10 u10Var) {
        this.f44241a = i3;
        this.f44242b = u10Var;
        this.f44243c = j10;
    }

    @Override
    public final void run() {
        switch (this.f44241a) {
            case 0:
                this.f44242b.a(Long.valueOf(this.f44243c));
                return;
            default:
                this.f44242b.a(Long.valueOf(this.f44243c));
                return;
        }
    }
}
