package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24250a;
    public final ub f24251b;

    public fb(ub ubVar, int i10) {
        this.f24250a = i10;
        this.f24251b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24250a) {
            case 0:
                this.f24251b.onExitTransitionStart();
                return;
            default:
                this.f24251b.onEnterTransitionStart();
                return;
        }
    }
}
