package org.telegram.ui.Components;
public final class la implements Runnable {
    public final int f28054a;
    public final bb f28055b;

    public la(bb bbVar, int i10) {
        this.f28054a = i10;
        this.f28055b = bbVar;
    }

    @Override
    public final void run() {
        switch (this.f28054a) {
            case 0:
                this.f28055b.onExitTransitionStart();
                return;
            default:
                this.f28055b.onEnterTransitionStart();
                return;
        }
    }
}
