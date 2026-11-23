package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f41734a;
    public final lb f41735b;

    public wa(lb lbVar, int i7) {
        this.f41734a = i7;
        this.f41735b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f41734a) {
            case 0:
                this.f41735b.onExitTransitionStart();
                return;
            default:
                this.f41735b.onEnterTransitionStart();
                return;
        }
    }
}
