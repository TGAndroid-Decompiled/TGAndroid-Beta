package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f32710a;
    public final nb f32711b;

    public wa(nb nbVar, int i10) {
        this.f32710a = i10;
        this.f32711b = nbVar;
    }

    @Override
    public final void run() {
        switch (this.f32710a) {
            case 0:
                this.f32711b.onExitTransitionStart();
                return;
            default:
                this.f32711b.onEnterTransitionStart();
                return;
        }
    }
}
