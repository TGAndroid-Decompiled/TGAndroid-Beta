package org.telegram.ui.Components;
public final class dt implements Runnable {
    public final int f25671a;
    public final jt f25672b;

    public dt(jt jtVar, int i10) {
        this.f25671a = i10;
        this.f25672b = jtVar;
    }

    @Override
    public final void run() {
        switch (this.f25671a) {
            case 0:
                this.f25672b.W(false);
                return;
            default:
                this.f25672b.N(true);
                return;
        }
    }
}
