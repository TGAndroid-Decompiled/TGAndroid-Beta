package org.telegram.ui.Components;
public final class vr0 implements Runnable {
    public final int f31905a;
    public final mu0 f31906b;
    public final int f31907c;

    public vr0(mu0 mu0Var, int i10, int i11) {
        this.f31905a = i11;
        this.f31906b = mu0Var;
        this.f31907c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31905a) {
            case 0:
                this.f31906b.h.scrollBy(0, this.f31907c);
                return;
            default:
                this.f31906b.h.scrollBy(0, this.f31907c);
                return;
        }
    }
}
