package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f41735a;
    public final lb f41736b;

    public wa(lb lbVar, int i7) {
        this.f41735a = i7;
        this.f41736b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f41735a) {
            case 0:
                this.f41736b.onExitTransitionStart();
                return;
            default:
                this.f41736b.onEnterTransitionStart();
                return;
        }
    }
}
