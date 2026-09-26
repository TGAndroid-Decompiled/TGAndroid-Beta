package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29361a;
    public final l3 f29362b;
    public final int f29363c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29361a = i11;
        this.f29362b = l3Var;
        this.f29363c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29361a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29362b, this.f29363c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29362b, this.f29363c, 3));
                return;
            case 2:
                this.f29362b.c(this.f29363c);
                return;
            default:
                this.f29362b.a(this.f29363c);
                return;
        }
    }
}
