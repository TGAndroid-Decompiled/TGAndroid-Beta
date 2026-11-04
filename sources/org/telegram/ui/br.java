package org.telegram.ui;
public final class br implements Runnable {
    public final int f44132a;
    public final lr f44133b;

    public br(lr lrVar, int i3) {
        this.f44132a = i3;
        this.f44133b = lrVar;
    }

    @Override
    public final void run() {
        switch (this.f44132a) {
            case 0:
                lr.d0(this.f44133b);
                return;
            case 1:
                lr lrVar = this.f44133b;
                if (lrVar.K) {
                    lrVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(lrVar.d.d);
                    return;
                }
                return;
            default:
                lr lrVar2 = this.f44133b;
                lrVar2.presentFragment(wm.ra(lrVar2.I), true);
                return;
        }
    }
}
