package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f27937a;
    public final yb f27938b;

    public rc(yb ybVar, int i10) {
        this.f27937a = i10;
        this.f27938b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f27937a) {
            case 0:
                this.f27938b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27938b.performHapticFeedback(3, 2);
                return;
        }
    }
}
