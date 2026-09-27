package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29304a;
    public final l3 f29305b;
    public final int f29306c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29304a = i11;
        this.f29305b = l3Var;
        this.f29306c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29304a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29305b, this.f29306c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29305b, this.f29306c, 3));
                return;
            case 2:
                this.f29305b.c(this.f29306c);
                return;
            default:
                this.f29305b.a(this.f29306c);
                return;
        }
    }
}
