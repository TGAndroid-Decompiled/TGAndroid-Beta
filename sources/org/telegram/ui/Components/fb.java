package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f28138a;
    public final ub f28139b;

    public fb(ub ubVar, int i10) {
        this.f28138a = i10;
        this.f28139b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f28138a) {
            case 0:
                this.f28139b.onExitTransitionStart();
                return;
            default:
                this.f28139b.onEnterTransitionStart();
                return;
        }
    }
}
