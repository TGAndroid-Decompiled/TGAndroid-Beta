package org.telegram.ui.Components;
public final class cs implements Runnable {
    public final int f25447a;
    public final is f25448b;

    public cs(is isVar, int i10) {
        this.f25447a = i10;
        this.f25448b = isVar;
    }

    @Override
    public final void run() {
        switch (this.f25447a) {
            case 0:
                this.f25448b.U(false);
                return;
            default:
                is.O(this.f25448b);
                return;
        }
    }
}
