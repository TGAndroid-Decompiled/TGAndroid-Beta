package org.telegram.ui.Components;
public final class qa implements Runnable {
    public final int f37199a;
    public final fb f37200b;

    public qa(fb fbVar, int i7) {
        this.f37199a = i7;
        this.f37200b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f37199a) {
            case 0:
                this.f37200b.onExitTransitionStart();
                return;
            default:
                this.f37200b.onEnterTransitionStart();
                return;
        }
    }
}
