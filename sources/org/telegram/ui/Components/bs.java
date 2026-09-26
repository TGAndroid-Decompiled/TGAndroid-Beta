package org.telegram.ui.Components;
public final class bs implements Runnable {
    public final int f23094a;
    public final hs f23095b;

    public bs(hs hsVar, int i10) {
        this.f23094a = i10;
        this.f23095b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f23094a) {
            case 0:
                this.f23095b.W(false);
                return;
            default:
                hs.Q(this.f23095b);
                return;
        }
    }
}
