package org.telegram.ui.Components;
public final class ep0 implements Runnable {
    public final int f34406a;
    public final tr0 f34407b;
    public final int f34408c;

    public ep0(tr0 tr0Var, int i7, int i10) {
        this.f34406a = i10;
        this.f34407b = tr0Var;
        this.f34408c = i7;
    }

    @Override
    public final void run() {
        switch (this.f34406a) {
            case 0:
                this.f34407b.h.scrollBy(0, this.f34408c);
                return;
            case 1:
                this.f34407b.h.scrollBy(0, this.f34408c);
                return;
            default:
                this.f34407b.h.scrollBy(0, this.f34408c);
                return;
        }
    }
}
