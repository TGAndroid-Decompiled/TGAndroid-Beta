package org.telegram.ui.Components;
public final class dt implements Runnable {
    public final int f25871a;
    public final jt f25872b;

    public dt(jt jtVar, int i10) {
        this.f25871a = i10;
        this.f25872b = jtVar;
    }

    @Override
    public final void run() {
        switch (this.f25871a) {
            case 0:
                this.f25872b.W(false);
                return;
            default:
                this.f25872b.N(true);
                return;
        }
    }
}
