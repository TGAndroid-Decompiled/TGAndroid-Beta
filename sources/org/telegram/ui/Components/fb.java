package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26034a;
    public final ub f26035b;

    public fb(ub ubVar, int i10) {
        this.f26034a = i10;
        this.f26035b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26034a) {
            case 0:
                this.f26035b.onExitTransitionStart();
                return;
            default:
                this.f26035b.onEnterTransitionStart();
                return;
        }
    }
}
