package org.telegram.ui.Components;
public final class cs implements Runnable {
    public final int f25441a;
    public final is f25442b;

    public cs(is isVar, int i10) {
        this.f25441a = i10;
        this.f25442b = isVar;
    }

    @Override
    public final void run() {
        switch (this.f25441a) {
            case 0:
                this.f25442b.U(false);
                return;
            default:
                is.O(this.f25442b);
                return;
        }
    }
}
