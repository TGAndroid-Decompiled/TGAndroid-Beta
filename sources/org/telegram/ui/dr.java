package org.telegram.ui;
public final class dr implements Runnable {
    public final int f45102a;
    public final nr f45103b;

    public dr(nr nrVar, int i7) {
        this.f45102a = i7;
        this.f45103b = nrVar;
    }

    @Override
    public final void run() {
        switch (this.f45102a) {
            case 0:
                nr.d0(this.f45103b);
                return;
            case 1:
                nr nrVar = this.f45103b;
                if (nrVar.J) {
                    nrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(nrVar.d.d);
                    return;
                }
                return;
            default:
                nr nrVar2 = this.f45103b;
                nrVar2.presentFragment(an.ra(nrVar2.H), true);
                return;
        }
    }
}
