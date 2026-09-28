package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
public final class g3 implements Runnable {
    public final int f29282a;
    public final l3 f29283b;
    public final int f29284c;

    public g3(l3 l3Var, int i10, int i11) {
        this.f29282a = i11;
        this.f29283b = l3Var;
        this.f29284c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29282a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g3(this.f29283b, this.f29284c, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new g3(this.f29283b, this.f29284c, 3));
                return;
            case 2:
                this.f29283b.c(this.f29284c);
                return;
            default:
                this.f29283b.a(this.f29284c);
                return;
        }
    }
}
