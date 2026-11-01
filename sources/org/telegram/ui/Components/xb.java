package org.telegram.ui.Components;
public final class xb implements Runnable {
    public final int f32534a;
    public final eb f32535b;

    public xb(eb ebVar, int i10) {
        this.f32534a = i10;
        this.f32535b = ebVar;
    }

    @Override
    public final void run() {
        switch (this.f32534a) {
            case 0:
                this.f32535b.performHapticFeedback(3, 2);
                return;
            default:
                this.f32535b.performHapticFeedback(3, 2);
                return;
        }
    }
}
