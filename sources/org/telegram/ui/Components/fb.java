package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24206a;
    public final ub f24207b;

    public fb(ub ubVar, int i10) {
        this.f24206a = i10;
        this.f24207b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24206a) {
            case 0:
                this.f24207b.onExitTransitionStart();
                return;
            default:
                this.f24207b.onEnterTransitionStart();
                return;
        }
    }
}
