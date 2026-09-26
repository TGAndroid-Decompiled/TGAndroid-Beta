package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24203a;
    public final ub f24204b;

    public fb(ub ubVar, int i10) {
        this.f24203a = i10;
        this.f24204b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24203a) {
            case 0:
                this.f24204b.onExitTransitionStart();
                return;
            default:
                this.f24204b.onEnterTransitionStart();
                return;
        }
    }
}
