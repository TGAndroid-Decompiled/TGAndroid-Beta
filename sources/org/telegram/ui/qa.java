package org.telegram.ui;
public final class qa implements Runnable {
    public final int f50531a;
    public final lb f50532b;

    public qa(lb lbVar, int i7) {
        this.f50531a = i7;
        this.f50532b = lbVar;
    }

    @Override
    public final void run() {
        switch (this.f50531a) {
            case 0:
                lb lbVar = this.f50532b;
                lbVar.H0 = Integer.MAX_VALUE;
                lbVar.I0 = -1;
                lbVar.i1();
                lbVar.J0 = null;
                return;
            case 1:
                lb lbVar2 = this.f50532b;
                lbVar2.b1(false);
                lbVar2.F.f();
                return;
            default:
                this.f50532b.a1();
                return;
        }
    }
}
