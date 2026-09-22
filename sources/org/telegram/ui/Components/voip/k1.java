package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;
public final class k1 implements Runnable {
    public final int f29031a;
    public final o1 f29032b;
    public final aj0 f29033c;

    public k1(o1 o1Var, aj0 aj0Var, int i10) {
        this.f29031a = i10;
        this.f29032b = o1Var;
        this.f29033c = aj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29031a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f29032b, this.f29033c, 1));
                return;
            default:
                this.f29032b.removeView(this.f29033c);
                return;
        }
    }
}
