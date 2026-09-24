package org.telegram.ui.Components;
public final class fb implements Runnable {
    public final int f24119a;
    public final ub f24120b;

    public fb(ub ubVar, int i10) {
        this.f24119a = i10;
        this.f24120b = ubVar;
    }

    @Override
    public final void run() {
        switch (this.f24119a) {
            case 0:
                this.f24120b.onExitTransitionStart();
                return;
            default:
                this.f24120b.onEnterTransitionStart();
                return;
        }
    }
}
