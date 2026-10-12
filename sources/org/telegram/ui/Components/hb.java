package org.telegram.ui.Components;
public final class hb implements Runnable {
    public final int f25627a;
    public final wb f25628b;

    public hb(wb wbVar, int i10) {
        this.f25627a = i10;
        this.f25628b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f25627a) {
            case 0:
                this.f25628b.onExitTransitionStart();
                return;
            default:
                this.f25628b.onEnterTransitionStart();
                return;
        }
    }
}
