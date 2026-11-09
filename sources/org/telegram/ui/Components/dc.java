package org.telegram.ui.Components;
public final class dc implements Runnable {
    public final int f32931a;
    public final kb f32932b;

    public dc(kb kbVar, int i7) {
        this.f32931a = i7;
        this.f32932b = kbVar;
    }

    @Override
    public final void run() {
        switch (this.f32931a) {
            case 0:
                this.f32932b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32932b.performHapticFeedback(3, 2);
                return;
        }
    }
}
