package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w80 implements Runnable {
    public final int f29873a;
    public final x80 f29874b;
    public final boolean f29875c;
    public final boolean d;

    public w80(x80 x80Var, boolean z10, boolean z11, int i10) {
        this.f29873a = i10;
        this.f29874b = x80Var;
        this.f29875c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f29873a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.f29874b, this.f29875c, this.d, 1));
                return;
            default:
                x80 x80Var = this.f29874b;
                x80Var.setJoinRequest(this.f29875c);
                x80Var.setJoinToSend(this.d);
                return;
        }
    }
}
