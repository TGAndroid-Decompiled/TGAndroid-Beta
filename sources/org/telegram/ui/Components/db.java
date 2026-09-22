package org.telegram.ui.Components;
public final class db implements Runnable {
    public final int f23278a;
    public final sb f23279b;

    public db(sb sbVar, int i10) {
        this.f23278a = i10;
        this.f23279b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f23278a) {
            case 0:
                this.f23279b.onExitTransitionStart();
                return;
            default:
                this.f23279b.onEnterTransitionStart();
                return;
        }
    }
}
