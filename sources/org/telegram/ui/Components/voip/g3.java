package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29352a;
    public final l3 f29353b;
    public final int f29354c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29352a = i11;
        this.f29353b = l3Var;
        this.f29354c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29352a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29353b, this.f29354c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29353b, this.f29354c, 3));
                return;
            case 2:
                this.f29353b.c(this.f29354c);
                return;
            default:
                this.f29353b.a(this.f29354c);
                return;
        }
    }
}
