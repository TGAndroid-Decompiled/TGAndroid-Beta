package org.telegram.ui;
public final class h81 implements Runnable {
    public final int f34101a;
    public final SessionsActivity f34102b;
    public final boolean f34103c;

    public h81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f34101a = i10;
        this.f34102b = sessionsActivity;
        this.f34103c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34101a) {
            case 0:
                this.f34102b.k0(this.f34103c);
                return;
            default:
                this.f34102b.k0(this.f34103c);
                return;
        }
    }
}
