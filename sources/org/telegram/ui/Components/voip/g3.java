package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f31874a;
    public final l3 f31875b;
    public final int f31876c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f31874a = i11;
        this.f31875b = l3Var;
        this.f31876c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31874a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f31875b, this.f31876c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f31875b, this.f31876c, 3));
                return;
            case 2:
                this.f31875b.c(this.f31876c);
                return;
            default:
                this.f31875b.a(this.f31876c);
                return;
        }
    }
}
