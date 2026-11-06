package org.telegram.ui.Components;
public final class ra implements Runnable {
    public final int f37574a;
    public final gb f37575b;

    public ra(gb gbVar, int i7) {
        this.f37574a = i7;
        this.f37575b = gbVar;
    }

    @Override
    public final void run() {
        switch (this.f37574a) {
            case 0:
                this.f37575b.onExitTransitionStart();
                return;
            default:
                this.f37575b.onEnterTransitionStart();
                return;
        }
    }
}
