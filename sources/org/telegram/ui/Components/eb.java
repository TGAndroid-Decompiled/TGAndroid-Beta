package org.telegram.ui.Components;
public final class eb implements Runnable {
    public final int f23914a;
    public final tb f23915b;

    public eb(tb tbVar, int i10) {
        this.f23914a = i10;
        this.f23915b = tbVar;
    }

    @Override
    public final void run() {
        switch (this.f23914a) {
            case 0:
                this.f23915b.onExitTransitionStart();
                return;
            default:
                this.f23915b.onEnterTransitionStart();
                return;
        }
    }
}
