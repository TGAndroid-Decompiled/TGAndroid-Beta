package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;
public final class i1 implements Runnable {
    public final int f31545a;
    public final m1 f31546b;
    public final aj0 f31547c;

    public i1(m1 m1Var, aj0 aj0Var, int i10) {
        this.f31545a = i10;
        this.f31546b = m1Var;
        this.f31547c = aj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31545a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31546b, this.f31547c, 1));
                return;
            default:
                this.f31546b.removeView(this.f31547c);
                return;
        }
    }
}
