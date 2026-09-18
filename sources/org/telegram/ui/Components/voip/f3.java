package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class f3 implements Runnable {
    public final int f28927a;
    public final k3 f28928b;
    public final int f28929c;

    public f3(k3 k3Var, int i10, int i11) {
        this.f28927a = i11;
        this.f28928b = k3Var;
        this.f28929c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28927a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f3(this.f28928b, this.f28929c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f3(this.f28928b, this.f28929c, 3));
                return;
            case 2:
                this.f28928b.c(this.f28929c);
                return;
            default:
                this.f28928b.a(this.f28929c);
                return;
        }
    }
}
