package org.telegram.ui;
public final class g41 implements Runnable {
    public final int f37420a;
    public final SessionsActivity f37421b;
    public final boolean f37422c;

    public g41(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f37420a = i10;
        this.f37421b = sessionsActivity;
        this.f37422c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37420a) {
            case 0:
                this.f37421b.o0(this.f37422c);
                return;
            default:
                this.f37421b.o0(this.f37422c);
                return;
        }
    }
}
