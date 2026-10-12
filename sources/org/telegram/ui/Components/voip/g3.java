package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f31695a;
    public final l3 f31696b;
    public final int f31697c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f31695a = i11;
        this.f31696b = l3Var;
        this.f31697c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31695a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f31696b, this.f31697c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f31696b, this.f31697c, 3));
                return;
            case 2:
                this.f31696b.c(this.f31697c);
                return;
            default:
                this.f31696b.a(this.f31697c);
                return;
        }
    }
}
