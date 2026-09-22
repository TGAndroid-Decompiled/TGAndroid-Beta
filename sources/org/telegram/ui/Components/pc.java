package org.telegram.ui.Components;
public final class pc implements Runnable {
    public final int f27006a;
    public final wb f27007b;

    public pc(wb wbVar, int i10) {
        this.f27006a = i10;
        this.f27007b = wbVar;
    }

    @Override
    public final void run() {
        switch (this.f27006a) {
            case 0:
                this.f27007b.performHapticFeedback(3, 2);
                return;
            default:
                this.f27007b.performHapticFeedback(3, 2);
                return;
        }
    }
}
