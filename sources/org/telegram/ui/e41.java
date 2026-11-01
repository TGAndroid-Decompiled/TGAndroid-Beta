package org.telegram.ui;
public final class e41 implements Runnable {
    public final int f36727a;
    public final SessionsActivity f36728b;
    public final boolean f36729c;

    public e41(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f36727a = i10;
        this.f36728b = sessionsActivity;
        this.f36729c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36727a) {
            case 0:
                this.f36728b.p0(this.f36729c);
                return;
            default:
                this.f36728b.p0(this.f36729c);
                return;
        }
    }
}
