package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zj implements Runnable {
    public final int f33641a;
    public final bk f33642b;

    public zj(bk bkVar, int i10) {
        this.f33641a = i10;
        this.f33642b = bkVar;
    }

    @Override
    public final void run() {
        switch (this.f33641a) {
            case 0:
                bk bkVar = this.f33642b;
                if (bkVar.f25030f != null) {
                    bkVar.v = org.telegram.messenger.ai.g(new StringBuilder("+"), bkVar.f25030f.phone, hf.b.c());
                    bkVar.f25033s = bkVar.f25030f;
                    AndroidUtilities.runOnUIThread(new zj(bkVar, 1));
                    return;
                }
                return;
            default:
                bk bkVar2 = this.f33642b;
                bkVar2.f25028c.l(bkVar2.v, false);
                return;
        }
    }
}
