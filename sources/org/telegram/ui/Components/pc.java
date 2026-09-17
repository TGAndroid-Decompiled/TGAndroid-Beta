package org.telegram.ui.Components;
public final class pc implements Runnable {
    public final int f26996a;
    public final wb f26997b;

    public pc(wb wbVar, int i10) {
        this.f26996a = i10;
        this.f26997b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f26996a) {
            case 0:
                this.f26997b.performHapticFeedback(3, 2);
                return;
            default:
                this.f26997b.performHapticFeedback(3, 2);
                return;
        }
    }
}
