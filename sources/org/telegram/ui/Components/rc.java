package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f32210a;
    public final yb f32211b;

    public rc(yb ybVar, int i10) {
        this.f32210a = i10;
        this.f32211b = ybVar;
    }

    @Override
    public final void run() {
        switch (this.f32210a) {
            case 0:
                this.f32211b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32211b.performHapticFeedback(3, 2);
                return;
        }
    }
}
