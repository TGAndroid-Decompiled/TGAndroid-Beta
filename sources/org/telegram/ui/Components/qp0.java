package org.telegram.ui.Components;
public final class qp0 implements Runnable {
    public final int f38967a;
    public final ds0 f38968b;
    public final int f38969c;

    public qp0(ds0 ds0Var, int i7, int i10) {
        this.f38967a = i10;
        this.f38968b = ds0Var;
        this.f38969c = i7;
    }

    @Override
    public final void run() {
        switch (this.f38967a) {
            case 0:
                this.f38968b.h.scrollBy(0, this.f38969c);
                return;
            case 1:
                this.f38968b.h.scrollBy(0, this.f38969c);
                return;
            default:
                this.f38968b.h.scrollBy(0, this.f38969c);
                return;
        }
    }
}
