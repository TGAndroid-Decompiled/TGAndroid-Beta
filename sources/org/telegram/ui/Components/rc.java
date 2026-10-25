package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f32208a;
    public final yb f32209b;

    public rc(yb ybVar, int i10) {
        this.f32208a = i10;
        this.f32209b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f32208a) {
            case 0:
                this.f32209b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32209b.performHapticFeedback(3, 2);
                return;
        }
    }
}
