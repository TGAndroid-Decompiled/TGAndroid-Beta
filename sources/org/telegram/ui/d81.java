package org.telegram.ui;
public final class d81 implements Runnable {
    public final int f35702a;
    public final SessionsActivity f35703b;
    public final boolean f35704c;

    public d81(SessionsActivity sessionsActivity, boolean z10, int i10) {
        this.f35702a = i10;
        this.f35703b = sessionsActivity;
        this.f35704c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35702a) {
            case 0:
                this.f35703b.k0(this.f35704c);
                return;
            default:
                this.f35703b.k0(this.f35704c);
                return;
        }
    }
}
