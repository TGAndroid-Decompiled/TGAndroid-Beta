package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class l1 implements Runnable {
    public final int f31963a;
    public final p1 f31964b;
    public final nj0 f31965c;

    public l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.f31963a = i10;
        this.f31964b = p1Var;
        this.f31965c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31963a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f31964b, this.f31965c, 1));
                return;
            default:
                this.f31964b.removeView(this.f31965c);
                return;
        }
    }
}
