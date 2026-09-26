package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24125a;
    public final ub f24126b;

    public fb(ub ubVar, int i10) {
        this.f24125a = i10;
        this.f24126b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24125a) {
            case 0:
                this.f24126b.onExitTransitionStart();
                return;
            default:
                this.f24126b.onEnterTransitionStart();
                return;
        }
    }
}
