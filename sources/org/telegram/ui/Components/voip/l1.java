package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lj0;
public final class l1 implements Runnable {
    public final int f29449a;
    public final p1 f29450b;
    public final lj0 f29451c;

    public l1(p1 p1Var, lj0 lj0Var, int i10) {
        this.f29449a = i10;
        this.f29450b = p1Var;
        this.f29451c = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29449a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29450b, this.f29451c, 1));
                return;
            default:
                this.f29450b.removeView(this.f29451c);
                return;
        }
    }
}
