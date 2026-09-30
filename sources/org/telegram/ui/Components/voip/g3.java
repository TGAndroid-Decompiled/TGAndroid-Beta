package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29273a;
    public final l3 f29274b;
    public final int f29275c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29273a = i11;
        this.f29274b = l3Var;
        this.f29275c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29273a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29274b, this.f29275c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29274b, this.f29275c, 3));
                return;
            case 2:
                this.f29274b.c(this.f29275c);
                return;
            default:
                this.f29274b.a(this.f29275c);
                return;
        }
    }
}
