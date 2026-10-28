package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bk0;
public final class l1 implements Runnable {
    public final int f34041a;
    public final p1 f34042b;
    public final bk0 f34043c;

    public l1(p1 p1Var, bk0 bk0Var, int i10) {
        this.f34041a = i10;
        this.f34042b = p1Var;
        this.f34043c = bk0Var;
    }

    @Override
    public final void run() {
        switch (this.f34041a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f34042b, this.f34043c, 1));
                return;
            default:
                this.f34042b.removeView(this.f34043c);
                return;
        }
    }
}
