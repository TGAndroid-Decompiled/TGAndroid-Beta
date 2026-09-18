package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24114a;
    public final ub f24115b;

    public fb(ub ubVar, int i10) {
        this.f24114a = i10;
        this.f24115b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24114a) {
            case 0:
                this.f24115b.onExitTransitionStart();
                return;
            default:
                this.f24115b.onEnterTransitionStart();
                return;
        }
    }
}
