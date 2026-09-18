package org.telegram.ui.Components;
public final class db implements Runnable {
    public final int f23309a;
    public final sb f23310b;

    public db(sb sbVar, int i10) {
        this.f23309a = i10;
        this.f23310b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f23309a) {
            case 0:
                this.f23310b.onExitTransitionStart();
                return;
            default:
                this.f23310b.onEnterTransitionStart();
                return;
        }
    }
}
