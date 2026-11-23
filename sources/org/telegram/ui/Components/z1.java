package org.telegram.ui.Components;
public final class z1 implements Runnable {
    public final int f42616a;
    public final org.telegram.messenger.lr f42617b;

    public z1(org.telegram.messenger.lr lrVar, int i7) {
        this.f42616a = i7;
        this.f42617b = lrVar;
    }

    @Override
    public final void run() {
        switch (this.f42616a) {
            case 0:
                org.telegram.messenger.lr lrVar = this.f42617b;
                if (lrVar != null) {
                    lrVar.q(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.lr lrVar2 = this.f42617b;
                if (lrVar2 != null) {
                    lrVar2.q(false);
                    return;
                }
                return;
        }
    }
}
