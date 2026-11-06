package org.telegram.ui.Components;
public final class dc implements Runnable {
    public final int f32852a;
    public final kb f32853b;

    public dc(kb kbVar, int i7) {
        this.f32852a = i7;
        this.f32853b = kbVar;
    }

    @Override
    public final void run() {
        switch (this.f32852a) {
            case 0:
                this.f32853b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32853b.performHapticFeedback(3, 2);
                return;
        }
    }
}
