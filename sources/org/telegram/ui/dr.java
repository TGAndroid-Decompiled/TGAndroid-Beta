package org.telegram.ui;
public final class dr implements Runnable {
    public final int f45126a;
    public final nr f45127b;

    public dr(nr nrVar, int i7) {
        this.f45126a = i7;
        this.f45127b = nrVar;
    }

    @Override
    public final void run() {
        switch (this.f45126a) {
            case 0:
                nr.d0(this.f45127b);
                return;
            case 1:
                nr nrVar = this.f45127b;
                if (nrVar.J) {
                    nrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(nrVar.d.d);
                    return;
                }
                return;
            default:
                nr nrVar2 = this.f45127b;
                nrVar2.presentFragment(an.ra(nrVar2.H), true);
                return;
        }
    }
}
