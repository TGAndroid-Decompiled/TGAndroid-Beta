package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f31680a;
    public final l3 f31681b;
    public final int f31682c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f31680a = i11;
        this.f31681b = l3Var;
        this.f31682c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31680a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f31681b, this.f31682c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f31681b, this.f31682c, 3));
                return;
            case 2:
                this.f31681b.c(this.f31682c);
                return;
            default:
                this.f31681b.a(this.f31682c);
                return;
        }
    }
}
