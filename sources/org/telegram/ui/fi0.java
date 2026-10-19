package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class fi0 implements Runnable {
    public final int f37016a;
    public final gi0 f37017b;

    public fi0(gi0 gi0Var, int i10) {
        this.f37016a = i10;
        this.f37017b = gi0Var;
    }

    @Override
    public final void run() {
        switch (this.f37016a) {
            case 0:
                this.f37017b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37017b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
