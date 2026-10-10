package org.telegram.ui.Components;
public final class dt implements Runnable {
    public final int f25793a;
    public final jt f25794b;

    public dt(jt jtVar, int i10) {
        this.f25793a = i10;
        this.f25794b = jtVar;
    }

    @Override
    public final void run() {
        switch (this.f25793a) {
            case 0:
                this.f25794b.W(false);
                return;
            default:
                this.f25794b.N(true);
                return;
        }
    }
}
