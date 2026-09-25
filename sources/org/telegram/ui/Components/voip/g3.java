package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29362a;
    public final l3 f29363b;
    public final int f29364c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29362a = i11;
        this.f29363b = l3Var;
        this.f29364c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29362a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29363b, this.f29364c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29363b, this.f29364c, 3));
                return;
            case 2:
                this.f29363b.c(this.f29364c);
                return;
            default:
                this.f29363b.a(this.f29364c);
                return;
        }
    }
}
