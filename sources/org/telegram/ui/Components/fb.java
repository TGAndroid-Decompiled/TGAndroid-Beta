package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26035a;
    public final ub f26036b;

    public fb(ub ubVar, int i10) {
        this.f26035a = i10;
        this.f26036b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26035a) {
            case 0:
                this.f26036b.onExitTransitionStart();
                return;
            default:
                this.f26036b.onEnterTransitionStart();
                return;
        }
    }
}
