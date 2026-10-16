package org.telegram.ui.Components;
public final class hb implements Runnable {
    public final int f25269a;
    public final wb f25270b;

    public hb(wb wbVar, int i10) {
        this.f25269a = i10;
        this.f25270b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f25269a) {
            case 0:
                this.f25270b.onExitTransitionStart();
                return;
            default:
                this.f25270b.onEnterTransitionStart();
                return;
        }
    }
}
