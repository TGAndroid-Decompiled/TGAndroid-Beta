package org.telegram.ui.Components;
public final class ra implements Runnable {
    public final int f37595a;
    public final gb f37596b;

    public ra(gb gbVar, int i7) {
        this.f37595a = i7;
        this.f37596b = gbVar;
    }

    @Override
    public final void run() {
        switch (this.f37595a) {
            case 0:
                this.f37596b.onExitTransitionStart();
                return;
            default:
                this.f37596b.onEnterTransitionStart();
                return;
        }
    }
}
