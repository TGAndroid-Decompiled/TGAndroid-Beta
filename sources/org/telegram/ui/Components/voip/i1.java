package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xj0;
public final class i1 implements Runnable {
    public final int f31514a;
    public final m1 f31515b;
    public final xj0 f31516c;

    public i1(m1 m1Var, xj0 xj0Var, int i10) {
        this.f31514a = i10;
        this.f31515b = m1Var;
        this.f31516c = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31514a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31515b, this.f31516c, 1));
                return;
            default:
                this.f31515b.removeView(this.f31516c);
                return;
        }
    }
}
