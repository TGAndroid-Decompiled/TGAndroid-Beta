package org.telegram.ui.Components;
public final class vr0 implements Runnable {
    public final int f31907a;
    public final mu0 f31908b;
    public final int f31909c;

    public vr0(mu0 mu0Var, int i10, int i11) {
        this.f31907a = i11;
        this.f31908b = mu0Var;
        this.f31909c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31907a) {
            case 0:
                this.f31908b.h.scrollBy(0, this.f31909c);
                return;
            default:
                this.f31908b.h.scrollBy(0, this.f31909c);
                return;
        }
    }
}
