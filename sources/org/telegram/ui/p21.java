package org.telegram.ui;
public final class p21 implements Runnable {
    public final int f50808a;
    public final SessionsActivity f50809b;
    public final boolean f50810c;

    public p21(SessionsActivity sessionsActivity, boolean z10, int i7) {
        this.f50808a = i7;
        this.f50809b = sessionsActivity;
        this.f50810c = z10;
    }

    @Override
    public final void run() {
        switch (this.f50808a) {
            case 0:
                this.f50809b.p0(this.f50810c);
                return;
            default:
                this.f50809b.p0(this.f50810c);
                return;
        }
    }
}
