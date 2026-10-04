package org.telegram.ui.Components;
public final class gb implements Runnable {
    public final int f26786a;
    public final vb f26787b;

    public gb(vb vbVar, int i10) {
        this.f26786a = i10;
        this.f26787b = vbVar;
    }

    @Override
    public final void run() {
        switch (this.f26786a) {
            case 0:
                this.f26787b.onExitTransitionStart();
                return;
            default:
                this.f26787b.onEnterTransitionStart();
                return;
        }
    }
}
