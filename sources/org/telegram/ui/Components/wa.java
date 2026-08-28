package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f34166a;
    public final lb f34167b;

    public wa(lb lbVar, int i9) {
        this.f34166a = i9;
        this.f34167b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f34166a) {
            case 0:
                this.f34167b.onExitTransitionStart();
                return;
            default:
                this.f34167b.onEnterTransitionStart();
                return;
        }
    }
}
