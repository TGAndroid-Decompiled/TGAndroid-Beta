package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26008a;
    public final ub f26009b;

    public fb(ub ubVar, int i10) {
        this.f26008a = i10;
        this.f26009b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26008a) {
            case 0:
                this.f26009b.onExitTransitionStart();
                return;
            default:
                this.f26009b.onEnterTransitionStart();
                return;
        }
    }
}
