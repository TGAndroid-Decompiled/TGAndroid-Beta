package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zj implements Runnable {
    public final int f33617a;
    public final bk f33618b;

    public zj(bk bkVar, int i10) {
        this.f33617a = i10;
        this.f33618b = bkVar;
    }

    @Override
    public final void run() {
        switch (this.f33617a) {
            case 0:
                bk bkVar = this.f33618b;
                if (bkVar.f24991f != null) {
                    bkVar.v = org.telegram.messenger.bi.g(new StringBuilder("+"), bkVar.f24991f.phone, hf.b.c());
                    bkVar.f24994s = bkVar.f24991f;
                    AndroidUtilities.runOnUIThread(new zj(bkVar, 1));
                    return;
                }
                return;
            default:
                bk bkVar2 = this.f33618b;
                bkVar2.f24989c.l(bkVar2.v, false);
                return;
        }
    }
}
