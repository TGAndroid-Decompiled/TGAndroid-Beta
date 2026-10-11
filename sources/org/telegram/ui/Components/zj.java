package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zj implements Runnable {
    public final int f33547a;
    public final bk f33548b;

    public zj(bk bkVar, int i10) {
        this.f33547a = i10;
        this.f33548b = bkVar;
    }

    @Override
    public final void run() {
        switch (this.f33547a) {
            case 0:
                bk bkVar = this.f33548b;
                if (bkVar.f24973f != null) {
                    bkVar.v = org.telegram.messenger.ai.g(new StringBuilder("+"), bkVar.f24973f.phone, hf.b.c());
                    bkVar.f24976s = bkVar.f24973f;
                    AndroidUtilities.runOnUIThread(new zj(bkVar, 1));
                    return;
                }
                return;
            default:
                bk bkVar2 = this.f33548b;
                bkVar2.f24971c.l(bkVar2.v, false);
                return;
        }
    }
}
