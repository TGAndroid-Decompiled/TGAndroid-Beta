package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class v80 implements Runnable {
    public final int f29012a;
    public final x80 f29013b;
    public final boolean f29014c;

    public v80(x80 x80Var, boolean z10, int i10) {
        this.f29012a = i10;
        this.f29013b = x80Var;
        this.f29014c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29012a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v80(this.f29013b, this.f29014c, 1));
                return;
            default:
                this.f29013b.setJoinRequest(this.f29014c);
                return;
        }
    }
}
