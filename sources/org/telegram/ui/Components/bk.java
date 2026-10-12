package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class bk implements Runnable {
    public final int f24672a;
    public final dk f24673b;

    public bk(dk dkVar, int i10) {
        this.f24672a = i10;
        this.f24673b = dkVar;
    }

    @Override
    public final void run() {
        switch (this.f24672a) {
            case 0:
                dk dkVar = this.f24673b;
                if (dkVar.f25379f != null) {
                    dkVar.v = org.telegram.messenger.am.g(new StringBuilder("+"), dkVar.f25379f.phone, hf.b.c());
                    dkVar.f25382s = dkVar.f25379f;
                    AndroidUtilities.runOnUIThread(new bk(dkVar, 1));
                    return;
                }
                return;
            default:
                dk dkVar2 = this.f24673b;
                dkVar2.f25377c.l(dkVar2.v, false);
                return;
        }
    }
}
