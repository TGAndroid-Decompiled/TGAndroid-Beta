package org.telegram.ui.Components;
public final class pc implements Runnable {
    public final int f26999a;
    public final wb f27000b;

    public pc(wb wbVar, int i10) {
        this.f26999a = i10;
        this.f27000b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f26999a) {
            case 0:
                this.f27000b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27000b.performHapticFeedback(3, 2);
                return;
        }
    }
}
