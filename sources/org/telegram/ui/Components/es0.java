package org.telegram.ui.Components;
public final class es0 implements Runnable {
    public final int f27974a;
    public final tu0 f27975b;
    public final int f27976c;

    public es0(tu0 tu0Var, int i10, int i11) {
        this.f27974a = i11;
        this.f27975b = tu0Var;
        this.f27976c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27974a) {
            case 0:
                this.f27975b.h.scrollBy(0, this.f27976c);
                return;
            case 1:
                this.f27975b.h.scrollBy(0, this.f27976c);
                return;
            default:
                this.f27975b.h.scrollBy(0, this.f27976c);
                return;
        }
    }
}
