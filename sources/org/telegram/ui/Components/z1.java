package org.telegram.ui.Components;
public final class z1 implements Runnable {
    public final int f42708a;
    public final org.telegram.messenger.lr f42709b;

    public z1(org.telegram.messenger.lr lrVar, int i7) {
        this.f42708a = i7;
        this.f42709b = lrVar;
    }

    @Override
    public final void run() {
        switch (this.f42708a) {
            case 0:
                org.telegram.messenger.lr lrVar = this.f42709b;
                if (lrVar != null) {
                    lrVar.d(false);
                    return;
                }
                return;
            default:
                org.telegram.messenger.lr lrVar2 = this.f42709b;
                if (lrVar2 != null) {
                    lrVar2.d(false);
                    return;
                }
                return;
        }
    }
}
