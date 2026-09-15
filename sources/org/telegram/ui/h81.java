package org.telegram.ui;
public final class h81 implements Runnable {
    public final int f34212a;
    public final SessionsActivity f34213b;
    public final boolean f34214c;

    public h81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f34212a = i10;
        this.f34213b = sessionsActivity;
        this.f34214c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34212a) {
            case 0:
                this.f34213b.k0(this.f34214c);
                return;
            default:
                this.f34213b.k0(this.f34214c);
                return;
        }
    }
}
