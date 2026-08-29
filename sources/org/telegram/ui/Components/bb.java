package org.telegram.ui.Components;
public final class bb implements Runnable {
    public final int f27021a;
    public final rb f27022b;

    public bb(rb rbVar, int i10) {
        this.f27021a = i10;
        this.f27022b = rbVar;
    }

    @Override
    public final void run() {
        switch (this.f27021a) {
            case 0:
                this.f27022b.onExitTransitionStart();
                return;
            default:
                this.f27022b.onEnterTransitionStart();
                return;
        }
    }
}
