package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class m80 implements Runnable {
    public final int f28981a;
    public final n80 f28982b;
    public final boolean f28983c;
    public final boolean d;

    public m80(n80 n80Var, boolean z4, boolean z10, int i10) {
        this.f28981a = i10;
        this.f28982b = n80Var;
        this.f28983c = z4;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f28981a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m80(this.f28982b, this.f28983c, this.d, 1));
                return;
            default:
                n80 n80Var = this.f28982b;
                n80Var.setJoinRequest(this.f28983c);
                n80Var.setJoinToSend(this.d);
                return;
        }
    }
}
