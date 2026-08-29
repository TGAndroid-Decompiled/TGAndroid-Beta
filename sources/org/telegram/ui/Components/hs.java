package org.telegram.ui.Components;
public final class hs implements Runnable {
    public final int f29221a;
    public final ls f29222b;

    public hs(ls lsVar, int i10) {
        this.f29221a = i10;
        this.f29222b = lsVar;
    }

    @Override
    public final void run() {
        switch (this.f29221a) {
            case 0:
                this.f29222b.W(false);
                return;
            default:
                this.f29222b.N(true);
                return;
        }
    }
}
