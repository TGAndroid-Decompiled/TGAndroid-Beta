package org.telegram.ui;
public final class fr implements Runnable {
    public final int f45781a;
    public final pr f45782b;

    public fr(pr prVar, int i7) {
        this.f45781a = i7;
        this.f45782b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f45781a) {
            case 0:
                pr.d0(this.f45782b);
                return;
            case 1:
                pr prVar = this.f45782b;
                if (prVar.J) {
                    prVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(prVar.d.d);
                    return;
                }
                return;
            default:
                pr prVar2 = this.f45782b;
                prVar2.presentFragment(cn.ta(prVar2.H), true);
                return;
        }
    }
}
