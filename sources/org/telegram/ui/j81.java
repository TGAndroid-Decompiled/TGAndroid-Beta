package org.telegram.ui;
public final class j81 implements Runnable {
    public final int f34821a;
    public final SessionsActivity f34822b;
    public final boolean f34823c;

    public j81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f34821a = i10;
        this.f34822b = sessionsActivity;
        this.f34823c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34821a) {
            case 0:
                this.f34822b.k0(this.f34823c);
                return;
            default:
                this.f34822b.k0(this.f34823c);
                return;
        }
    }
}
