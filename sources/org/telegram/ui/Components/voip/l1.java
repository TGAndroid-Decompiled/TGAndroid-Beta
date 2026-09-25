package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.lj0;
public final class l1 implements Runnable {
    public final int f29450a;
    public final p1 f29451b;
    public final lj0 f29452c;

    public l1(p1 p1Var, lj0 lj0Var, int i10) {
        this.f29450a = i10;
        this.f29451b = p1Var;
        this.f29452c = lj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29450a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29451b, this.f29452c, 1));
                return;
            default:
                this.f29451b.removeView(this.f29452c);
                return;
        }
    }
}
