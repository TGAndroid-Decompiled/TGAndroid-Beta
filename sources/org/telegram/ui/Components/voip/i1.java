package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;
public final class i1 implements Runnable {
    public final int f31573a;
    public final m1 f31574b;
    public final aj0 f31575c;

    public i1(m1 m1Var, aj0 aj0Var, int i10) {
        this.f31573a = i10;
        this.f31574b = m1Var;
        this.f31575c = aj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31573a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31574b, this.f31575c, 1));
                return;
            default:
                this.f31574b.removeView(this.f31575c);
                return;
        }
    }
}
