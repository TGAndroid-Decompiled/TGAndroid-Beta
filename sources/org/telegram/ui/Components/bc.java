package org.telegram.ui.Components;
public final class bc implements Runnable {
    public final int f32156a;
    public final ib f32157b;

    public bc(ib ibVar, int i3) {
        this.f32156a = i3;
        this.f32157b = ibVar;
    }

    @Override
    public final void run() {
        switch (this.f32156a) {
            case 0:
                this.f32157b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32157b.performHapticFeedback(3, 2);
                return;
        }
    }
}
