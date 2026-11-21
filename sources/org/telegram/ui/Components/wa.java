package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f41741a;
    public final lb f41742b;

    public wa(lb lbVar, int i7) {
        this.f41741a = i7;
        this.f41742b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f41741a) {
            case 0:
                this.f41742b.onExitTransitionStart();
                return;
            default:
                this.f41742b.onEnterTransitionStart();
                return;
        }
    }
}
