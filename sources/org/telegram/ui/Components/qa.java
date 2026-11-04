package org.telegram.ui.Components;
public final class qa implements Runnable {
    public final int f37400a;
    public final fb f37401b;

    public qa(fb fbVar, int i3) {
        this.f37400a = i3;
        this.f37401b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f37400a) {
            case 0:
                this.f37401b.onExitTransitionStart();
                return;
            default:
                this.f37401b.onEnterTransitionStart();
                return;
        }
    }
}
