package org.telegram.ui.Components;
public final class es implements Runnable {
    public final int f34788a;
    public final is f34789b;

    public es(is isVar, int i7) {
        this.f34788a = i7;
        this.f34789b = isVar;
    }

    @Override
    public final void run() {
        switch (this.f34788a) {
            case 0:
                this.f34789b.X(false);
                return;
            default:
                this.f34789b.O(true);
                return;
        }
    }
}
