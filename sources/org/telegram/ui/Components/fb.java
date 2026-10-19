package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26193a;
    public final ub f26194b;

    public fb(ub ubVar, int i10) {
        this.f26193a = i10;
        this.f26194b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26193a) {
            case 0:
                this.f26194b.onExitTransitionStart();
                return;
            default:
                this.f26194b.onEnterTransitionStart();
                return;
        }
    }
}
