package org.telegram.ui;
public final class l81 implements Runnable {
    public final int f39517a;
    public final SessionsActivity f39518b;
    public final boolean f39519c;

    public l81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f39517a = i10;
        this.f39518b = sessionsActivity;
        this.f39519c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39517a) {
            case 0:
                this.f39518b.k0(this.f39519c);
                return;
            default:
                this.f39518b.k0(this.f39519c);
                return;
        }
    }
}
