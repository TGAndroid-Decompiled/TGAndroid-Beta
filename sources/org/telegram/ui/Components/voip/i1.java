package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xj0;
public final class i1 implements Runnable {
    public final int f31516a;
    public final m1 f31517b;
    public final xj0 f31518c;

    public i1(m1 m1Var, xj0 xj0Var, int i10) {
        this.f31516a = i10;
        this.f31517b = m1Var;
        this.f31518c = xj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31516a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31517b, this.f31518c, 1));
                return;
            default:
                this.f31517b.removeView(this.f31518c);
                return;
        }
    }
}
