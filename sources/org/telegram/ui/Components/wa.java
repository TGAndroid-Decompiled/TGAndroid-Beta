package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f41648a;
    public final lb f41649b;

    public wa(lb lbVar, int i7) {
        this.f41648a = i7;
        this.f41649b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f41648a) {
            case 0:
                this.f41649b.onExitTransitionStart();
                return;
            default:
                this.f41649b.onEnterTransitionStart();
                return;
        }
    }
}
