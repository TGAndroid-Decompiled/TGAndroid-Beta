package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26213a;
    public final ub f26214b;

    public fb(ub ubVar, int i10) {
        this.f26213a = i10;
        this.f26214b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26213a) {
            case 0:
                this.f26214b.onExitTransitionStart();
                return;
            default:
                this.f26214b.onEnterTransitionStart();
                return;
        }
    }
}
