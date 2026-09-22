package org.telegram.ui;
public final class i81 implements Runnable {
    public final int f34542a;
    public final SessionsActivity f34543b;
    public final boolean f34544c;

    public i81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f34542a = i10;
        this.f34543b = sessionsActivity;
        this.f34544c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34542a) {
            case 0:
                this.f34543b.k0(this.f34544c);
                return;
            default:
                this.f34543b.k0(this.f34544c);
                return;
        }
    }
}
