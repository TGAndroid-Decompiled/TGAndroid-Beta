package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w80 implements Runnable {
    public final int f29872a;
    public final x80 f29873b;
    public final boolean f29874c;
    public final boolean d;

    public w80(x80 x80Var, boolean z10, boolean z11, int i10) {
        this.f29872a = i10;
        this.f29873b = x80Var;
        this.f29874c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f29872a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.f29873b, this.f29874c, this.d, 1));
                return;
            default:
                x80 x80Var = this.f29873b;
                x80Var.setJoinRequest(this.f29874c);
                x80Var.setJoinToSend(this.d);
                return;
        }
    }
}
