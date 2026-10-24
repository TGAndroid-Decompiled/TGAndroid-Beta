package org.telegram.ui.Components;
public final class db implements Runnable {
    public final int f25690a;
    public final sb f25691b;

    public db(sb sbVar, int i10) {
        this.f25690a = i10;
        this.f25691b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f25690a) {
            case 0:
                this.f25691b.onExitTransitionStart();
                return;
            default:
                this.f25691b.onEnterTransitionStart();
                return;
        }
    }
}
