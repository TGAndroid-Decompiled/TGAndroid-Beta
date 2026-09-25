package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24126a;
    public final ub f24127b;

    public fb(ub ubVar, int i10) {
        this.f24126a = i10;
        this.f24127b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24126a) {
            case 0:
                this.f24127b.onExitTransitionStart();
                return;
            default:
                this.f24127b.onEnterTransitionStart();
                return;
        }
    }
}
