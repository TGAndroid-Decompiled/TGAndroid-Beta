package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26188a;
    public final ub f26189b;

    public fb(ub ubVar, int i10) {
        this.f26188a = i10;
        this.f26189b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26188a) {
            case 0:
                this.f26189b.onExitTransitionStart();
                return;
            default:
                this.f26189b.onEnterTransitionStart();
                return;
        }
    }
}
