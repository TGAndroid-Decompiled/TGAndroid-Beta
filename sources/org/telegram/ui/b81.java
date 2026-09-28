package org.telegram.ui;
public final class b81 implements Runnable {
    public final int f32350a;
    public final SessionsActivity f32351b;
    public final boolean f32352c;

    public b81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f32350a = i10;
        this.f32351b = sessionsActivity;
        this.f32352c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32350a) {
            case 0:
                this.f32351b.k0(this.f32352c);
                return;
            default:
                this.f32351b.k0(this.f32352c);
                return;
        }
    }
}
