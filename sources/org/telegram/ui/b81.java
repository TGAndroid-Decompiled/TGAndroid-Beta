package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f32351a;
    public final SessionsActivity f32352b;
    public final boolean f32353c;

    public b81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f32351a = i10;
        this.f32352b = sessionsActivity;
        this.f32353c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32351a) {
            case 0:
                this.f32352b.k0(this.f32353c);
                return;
            default:
                this.f32352b.k0(this.f32353c);
                return;
        }
    }
}
