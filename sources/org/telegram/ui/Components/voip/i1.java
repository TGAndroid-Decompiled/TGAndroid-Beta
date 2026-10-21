package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yj0;
public final class i1 implements Runnable {
    public final int f31468a;
    public final m1 f31469b;
    public final yj0 f31470c;

    public i1(m1 m1Var, yj0 yj0Var, int i10) {
        this.f31468a = i10;
        this.f31469b = m1Var;
        this.f31470c = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31468a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31469b, this.f31470c, 1));
                return;
            default:
                this.f31469b.removeView(this.f31470c);
                return;
        }
    }
}
