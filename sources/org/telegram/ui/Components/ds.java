package org.telegram.ui.Components;
public final class ds implements Runnable {
    public final int f34439a;
    public final hs f34440b;

    public ds(hs hsVar, int i7) {
        this.f34439a = i7;
        this.f34440b = hsVar;
    }

    @Override
    public final void run() {
        switch (this.f34439a) {
            case 0:
                this.f34440b.X(false);
                return;
            default:
                this.f34440b.O(true);
                return;
        }
    }
}
