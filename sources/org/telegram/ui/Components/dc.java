package org.telegram.ui.Components;
public final class dc implements Runnable {
    public final int f32860a;
    public final kb f32861b;

    public dc(kb kbVar, int i7) {
        this.f32860a = i7;
        this.f32861b = kbVar;
    }

    @Override
    public final void run() {
        switch (this.f32860a) {
            case 0:
                this.f32861b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32861b.performHapticFeedback(3, 2);
                return;
        }
    }
}
