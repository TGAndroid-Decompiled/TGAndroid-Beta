package org.telegram.ui.Components;
public final class db implements Runnable {
    public final int f23279a;
    public final sb f23280b;

    public db(sb sbVar, int i10) {
        this.f23279a = i10;
        this.f23280b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f23279a) {
            case 0:
                this.f23280b.onExitTransitionStart();
                return;
            default:
                this.f23280b.onEnterTransitionStart();
                return;
        }
    }
}
