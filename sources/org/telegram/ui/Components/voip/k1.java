package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bj0;
public final class k1 implements Runnable {
    public final int f29014a;
    public final o1 f29015b;
    public final bj0 f29016c;

    public k1(o1 o1Var, bj0 bj0Var, int i10) {
        this.f29014a = i10;
        this.f29015b = o1Var;
        this.f29016c = bj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29014a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k1(this.f29015b, this.f29016c, 1));
                return;
            default:
                this.f29015b.removeView(this.f29016c);
                return;
        }
    }
}
