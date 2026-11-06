package org.telegram.ui;
public final class qa implements Runnable {
    public final int f49176a;
    public final mb f49177b;

    public qa(mb mbVar, int i7) {
        this.f49176a = i7;
        this.f49177b = mbVar;
    }

    @Override
    public final void run() {
        switch (this.f49176a) {
            case 0:
                mb mbVar = this.f49177b;
                mbVar.G0 = Integer.MAX_VALUE;
                mbVar.H0 = -1;
                mbVar.i1();
                mbVar.I0 = null;
                return;
            case 1:
                mb mbVar2 = this.f49177b;
                mbVar2.b1(false);
                mbVar2.E.f();
                return;
            default:
                this.f49177b.a1();
                return;
        }
    }
}
