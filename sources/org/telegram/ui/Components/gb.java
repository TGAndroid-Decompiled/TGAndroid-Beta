package org.telegram.ui.Components;
public final class gb implements Runnable {
    public final int f24528a;
    public final vb f24529b;

    public gb(vb vbVar, int i10) {
        this.f24528a = i10;
        this.f24529b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f24528a) {
            case 0:
                this.f24529b.onExitTransitionStart();
                return;
            default:
                this.f24529b.onEnterTransitionStart();
                return;
        }
    }
}
