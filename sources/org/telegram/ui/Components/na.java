package org.telegram.ui.Components;
public final class na implements Runnable {
    public final int f37518a;
    public final cb f37519b;

    public na(cb cbVar, int i7) {
        this.f37518a = i7;
        this.f37519b = cbVar;
    }

    @Override
    public final void run() {
        switch (this.f37518a) {
            case 0:
                this.f37519b.onExitTransitionStart();
                return;
            default:
                this.f37519b.onEnterTransitionStart();
                return;
        }
    }
}
