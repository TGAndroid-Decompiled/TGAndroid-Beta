package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xj0;
public final class i1 implements Runnable {
    public final int f31507a;
    public final m1 f31508b;
    public final xj0 f31509c;

    public i1(m1 m1Var, xj0 xj0Var, int i10) {
        this.f31507a = i10;
        this.f31508b = m1Var;
        this.f31509c = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31507a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31508b, this.f31509c, 1));
                return;
            default:
                this.f31508b.removeView(this.f31509c);
                return;
        }
    }
}
