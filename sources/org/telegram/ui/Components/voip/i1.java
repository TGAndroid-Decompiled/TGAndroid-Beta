package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;
public final class i1 implements Runnable {
    public final int f31653a;
    public final m1 f31654b;
    public final bk0 f31655c;

    public i1(m1 m1Var, bk0 bk0Var, int i10) {
        this.f31653a = i10;
        this.f31654b = m1Var;
        this.f31655c = bk0Var;
    }

    @Override
    public final void run() {
        switch (this.f31653a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f31654b, this.f31655c, 1));
                return;
            default:
                this.f31654b.removeView(this.f31655c);
                return;
        }
    }
}
