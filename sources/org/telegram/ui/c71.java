package org.telegram.ui;
public final class c71 implements Runnable {
    public final int f36276a;
    public final SessionsActivity f36277b;
    public final boolean f36278c;

    public c71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f36276a = i10;
        this.f36277b = sessionsActivity;
        this.f36278c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36276a) {
            case 0:
                this.f36277b.k0(this.f36278c);
                return;
            default:
                this.f36277b.k0(this.f36278c);
                return;
        }
    }
}
