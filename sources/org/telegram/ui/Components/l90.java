package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class l90 implements Runnable {
    public final int f28261a;
    public final n90 f28262b;
    public final boolean f28263c;

    public l90(n90 n90Var, boolean z10, int i10) {
        this.f28261a = i10;
        this.f28262b = n90Var;
        this.f28263c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28261a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l90(this.f28262b, this.f28263c, 1));
                return;
            default:
                this.f28262b.setJoinRequest(this.f28263c);
                return;
        }
    }
}
