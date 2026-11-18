package org.telegram.ui;
public final class qa implements Runnable {
    public final int f51104a;
    public final lb f51105b;

    public qa(lb lbVar, int i7) {
        this.f51104a = i7;
        this.f51105b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f51104a) {
            case 0:
                lb lbVar = this.f51105b;
                lbVar.H0 = Integer.MAX_VALUE;
                lbVar.I0 = -1;
                lbVar.i1();
                lbVar.J0 = null;
                return;
            case 1:
                lb lbVar2 = this.f51105b;
                lbVar2.b1(false);
                lbVar2.F.f();
                return;
            default:
                this.f51105b.a1();
                return;
        }
    }
}
