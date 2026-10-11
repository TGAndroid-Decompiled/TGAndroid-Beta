package org.telegram.ui.Components;
public final class hb implements Runnable {
    public final int f26964a;
    public final wb f26965b;

    public hb(wb wbVar, int i10) {
        this.f26964a = i10;
        this.f26965b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f26964a) {
            case 0:
                this.f26965b.onExitTransitionStart();
                return;
            default:
                this.f26965b.onEnterTransitionStart();
                return;
        }
    }
}
