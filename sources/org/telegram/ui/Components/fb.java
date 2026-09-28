package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24207a;
    public final ub f24208b;

    public fb(ub ubVar, int i10) {
        this.f24207a = i10;
        this.f24208b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24207a) {
            case 0:
                this.f24208b.onExitTransitionStart();
                return;
            default:
                this.f24208b.onEnterTransitionStart();
                return;
        }
    }
}
