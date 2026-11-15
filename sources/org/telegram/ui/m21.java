package org.telegram.ui;
public final class m21 implements Runnable {
    public final int f49093a;
    public final SessionsActivity f49094b;
    public final boolean f49095c;

    public m21(SessionsActivity sessionsActivity, boolean z10, int i7) {
        this.f49093a = i7;
        this.f49094b = sessionsActivity;
        this.f49095c = z10;
    }

    @Override
    public final void run() {
        switch (this.f49093a) {
            case 0:
                this.f49094b.p0(this.f49095c);
                return;
            default:
                this.f49094b.p0(this.f49095c);
                return;
        }
    }
}
