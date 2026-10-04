package org.telegram.ui.Components;
public final class cs implements Runnable {
    public final int f25442a;
    public final is f25443b;

    public cs(is isVar, int i10) {
        this.f25442a = i10;
        this.f25443b = isVar;
    }

    @Override
    public final void run() {
        switch (this.f25442a) {
            case 0:
                this.f25443b.U(false);
                return;
            default:
                is.O(this.f25443b);
                return;
        }
    }
}
