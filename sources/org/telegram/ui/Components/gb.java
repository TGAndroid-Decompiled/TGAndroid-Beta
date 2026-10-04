package org.telegram.ui.Components;
public final class gb implements Runnable {
    public final int f26791a;
    public final vb f26792b;

    public gb(vb vbVar, int i10) {
        this.f26791a = i10;
        this.f26792b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f26791a) {
            case 0:
                this.f26792b.onExitTransitionStart();
                return;
            default:
                this.f26792b.onEnterTransitionStart();
                return;
        }
    }
}
