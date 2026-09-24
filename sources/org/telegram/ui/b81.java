package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f32337a;
    public final SessionsActivity f32338b;
    public final boolean f32339c;

    public b81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f32337a = i10;
        this.f32338b = sessionsActivity;
        this.f32339c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32337a) {
            case 0:
                this.f32338b.k0(this.f32339c);
                return;
            default:
                this.f32338b.k0(this.f32339c);
                return;
        }
    }
}
