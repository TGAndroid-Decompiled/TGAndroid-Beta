package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.yj0;
public final class i1 implements Runnable {
    public final int f31471a;
    public final m1 f31472b;
    public final yj0 f31473c;

    public i1(m1 m1Var, yj0 yj0Var, int i10) {
        this.f31471a = i10;
        this.f31472b = m1Var;
        this.f31473c = yj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31471a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31472b, this.f31473c, 1));
                return;
            default:
                this.f31472b.removeView(this.f31473c);
                return;
        }
    }
}
