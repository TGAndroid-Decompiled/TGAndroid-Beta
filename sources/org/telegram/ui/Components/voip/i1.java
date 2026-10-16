package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;
public final class i1 implements Runnable {
    public final int f29895a;
    public final m1 f29896b;
    public final bk0 f29897c;

    public i1(m1 m1Var, bk0 bk0Var, int i10) {
        this.f29895a = i10;
        this.f29896b = m1Var;
        this.f29897c = bk0Var;
    }

    @Override
    public final void run() {
        switch (this.f29895a) {
            case 0:
                AndroidUtilities.runOnUIThread(new i1(this.f29896b, this.f29897c, 1));
                return;
            default:
                this.f29896b.removeView(this.f29897c);
                return;
        }
    }
}
