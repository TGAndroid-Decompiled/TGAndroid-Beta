package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f23932a;
    public final ub f23933b;

    public fb(ub ubVar, int i10) {
        this.f23932a = i10;
        this.f23933b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f23932a) {
            case 0:
                this.f23933b.onExitTransitionStart();
                return;
            default:
                this.f23933b.onEnterTransitionStart();
                return;
        }
    }
}
