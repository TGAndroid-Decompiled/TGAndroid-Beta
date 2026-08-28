package org.telegram.ui;
public final class c71 implements Runnable {
    public final int f37086a;
    public final SessionsActivity f37087b;
    public final boolean f37088c;

    public c71(SessionsActivity sessionsActivity, boolean z10, int i9) {
        this.f37086a = i9;
        this.f37087b = sessionsActivity;
        this.f37088c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37086a) {
            case 0:
                this.f37087b.j0(this.f37088c);
                return;
            default:
                this.f37087b.j0(this.f37088c);
                return;
        }
    }
}
