package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class m80 implements Runnable {
    public final int f28999a;
    public final n80 f29000b;
    public final boolean f29001c;
    public final boolean d;

    public m80(n80 n80Var, boolean z4, boolean z10, int i10) {
        this.f28999a = i10;
        this.f29000b = n80Var;
        this.f29001c = z4;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f28999a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m80(this.f29000b, this.f29001c, this.d, 1));
                return;
            default:
                n80 n80Var = this.f29000b;
                n80Var.setJoinRequest(this.f29001c);
                n80Var.setJoinToSend(this.d);
                return;
        }
    }
}
