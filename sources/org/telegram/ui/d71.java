package org.telegram.ui;
public final class d71 implements Runnable {
    public final int f38744a;
    public final SessionsActivity f38745b;
    public final boolean f38746c;

    public d71(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f38744a = i10;
        this.f38745b = sessionsActivity;
        this.f38746c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38744a) {
            case 0:
                this.f38745b.l0(this.f38746c);
                return;
            default:
                this.f38745b.l0(this.f38746c);
                return;
        }
    }
}
