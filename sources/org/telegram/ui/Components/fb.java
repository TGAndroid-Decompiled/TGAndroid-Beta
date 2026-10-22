package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f26191a;
    public final ub f26192b;

    public fb(ub ubVar, int i10) {
        this.f26191a = i10;
        this.f26192b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f26191a) {
            case 0:
                this.f26192b.onExitTransitionStart();
                return;
            default:
                this.f26192b.onEnterTransitionStart();
                return;
        }
    }
}
