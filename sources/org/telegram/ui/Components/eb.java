package org.telegram.ui.Components;
public final class eb implements Runnable {
    public final int f22655a;
    public final tb f22656b;

    public eb(tb tbVar, int i10) {
        this.f22655a = i10;
        this.f22656b = tbVar;
    }

    @Override
    public final void run() {
        switch (this.f22655a) {
            case 0:
                this.f22656b.onExitTransitionStart();
                return;
            default:
                this.f22656b.onEnterTransitionStart();
                return;
        }
    }
}
