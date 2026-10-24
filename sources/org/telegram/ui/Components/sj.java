package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class sj implements Runnable {
    public final int f30523a;
    public final uj f30524b;

    public sj(uj ujVar, int i10) {
        this.f30523a = i10;
        this.f30524b = ujVar;
    }

    @Override
    public final void run() {
        switch (this.f30523a) {
            case 0:
                uj ujVar = this.f30524b;
                if (ujVar.f31143f != null) {
                    ujVar.v = org.telegram.messenger.tl.h(new StringBuilder("+"), ujVar.f31143f.phone, jf.b.c());
                    ujVar.f31146s = ujVar.f31143f;
                    AndroidUtilities.runOnUIThread(new sj(ujVar, 1));
                    return;
                }
                return;
            default:
                uj ujVar2 = this.f30524b;
                ujVar2.f31142c.l(ujVar2.v, false);
                return;
        }
    }
}
