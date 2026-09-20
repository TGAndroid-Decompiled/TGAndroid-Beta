package org.telegram.ui.Components;
public final class eb implements Runnable {
    public final int f23817a;
    public final tb f23818b;

    public eb(tb tbVar, int i10) {
        this.f23817a = i10;
        this.f23818b = tbVar;
    }

    @Override
    public final void run() {
        switch (this.f23817a) {
            case 0:
                this.f23818b.onExitTransitionStart();
                return;
            default:
                this.f23818b.onEnterTransitionStart();
                return;
        }
    }
}
