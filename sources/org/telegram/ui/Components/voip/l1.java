package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class l1 implements Runnable {
    public final int f29370a;
    public final p1 f29371b;
    public final nj0 f29372c;

    public l1(p1 p1Var, nj0 nj0Var, int i10) {
        this.f29370a = i10;
        this.f29371b = p1Var;
        this.f29372c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29370a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f29371b, this.f29372c, 1));
                return;
            default:
                this.f29371b.removeView(this.f29372c);
                return;
        }
    }
}
