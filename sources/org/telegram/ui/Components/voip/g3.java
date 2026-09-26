package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29278a;
    public final l3 f29279b;
    public final int f29280c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29278a = i11;
        this.f29279b = l3Var;
        this.f29280c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29278a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29279b, this.f29280c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29279b, this.f29280c, 3));
                return;
            case 2:
                this.f29279b.c(this.f29280c);
                return;
            default:
                this.f29279b.a(this.f29280c);
                return;
        }
    }
}
