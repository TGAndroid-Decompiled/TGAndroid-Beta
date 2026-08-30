package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jj0;
public final class h1 implements Runnable {
    public final int f29668a;
    public final l1 f29669b;
    public final jj0 f29670c;

    public h1(l1 l1Var, jj0 jj0Var, int i10) {
        this.f29668a = i10;
        this.f29669b = l1Var;
        this.f29670c = jj0Var;
    }

    @Override
    public final void run() {
        switch (this.f29668a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h1(this.f29669b, this.f29670c, 1));
                return;
            default:
                this.f29669b.removeView(this.f29670c);
                return;
        }
    }
}
