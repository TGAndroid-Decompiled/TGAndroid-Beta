package org.telegram.ui.Components;
public final class hb implements Runnable {
    public final int f27060a;
    public final wb f27061b;

    public hb(wb wbVar, int i10) {
        this.f27060a = i10;
        this.f27061b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f27060a) {
            case 0:
                this.f27061b.onExitTransitionStart();
                return;
            default:
                this.f27061b.onEnterTransitionStart();
                return;
        }
    }
}
