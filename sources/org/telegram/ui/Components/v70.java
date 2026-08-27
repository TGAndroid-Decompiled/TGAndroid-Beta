package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class v70 implements Runnable {

    public final int f33292a;

    public final x70 f33293b;

    public final boolean f33294c;

    public v70(x70 x70Var, boolean z10, int i10) {
        this.f33292a = i10;
        this.f33293b = x70Var;
        this.f33294c = z10;
    }

    @Override
    public final void run() {
        switch (this.f33292a) {
            case 0:
                AndroidUtilities.runOnUIThread(new v70(this.f33293b, this.f33294c, 1));
                break;
            default:
                this.f33293b.setJoinRequest(this.f33294c);
                break;
        }
    }
}
