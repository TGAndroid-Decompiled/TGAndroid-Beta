package org.telegram.ui.Components;
public final class ra implements Runnable {
    public final int f37671a;
    public final gb f37672b;

    public ra(gb gbVar, int i7) {
        this.f37671a = i7;
        this.f37672b = gbVar;
    }

    @Override
    public final void run() {
        switch (this.f37671a) {
            case 0:
                this.f37672b.onExitTransitionStart();
                return;
            default:
                this.f37672b.onEnterTransitionStart();
                return;
        }
    }
}
