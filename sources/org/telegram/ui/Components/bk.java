package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class bk implements Runnable {
    public final int f24667a;
    public final dk f24668b;

    public bk(dk dkVar, int i10) {
        this.f24667a = i10;
        this.f24668b = dkVar;
    }

    @Override
    public final void run() {
        switch (this.f24667a) {
            case 0:
                dk dkVar = this.f24668b;
                if (dkVar.f25382f != null) {
                    dkVar.v = org.telegram.messenger.am.g(new StringBuilder("+"), dkVar.f25382f.phone, hf.b.c());
                    dkVar.f25385s = dkVar.f25382f;
                    AndroidUtilities.runOnUIThread(new bk(dkVar, 1));
                    return;
                }
                return;
            default:
                dk dkVar2 = this.f24668b;
                dkVar2.f25380c.l(dkVar2.v, false);
                return;
        }
    }
}
