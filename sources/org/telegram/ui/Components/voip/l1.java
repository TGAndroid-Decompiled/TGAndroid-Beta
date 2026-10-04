package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class l1 implements Runnable {
    public final int f31962a;
    public final p1 f31963b;
    public final nj0 f31964c;

    public l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.f31962a = i10;
        this.f31963b = p1Var;
        this.f31964c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f31962a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f31963b, this.f31964c, 1));
                return;
            default:
                this.f31963b.removeView(this.f31964c);
                return;
        }
    }
}
