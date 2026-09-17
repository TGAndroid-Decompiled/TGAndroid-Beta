package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class i80 implements Runnable {
    public final int f27039a;
    public final k80 f27040b;
    public final boolean f27041c;

    public i80(k80 k80Var, boolean z10, int i10) {
        this.f27039a = i10;
        this.f27040b = k80Var;
        this.f27041c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27039a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i80(this.f27040b, this.f27041c, 1));
                return;
            default:
                this.f27040b.setJoinRequest(this.f27041c);
                return;
        }
    }
}
