package org.telegram.ui;
public final class dr implements Runnable {
    public final int f45131a;
    public final nr f45132b;

    public dr(nr nrVar, int i7) {
        this.f45131a = i7;
        this.f45132b = nrVar;
    }

    @Override
    public final void run() {
        switch (this.f45131a) {
            case 0:
                nr.d0(this.f45132b);
                return;
            case 1:
                nr nrVar = this.f45132b;
                if (nrVar.J) {
                    nrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(nrVar.d.d);
                    return;
                }
                return;
            default:
                nr nrVar2 = this.f45132b;
                nrVar2.presentFragment(an.ra(nrVar2.H), true);
                return;
        }
    }
}
