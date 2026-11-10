package org.telegram.ui.Components;
public final class cc implements Runnable {
    public final int f32535a;
    public final jb f32536b;

    public cc(jb jbVar, int i7) {
        this.f32535a = i7;
        this.f32536b = jbVar;
    }

    @Override
    public final void run() {
        switch (this.f32535a) {
            case 0:
                this.f32536b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32536b.performHapticFeedback(3, 2);
                return;
        }
    }
}
