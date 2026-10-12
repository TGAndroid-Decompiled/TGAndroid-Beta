package org.telegram.ui;
public final class o81 implements Runnable {
    public final int f40577a;
    public final SessionsActivity f40578b;
    public final boolean f40579c;

    public o81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f40577a = i10;
        this.f40578b = sessionsActivity;
        this.f40579c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40577a) {
            case 0:
                this.f40578b.k0(this.f40579c);
                return;
            default:
                this.f40578b.k0(this.f40579c);
                return;
        }
    }
}
