package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.aj0;
public final class k1 implements Runnable {
    public final int f29034a;
    public final o1 f29035b;
    public final aj0 f29036c;

    public k1(o1 o1Var, aj0 aj0Var, int i10) {
        this.f29034a = i10;
        this.f29035b = o1Var;
        this.f29036c = aj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29034a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f29035b, this.f29036c, 1));
                return;
            default:
                this.f29035b.removeView(this.f29036c);
                return;
        }
    }
}
