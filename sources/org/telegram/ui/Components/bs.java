package org.telegram.ui.Components;
public final class bs implements Runnable {
    public final int f23102a;
    public final hs f23103b;

    public bs(hs hsVar, int i10) {
        this.f23102a = i10;
        this.f23103b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f23102a) {
            case 0:
                this.f23103b.W(false);
                return;
            default:
                hs.Q(this.f23103b);
                return;
        }
    }
}
