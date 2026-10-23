package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yj0;
public final class i1 implements Runnable {
    public final int f31472a;
    public final m1 f31473b;
    public final yj0 f31474c;

    public i1(m1 m1Var, yj0 yj0Var, int i10) {
        this.f31472a = i10;
        this.f31473b = m1Var;
        this.f31474c = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31472a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31473b, this.f31474c, 1));
                return;
            default:
                this.f31473b.removeView(this.f31474c);
                return;
        }
    }
}
