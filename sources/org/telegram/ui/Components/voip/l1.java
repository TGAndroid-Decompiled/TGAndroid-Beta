package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lj0;
public final class l1 implements Runnable {
    public final int f29440a;
    public final p1 f29441b;
    public final lj0 f29442c;

    public l1(p1 p1Var, lj0 lj0Var, int i10) {
        this.f29440a = i10;
        this.f29441b = p1Var;
        this.f29442c = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29440a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29441b, this.f29442c, 1));
                return;
            default:
                this.f29441b.removeView(this.f29442c);
                return;
        }
    }
}
