package org.telegram.ui.Components;
public final class wa implements Runnable {
    public final int f32715a;
    public final nb f32716b;

    public wa(nb nbVar, int i10) {
        this.f32715a = i10;
        this.f32716b = nbVar;
    }

    @Override
    public final void run() {
        switch (this.f32715a) {
            case 0:
                this.f32716b.onExitTransitionStart();
                return;
            default:
                this.f32716b.onEnterTransitionStart();
                return;
        }
    }
}
