package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f31868a;
    public final l3 f31869b;
    public final int f31870c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f31868a = i11;
        this.f31869b = l3Var;
        this.f31870c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31868a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f31869b, this.f31870c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f31869b, this.f31870c, 3));
                return;
            case 2:
                this.f31869b.c(this.f31870c);
                return;
            default:
                this.f31869b.a(this.f31870c);
                return;
        }
    }
}
