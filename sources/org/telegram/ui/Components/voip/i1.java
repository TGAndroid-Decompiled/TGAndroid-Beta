package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;
public final class i1 implements Runnable {
    public final int f33750a;
    public final m1 f33751b;
    public final aj0 f33752c;

    public i1(m1 m1Var, aj0 aj0Var, int i10) {
        this.f33750a = i10;
        this.f33751b = m1Var;
        this.f33752c = aj0Var;
    }

    @Override
    public final void run() {
        switch (this.f33750a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f33751b, this.f33752c, 1));
                return;
            default:
                this.f33751b.removeView(this.f33752c);
                return;
        }
    }
}
