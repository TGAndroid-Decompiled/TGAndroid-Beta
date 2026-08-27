package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class ij implements Runnable {

    public final int f29373a;

    public final kj f29374b;

    public ij(kj kjVar, int i10) {
        this.f29373a = i10;
        this.f29374b = kjVar;
    }

    @Override
    public final void run() {
        switch (this.f29373a) {
            case 0:
                kj kjVar = this.f29374b;
                if (kjVar.f30116f != null) {
                    kjVar.v = org.telegram.messenger.y1.k(new StringBuilder("+"), kjVar.f30116f.phone, oe.b.c());
                    kjVar.f30119s = kjVar.f30116f;
                    AndroidUtilities.runOnUIThread(new ij(kjVar, 1));
                }
                break;
            default:
                kj kjVar2 = this.f29374b;
                kjVar2.f30114c.l(kjVar2.v, false);
                break;
        }
    }
}
