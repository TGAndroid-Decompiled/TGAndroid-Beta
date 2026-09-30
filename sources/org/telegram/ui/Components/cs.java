package org.telegram.ui.Components;
public final class cs implements Runnable {
    public final int f23415a;
    public final is f23416b;

    public cs(is isVar, int i10) {
        this.f23415a = i10;
        this.f23416b = isVar;
    }

    @Override
    public final void run() {
        switch (this.f23415a) {
            case 0:
                this.f23416b.W(false);
                return;
            default:
                is.Q(this.f23416b);
                return;
        }
    }
}
