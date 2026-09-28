package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29283a;
    public final l3 f29284b;
    public final int f29285c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29283a = i11;
        this.f29284b = l3Var;
        this.f29285c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29283a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29284b, this.f29285c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29284b, this.f29285c, 3));
                return;
            case 2:
                this.f29284b.c(this.f29285c);
                return;
            default:
                this.f29284b.a(this.f29285c);
                return;
        }
    }
}
