package org.telegram.ui;
public final class cb implements Runnable {
    public final int f34524a;
    public final ac f34525b;

    public cb(ac acVar, int i10) {
        this.f34524a = i10;
        this.f34525b = acVar;
    }

    @Override
    public final void run() {
        switch (this.f34524a) {
            case 0:
                ac acVar = this.f34525b;
                acVar.G0 = Integer.MAX_VALUE;
                acVar.H0 = -1;
                acVar.d1();
                acVar.I0 = null;
                return;
            case 1:
                ac acVar2 = this.f34525b;
                acVar2.W0(false);
                acVar2.E.l();
                return;
            default:
                this.f34525b.V0();
                return;
        }
    }
}
