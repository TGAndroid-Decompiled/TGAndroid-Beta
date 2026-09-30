package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f32425a;
    public final SessionsActivity f32426b;
    public final boolean f32427c;

    public b81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f32425a = i10;
        this.f32426b = sessionsActivity;
        this.f32427c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32425a) {
            case 0:
                this.f32426b.k0(this.f32427c);
                return;
            default:
                this.f32426b.k0(this.f32427c);
                return;
        }
    }
}
