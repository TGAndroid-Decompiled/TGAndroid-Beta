package org.telegram.ui.Components;
public final class dc implements Runnable {
    public final int f32810a;
    public final kb f32811b;

    public dc(kb kbVar, int i7) {
        this.f32810a = i7;
        this.f32811b = kbVar;
    }

    @Override
    public final void run() {
        switch (this.f32810a) {
            case 0:
                this.f32811b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32811b.performHapticFeedback(3, 2);
                return;
        }
    }
}
