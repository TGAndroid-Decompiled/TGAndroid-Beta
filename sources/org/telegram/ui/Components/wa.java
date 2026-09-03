package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f30190a;
    public final nb f30191b;

    public wa(nb nbVar, int i10) {
        this.f30190a = i10;
        this.f30191b = nbVar;
    }

    @Override
    public final void run() {
        switch (this.f30190a) {
            case 0:
                this.f30191b.onExitTransitionStart();
                return;
            default:
                this.f30191b.onEnterTransitionStart();
                return;
        }
    }
}
