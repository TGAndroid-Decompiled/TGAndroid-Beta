package org.telegram.ui;
public final class a81 implements Runnable {
    public final int f31704a;
    public final SessionsActivity f31705b;
    public final boolean f31706c;

    public a81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f31704a = i10;
        this.f31705b = sessionsActivity;
        this.f31706c = z10;
    }

    @Override
    public final void run() {
        switch (this.f31704a) {
            case 0:
                this.f31705b.k0(this.f31706c);
                return;
            default:
                this.f31705b.k0(this.f31706c);
                return;
        }
    }
}
