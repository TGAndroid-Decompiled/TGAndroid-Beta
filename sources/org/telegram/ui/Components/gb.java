package org.telegram.ui.Components;
public final class gb implements Runnable {
    public final int f26785a;
    public final vb f26786b;

    public gb(vb vbVar, int i10) {
        this.f26785a = i10;
        this.f26786b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f26785a) {
            case 0:
                this.f26786b.onExitTransitionStart();
                return;
            default:
                this.f26786b.onEnterTransitionStart();
                return;
        }
    }
}
