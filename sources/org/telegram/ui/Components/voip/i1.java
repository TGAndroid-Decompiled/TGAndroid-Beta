package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xj0;
public final class i1 implements Runnable {
    public final int f31518a;
    public final m1 f31519b;
    public final xj0 f31520c;

    public i1(m1 m1Var, xj0 xj0Var, int i10) {
        this.f31518a = i10;
        this.f31519b = m1Var;
        this.f31520c = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31518a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31519b, this.f31520c, 1));
                return;
            default:
                this.f31519b.removeView(this.f31520c);
                return;
        }
    }
}
