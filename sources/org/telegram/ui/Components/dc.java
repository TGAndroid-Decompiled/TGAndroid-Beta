package org.telegram.ui.Components;
public final class dc implements Runnable {
    public final int f32823a;
    public final kb f32824b;

    public dc(kb kbVar, int i7) {
        this.f32823a = i7;
        this.f32824b = kbVar;
    }

    @Override
    public final void run() {
        switch (this.f32823a) {
            case 0:
                this.f32824b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32824b.performHapticFeedback(3, 2);
                return;
        }
    }
}
