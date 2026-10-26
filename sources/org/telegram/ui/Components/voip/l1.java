package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ak0;
public final class l1 implements Runnable {
    public final int f33936a;
    public final p1 f33937b;
    public final ak0 f33938c;

    public l1(p1 p1Var, ak0 ak0Var, int i10) {
        this.f33936a = i10;
        this.f33937b = p1Var;
        this.f33938c = ak0Var;
    }

    @Override
    public final void run() {
        switch (this.f33936a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f33937b, this.f33938c, 1));
                return;
            default:
                this.f33937b.removeView(this.f33938c);
                return;
        }
    }
}
