package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f32349a;
    public final SessionsActivity f32350b;
    public final boolean f32351c;

    public b81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f32349a = i10;
        this.f32350b = sessionsActivity;
        this.f32351c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32349a) {
            case 0:
                this.f32350b.k0(this.f32351c);
                return;
            default:
                this.f32350b.k0(this.f32351c);
                return;
        }
    }
}
