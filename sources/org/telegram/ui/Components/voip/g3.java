package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f31867a;
    public final l3 f31868b;
    public final int f31869c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f31867a = i11;
        this.f31868b = l3Var;
        this.f31869c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31867a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f31868b, this.f31869c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f31868b, this.f31869c, 3));
                return;
            case 2:
                this.f31868b.c(this.f31869c);
                return;
            default:
                this.f31868b.a(this.f31869c);
                return;
        }
    }
}
