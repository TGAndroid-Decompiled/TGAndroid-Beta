package org.telegram.ui.Components;
public final class ib implements Runnable {
    public final int f27343a;
    public final xb f27344b;

    public ib(xb xbVar, int i10) {
        this.f27343a = i10;
        this.f27344b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f27343a) {
            case 0:
                this.f27344b.onExitTransitionStart();
                return;
            default:
                this.f27344b.onEnterTransitionStart();
                return;
        }
    }
}
