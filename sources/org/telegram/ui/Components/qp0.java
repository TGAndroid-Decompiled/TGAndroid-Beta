package org.telegram.ui.Components;
public final class qp0 implements Runnable {
    public final int f38974a;
    public final ds0 f38975b;
    public final int f38976c;

    public qp0(ds0 ds0Var, int i7, int i10) {
        this.f38974a = i10;
        this.f38975b = ds0Var;
        this.f38976c = i7;
    }

    @Override
    public final void run() {
        switch (this.f38974a) {
            case 0:
                this.f38975b.h.scrollBy(0, this.f38976c);
                return;
            case 1:
                this.f38975b.h.scrollBy(0, this.f38976c);
                return;
            default:
                this.f38975b.h.scrollBy(0, this.f38976c);
                return;
        }
    }
}
