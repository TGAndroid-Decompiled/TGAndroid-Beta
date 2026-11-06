package org.telegram.ui.Components;
public final class ra implements Runnable {
    public final int f37614a;
    public final gb f37615b;

    public ra(gb gbVar, int i7) {
        this.f37614a = i7;
        this.f37615b = gbVar;
    }

    @Override
    public final void run() {
        switch (this.f37614a) {
            case 0:
                this.f37615b.onExitTransitionStart();
                return;
            default:
                this.f37615b.onEnterTransitionStart();
                return;
        }
    }
}
