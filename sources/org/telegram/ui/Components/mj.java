package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class mj implements Runnable {
    public final int f30876a;
    public final oj f30877b;

    public mj(oj ojVar, int i9) {
        this.f30876a = i9;
        this.f30877b = ojVar;
    }

    @Override
    public final void run() {
        switch (this.f30876a) {
            case 0:
                oj ojVar = this.f30877b;
                if (ojVar.f31395f != null) {
                    ojVar.v = org.telegram.messenger.ll.g(new StringBuilder("+"), ojVar.f31395f.phone, ne.b.c());
                    ojVar.f31398s = ojVar.f31395f;
                    AndroidUtilities.runOnUIThread(new mj(ojVar, 1));
                    return;
                }
                return;
            default:
                oj ojVar2 = this.f30877b;
                ojVar2.f31393c.l(ojVar2.v, false);
                return;
        }
    }
}
