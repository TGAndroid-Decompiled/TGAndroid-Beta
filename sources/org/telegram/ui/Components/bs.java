package org.telegram.ui.Components;
public final class bs implements Runnable {
    public final int f23101a;
    public final hs f23102b;

    public bs(hs hsVar, int i10) {
        this.f23101a = i10;
        this.f23102b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f23101a) {
            case 0:
                this.f23102b.W(false);
                return;
            default:
                hs.Q(this.f23102b);
                return;
        }
    }
}
