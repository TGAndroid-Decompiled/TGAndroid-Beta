package org.telegram.ui.Components;
public final class bs implements Runnable {
    public final int f23119a;
    public final hs f23120b;

    public bs(hs hsVar, int i10) {
        this.f23119a = i10;
        this.f23120b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f23119a) {
            case 0:
                this.f23120b.W(false);
                return;
            default:
                hs.Q(this.f23120b);
                return;
        }
    }
}
