package org.telegram.ui;
public final class q21 implements Runnable {
    public final int f50971a;
    public final SessionsActivity f50972b;
    public final boolean f50973c;

    public q21(SessionsActivity sessionsActivity, boolean z10, int i7) {
        this.f50971a = i7;
        this.f50972b = sessionsActivity;
        this.f50973c = z10;
    }

    @Override
    public final void run() {
        switch (this.f50971a) {
            case 0:
                this.f50972b.p0(this.f50973c);
                return;
            default:
                this.f50972b.p0(this.f50973c);
                return;
        }
    }
}
