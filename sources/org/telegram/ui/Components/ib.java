package org.telegram.ui.Components;
public final class ib implements Runnable {
    public final int f27340a;
    public final xb f27341b;

    public ib(xb xbVar, int i10) {
        this.f27340a = i10;
        this.f27341b = xbVar;
    }

    @Override
    public final void run() {
        switch (this.f27340a) {
            case 0:
                this.f27341b.onExitTransitionStart();
                return;
            default:
                this.f27341b.onEnterTransitionStart();
                return;
        }
    }
}
