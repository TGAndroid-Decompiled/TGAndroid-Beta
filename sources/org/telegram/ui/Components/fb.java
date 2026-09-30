package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24196a;
    public final ub f24197b;

    public fb(ub ubVar, int i10) {
        this.f24196a = i10;
        this.f24197b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24196a) {
            case 0:
                this.f24197b.onExitTransitionStart();
                return;
            default:
                this.f24197b.onEnterTransitionStart();
                return;
        }
    }
}
