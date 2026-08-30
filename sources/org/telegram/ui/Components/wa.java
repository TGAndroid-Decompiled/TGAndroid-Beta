package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f30281a;
    public final nb f30282b;

    public wa(nb nbVar, int i10) {
        this.f30281a = i10;
        this.f30282b = nbVar;
    }

    @Override
    public final void run() {
        switch (this.f30281a) {
            case 0:
                this.f30282b.onExitTransitionStart();
                return;
            default:
                this.f30282b.onEnterTransitionStart();
                return;
        }
    }
}
