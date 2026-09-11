package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26007a;
    public final ub f26008b;

    public fb(ub ubVar, int i10) {
        this.f26007a = i10;
        this.f26008b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26007a) {
            case 0:
                this.f26008b.onExitTransitionStart();
                return;
            default:
                this.f26008b.onEnterTransitionStart();
                return;
        }
    }
}
