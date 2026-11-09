package org.telegram.ui.Components;
public final class ra implements Runnable {
    public final int f37608a;
    public final gb f37609b;

    public ra(gb gbVar, int i7) {
        this.f37608a = i7;
        this.f37609b = gbVar;
    }

    @Override
    public final void run() {
        switch (this.f37608a) {
            case 0:
                this.f37609b.onExitTransitionStart();
                return;
            default:
                this.f37609b.onEnterTransitionStart();
                return;
        }
    }
}
