package org.telegram.ui.Components;
public final class p1 implements Runnable {
    public final int f38140a;
    public final org.telegram.messenger.nr f38141b;

    public p1(org.telegram.messenger.nr nrVar, int i7) {
        this.f38140a = i7;
        this.f38141b = nrVar;
    }

    @Override
    public final void run() {
        switch (this.f38140a) {
            case 0:
                org.telegram.messenger.nr nrVar = this.f38141b;
                if (nrVar != null) {
                    nrVar.j(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.nr nrVar2 = this.f38141b;
                if (nrVar2 != null) {
                    nrVar2.j(false);
                    return;
                }
                return;
        }
    }
}
