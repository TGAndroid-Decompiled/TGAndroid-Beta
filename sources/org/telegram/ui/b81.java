package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f32353a;
    public final SessionsActivity f32354b;
    public final boolean f32355c;

    public b81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f32353a = i10;
        this.f32354b = sessionsActivity;
        this.f32355c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32353a) {
            case 0:
                this.f32354b.k0(this.f32355c);
                return;
            default:
                this.f32354b.k0(this.f32355c);
                return;
        }
    }
}
