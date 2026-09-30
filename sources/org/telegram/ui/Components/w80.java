package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class w80 implements Runnable {
    public final int f29869a;
    public final x80 f29870b;
    public final boolean f29871c;
    public final boolean d;

    public w80(x80 x80Var, boolean z10, boolean z11, int i10) {
        this.f29869a = i10;
        this.f29870b = x80Var;
        this.f29871c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f29869a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w80(this.f29870b, this.f29871c, this.d, 1));
                return;
            default:
                x80 x80Var = this.f29870b;
                x80Var.setJoinRequest(this.f29871c);
                x80Var.setJoinToSend(this.d);
                return;
        }
    }
}
