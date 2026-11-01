package org.telegram.ui.Components;
public final class la implements Runnable {
    public final int f28098a;
    public final bb f28099b;

    public la(bb bbVar, int i10) {
        this.f28098a = i10;
        this.f28099b = bbVar;
    }

    @Override
    public final void run() {
        switch (this.f28098a) {
            case 0:
                this.f28099b.onExitTransitionStart();
                return;
            default:
                this.f28099b.onEnterTransitionStart();
                return;
        }
    }
}
