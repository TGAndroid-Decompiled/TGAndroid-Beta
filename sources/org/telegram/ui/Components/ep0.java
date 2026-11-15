package org.telegram.ui.Components;
public final class ep0 implements Runnable {
    public final int f34405a;
    public final tr0 f34406b;
    public final int f34407c;

    public ep0(tr0 tr0Var, int i7, int i10) {
        this.f34405a = i10;
        this.f34406b = tr0Var;
        this.f34407c = i7;
    }

    @Override
    public final void run() {
        switch (this.f34405a) {
            case 0:
                this.f34406b.h.scrollBy(0, this.f34407c);
                return;
            case 1:
                this.f34406b.h.scrollBy(0, this.f34407c);
                return;
            default:
                this.f34406b.h.scrollBy(0, this.f34407c);
                return;
        }
    }
}
