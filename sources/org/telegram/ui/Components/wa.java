package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f41708a;
    public final lb f41709b;

    public wa(lb lbVar, int i7) {
        this.f41708a = i7;
        this.f41709b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f41708a) {
            case 0:
                this.f41709b.onExitTransitionStart();
                return;
            default:
                this.f41709b.onEnterTransitionStart();
                return;
        }
    }
}
