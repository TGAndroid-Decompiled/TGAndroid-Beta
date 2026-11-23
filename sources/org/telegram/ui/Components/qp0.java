package org.telegram.ui.Components;
public final class qp0 implements Runnable {
    public final int f38921a;
    public final ds0 f38922b;
    public final int f38923c;

    public qp0(ds0 ds0Var, int i7, int i10) {
        this.f38921a = i10;
        this.f38922b = ds0Var;
        this.f38923c = i7;
    }

    @Override
    public final void run() {
        switch (this.f38921a) {
            case 0:
                this.f38922b.h.scrollBy(0, this.f38923c);
                return;
            case 1:
                this.f38922b.h.scrollBy(0, this.f38923c);
                return;
            default:
                this.f38922b.h.scrollBy(0, this.f38923c);
                return;
        }
    }
}
