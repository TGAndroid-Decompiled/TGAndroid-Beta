package org.telegram.ui.Components;
public final class db implements Runnable {
    public final int f23306a;
    public final sb f23307b;

    public db(sb sbVar, int i10) {
        this.f23306a = i10;
        this.f23307b = sbVar;
    }

    @Override
    public final void run() {
        switch (this.f23306a) {
            case 0:
                this.f23307b.onExitTransitionStart();
                return;
            default:
                this.f23307b.onEnterTransitionStart();
                return;
        }
    }
}
