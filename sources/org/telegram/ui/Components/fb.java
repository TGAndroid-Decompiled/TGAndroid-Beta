package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26206a;
    public final ub f26207b;

    public fb(ub ubVar, int i10) {
        this.f26206a = i10;
        this.f26207b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26206a) {
            case 0:
                this.f26207b.onExitTransitionStart();
                return;
            default:
                this.f26207b.onEnterTransitionStart();
                return;
        }
    }
}
