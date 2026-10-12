package org.telegram.ui;
public final class o81 implements Runnable {
    public final int f40574a;
    public final SessionsActivity f40575b;
    public final boolean f40576c;

    public o81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f40574a = i10;
        this.f40575b = sessionsActivity;
        this.f40576c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40574a) {
            case 0:
                this.f40575b.k0(this.f40576c);
                return;
            default:
                this.f40575b.k0(this.f40576c);
                return;
        }
    }
}
