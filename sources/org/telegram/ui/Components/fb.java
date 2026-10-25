package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f28136a;
    public final ub f28137b;

    public fb(ub ubVar, int i10) {
        this.f28136a = i10;
        this.f28137b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f28136a) {
            case 0:
                this.f28137b.onExitTransitionStart();
                return;
            default:
                this.f28137b.onEnterTransitionStart();
                return;
        }
    }
}
