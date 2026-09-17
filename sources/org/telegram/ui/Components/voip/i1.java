package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;
public final class i1 implements Runnable {
    public final int f31546a;
    public final m1 f31547b;
    public final aj0 f31548c;

    public i1(m1 m1Var, aj0 aj0Var, int i10) {
        this.f31546a = i10;
        this.f31547b = m1Var;
        this.f31548c = aj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31546a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31547b, this.f31548c, 1));
                return;
            default:
                this.f31547b.removeView(this.f31548c);
                return;
        }
    }
}
