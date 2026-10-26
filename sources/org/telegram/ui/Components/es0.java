package org.telegram.ui.Components;
public final class es0 implements Runnable {
    public final int f27976a;
    public final tu0 f27977b;
    public final int f27978c;

    public es0(tu0 tu0Var, int i10, int i11) {
        this.f27976a = i11;
        this.f27977b = tu0Var;
        this.f27978c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27976a) {
            case 0:
                this.f27977b.h.scrollBy(0, this.f27978c);
                return;
            case 1:
                this.f27977b.h.scrollBy(0, this.f27978c);
                return;
            default:
                this.f27977b.h.scrollBy(0, this.f27978c);
                return;
        }
    }
}
