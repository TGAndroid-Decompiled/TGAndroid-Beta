package org.telegram.ui.Components;
public final class pc implements Runnable {
    public final int f27009a;
    public final wb f27010b;

    public pc(wb wbVar, int i10) {
        this.f27009a = i10;
        this.f27010b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f27009a) {
            case 0:
                this.f27010b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27010b.performHapticFeedback(3, 2);
                return;
        }
    }
}
