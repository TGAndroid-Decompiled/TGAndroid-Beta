package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f28091a;
    public final ub f28092b;

    public fb(ub ubVar, int i10) {
        this.f28091a = i10;
        this.f28092b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f28091a) {
            case 0:
                this.f28092b.onExitTransitionStart();
                return;
            default:
                this.f28092b.onEnterTransitionStart();
                return;
        }
    }
}
