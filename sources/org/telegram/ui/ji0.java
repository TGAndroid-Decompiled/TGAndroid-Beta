package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ji0 implements Runnable {
    public final int f40547a;
    public final ki0 f40548b;

    public ji0(ki0 ki0Var, int i10) {
        this.f40547a = i10;
        this.f40548b = ki0Var;
    }

    @Override
    public final void run() {
        switch (this.f40547a) {
            case 0:
                this.f40548b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f40548b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
