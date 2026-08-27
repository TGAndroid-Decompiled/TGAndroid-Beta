package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class w70 implements Runnable {

    public final int f34132a;

    public final x70 f34133b;

    public final boolean f34134c;
    public final boolean d;

    public w70(x70 x70Var, boolean z10, boolean z11, int i10) {
        this.f34132a = i10;
        this.f34133b = x70Var;
        this.f34134c = z10;
        this.d = z11;
    }

    @Override
    public final void run() {
        switch (this.f34132a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w70(this.f34133b, this.f34134c, this.d, 1));
                break;
            default:
                x70 x70Var = this.f34133b;
                x70Var.setJoinRequest(this.f34134c);
                x70Var.setJoinToSend(this.d);
                break;
        }
    }
}
