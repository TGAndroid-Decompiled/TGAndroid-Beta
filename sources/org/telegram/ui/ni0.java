package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ni0 implements Runnable {
    public final int f39463a;
    public final oi0 f39464b;

    public ni0(oi0 oi0Var, int i10) {
        this.f39463a = i10;
        this.f39464b = oi0Var;
    }

    @Override
    public final void run() {
        switch (this.f39463a) {
            case 0:
                this.f39464b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f39464b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
