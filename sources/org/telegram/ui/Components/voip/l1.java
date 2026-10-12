package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ik0;
public final class l1 implements Runnable {
    public final int f31775a;
    public final p1 f31776b;
    public final ik0 f31777c;

    public l1(p1 p1Var, ik0 ik0Var, int i10) {
        this.f31775a = i10;
        this.f31776b = p1Var;
        this.f31777c = ik0Var;
    }

    @Override
    public final void run() {
        switch (this.f31775a) {
            case 0:
                AndroidUtilities.runOnUIThread(new l1(this.f31776b, this.f31777c, 1));
                return;
            default:
                this.f31776b.removeView(this.f31777c);
                return;
        }
    }
}
