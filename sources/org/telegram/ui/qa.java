package org.telegram.ui;
public final class qa implements Runnable {
    public final int f48990a;
    public final mb f48991b;

    public qa(mb mbVar, int i7) {
        this.f48990a = i7;
        this.f48991b = mbVar;
    }

    @Override
    public final void run() {
        switch (this.f48990a) {
            case 0:
                mb mbVar = this.f48991b;
                mbVar.G0 = Integer.MAX_VALUE;
                mbVar.H0 = -1;
                mbVar.i1();
                mbVar.I0 = null;
                return;
            case 1:
                mb mbVar2 = this.f48991b;
                mbVar2.b1(false);
                mbVar2.E.f();
                return;
            default:
                this.f48991b.a1();
                return;
        }
    }
}
