package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26192a;
    public final ub f26193b;

    public fb(ub ubVar, int i10) {
        this.f26192a = i10;
        this.f26193b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26192a) {
            case 0:
                this.f26193b.onExitTransitionStart();
                return;
            default:
                this.f26193b.onEnterTransitionStart();
                return;
        }
    }
}
