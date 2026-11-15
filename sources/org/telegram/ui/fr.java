package org.telegram.ui;
public final class fr implements Runnable {
    public final int f47180a;
    public final pr f47181b;

    public fr(pr prVar, int i7) {
        this.f47180a = i7;
        this.f47181b = prVar;
    }

    @Override
    public final void run() {
        switch (this.f47180a) {
            case 0:
                pr.d0(this.f47181b);
                return;
            case 1:
                pr prVar = this.f47181b;
                if (prVar.K) {
                    prVar.d.d.requestFocus();
                    org.telegram.messenger.g0.J3(prVar.d.d);
                    return;
                }
                return;
            default:
                pr prVar2 = this.f47181b;
                prVar2.presentFragment(an.ua(prVar2.I), true);
                return;
        }
    }
}
