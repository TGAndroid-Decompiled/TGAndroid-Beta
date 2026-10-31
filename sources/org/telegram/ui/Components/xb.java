package org.telegram.ui.Components;
public final class xb implements Runnable {
    public final int f32455a;
    public final eb f32456b;

    public xb(eb ebVar, int i10) {
        this.f32455a = i10;
        this.f32456b = ebVar;
    }

    @Override
    public final void run() {
        switch (this.f32455a) {
            case 0:
                this.f32456b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32456b.performHapticFeedback(3, 2);
                return;
        }
    }
}
