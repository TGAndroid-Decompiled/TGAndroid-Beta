package org.telegram.ui.Components;
public final class na implements Runnable {
    public final int f37507a;
    public final cb f37508b;

    public na(cb cbVar, int i7) {
        this.f37507a = i7;
        this.f37508b = cbVar;
    }

    @Override
    public final void run() {
        switch (this.f37507a) {
            case 0:
                this.f37508b.onExitTransitionStart();
                return;
            default:
                this.f37508b.onEnterTransitionStart();
                return;
        }
    }
}
