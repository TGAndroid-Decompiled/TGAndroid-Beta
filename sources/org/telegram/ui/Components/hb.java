package org.telegram.ui.Components;
public final class hb implements Runnable {
    public final int f26730a;
    public final wb f26731b;

    public hb(wb wbVar, int i10) {
        this.f26730a = i10;
        this.f26731b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f26730a) {
            case 0:
                this.f26731b.onExitTransitionStart();
                return;
            default:
                this.f26731b.onEnterTransitionStart();
                return;
        }
    }
}
