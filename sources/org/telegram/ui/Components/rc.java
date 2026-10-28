package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f32226a;
    public final yb f32227b;

    public rc(yb ybVar, int i10) {
        this.f32226a = i10;
        this.f32227b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f32226a) {
            case 0:
                this.f32227b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32227b.performHapticFeedback(3, 2);
                return;
        }
    }
}
