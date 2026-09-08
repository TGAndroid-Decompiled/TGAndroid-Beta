package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;
public final class i1 implements Runnable {
    public final int f31572a;
    public final m1 f31573b;
    public final aj0 f31574c;

    public i1(m1 m1Var, aj0 aj0Var, int i10) {
        this.f31572a = i10;
        this.f31573b = m1Var;
        this.f31574c = aj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31572a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31573b, this.f31574c, 1));
                return;
            default:
                this.f31573b.removeView(this.f31574c);
                return;
        }
    }
}
