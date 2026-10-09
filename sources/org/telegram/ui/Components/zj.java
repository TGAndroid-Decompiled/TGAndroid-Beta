package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zj implements Runnable {
    public final int f33586a;
    public final bk f33587b;

    public zj(bk bkVar, int i10) {
        this.f33586a = i10;
        this.f33587b = bkVar;
    }

    @Override
    public final void run() {
        switch (this.f33586a) {
            case 0:
                bk bkVar = this.f33587b;
                if (bkVar.f25035f != null) {
                    bkVar.v = org.telegram.messenger.bi.g(new StringBuilder("+"), bkVar.f25035f.phone, hf.b.c());
                    bkVar.f25038s = bkVar.f25035f;
                    AndroidUtilities.runOnUIThread(new zj(bkVar, 1));
                    return;
                }
                return;
            default:
                bk bkVar2 = this.f33587b;
                bkVar2.f25033c.l(bkVar2.v, false);
                return;
        }
    }
}
