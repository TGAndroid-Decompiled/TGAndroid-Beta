package org.telegram.ui.Components;
public final class va implements Runnable {
    public final int f40615a;
    public final kb f40616b;

    public va(kb kbVar, int i7) {
        this.f40615a = i7;
        this.f40616b = kbVar;
    }

    @Override
    public final void run() {
        switch (this.f40615a) {
            case 0:
                this.f40616b.onExitTransitionStart();
                return;
            default:
                this.f40616b.onEnterTransitionStart();
                return;
        }
    }
}
