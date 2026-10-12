package org.telegram.ui.Components;
public final class hb implements Runnable {
    public final int f26734a;
    public final wb f26735b;

    public hb(wb wbVar, int i10) {
        this.f26734a = i10;
        this.f26735b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f26734a) {
            case 0:
                this.f26735b.onExitTransitionStart();
                return;
            default:
                this.f26735b.onEnterTransitionStart();
                return;
        }
    }
}
