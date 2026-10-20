package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yj0;
public final class i1 implements Runnable {
    public final int f31467a;
    public final m1 f31468b;
    public final yj0 f31469c;

    public i1(m1 m1Var, yj0 yj0Var, int i10) {
        this.f31467a = i10;
        this.f31468b = m1Var;
        this.f31469c = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31467a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31468b, this.f31469c, 1));
                return;
            default:
                this.f31468b.removeView(this.f31469c);
                return;
        }
    }
}
