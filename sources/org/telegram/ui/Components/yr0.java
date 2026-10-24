package org.telegram.ui.Components;
public final class yr0 implements Runnable {
    public final int f33028a;
    public final pu0 f33029b;
    public final int f33030c;

    public yr0(pu0 pu0Var, int i10, int i11) {
        this.f33028a = i11;
        this.f33029b = pu0Var;
        this.f33030c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33028a) {
            case 0:
                this.f33029b.h.scrollBy(0, this.f33030c);
                return;
            default:
                this.f33029b.h.scrollBy(0, this.f33030c);
                return;
        }
    }
}
