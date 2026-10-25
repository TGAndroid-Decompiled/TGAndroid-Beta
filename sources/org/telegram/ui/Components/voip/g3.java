package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f33811a;
    public final l3 f33812b;
    public final int f33813c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f33811a = i11;
        this.f33812b = l3Var;
        this.f33813c = i10;
    }

    @Override
    public final void run() {
        switch (this.f33811a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f33812b, this.f33813c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f33812b, this.f33813c, 3));
                return;
            case 2:
                this.f33812b.c(this.f33813c);
                return;
            default:
                this.f33812b.a(this.f33813c);
                return;
        }
    }
}
