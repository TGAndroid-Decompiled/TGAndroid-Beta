package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ik0;
public final class l1 implements Runnable {
    public final int f31790a;
    public final p1 f31791b;
    public final ik0 f31792c;

    public l1(p1 p1Var, ik0 ik0Var, int i10) {
        this.f31790a = i10;
        this.f31791b = p1Var;
        this.f31792c = ik0Var;
    }

    @Override
    public final void run() {
        switch (this.f31790a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f31791b, this.f31792c, 1));
                return;
            default:
                this.f31791b.removeView(this.f31792c);
                return;
        }
    }
}
