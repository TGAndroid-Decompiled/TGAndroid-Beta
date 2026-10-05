package org.telegram.ui.Components;
public final class cs implements Runnable {
    public final int f25514a;
    public final is f25515b;

    public cs(is isVar, int i10) {
        this.f25514a = i10;
        this.f25515b = isVar;
    }

    @Override
    public final void run() {
        switch (this.f25514a) {
            case 0:
                this.f25515b.U(false);
                return;
            default:
                is.O(this.f25515b);
                return;
        }
    }
}
