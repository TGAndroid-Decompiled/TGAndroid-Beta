package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nj0;
public final class k1 implements Runnable {
    public final int f29399a;
    public final o1 f29400b;
    public final nj0 f29401c;

    public k1(o1 o1Var, nj0 nj0Var, int i10) {
        this.f29399a = i10;
        this.f29400b = o1Var;
        this.f29401c = nj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29399a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f29400b, this.f29401c, 1));
                return;
            default:
                this.f29400b.removeView(this.f29401c);
                return;
        }
    }
}
