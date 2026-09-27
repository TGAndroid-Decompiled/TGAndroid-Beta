package org.telegram.ui;
public final class d81 implements Runnable {
    public final int f32892a;
    public final SessionsActivity f32893b;
    public final boolean f32894c;

    public d81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f32892a = i10;
        this.f32893b = sessionsActivity;
        this.f32894c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32892a) {
            case 0:
                this.f32893b.k0(this.f32894c);
                return;
            default:
                this.f32893b.k0(this.f32894c);
                return;
        }
    }
}
