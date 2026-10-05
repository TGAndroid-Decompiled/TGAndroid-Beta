package org.telegram.ui.Components;
public final class gb implements Runnable {
    public final int f26840a;
    public final vb f26841b;

    public gb(vb vbVar, int i10) {
        this.f26840a = i10;
        this.f26841b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f26840a) {
            case 0:
                this.f26841b.onExitTransitionStart();
                return;
            default:
                this.f26841b.onEnterTransitionStart();
                return;
        }
    }
}
