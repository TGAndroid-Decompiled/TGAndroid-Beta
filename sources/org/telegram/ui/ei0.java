package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class ei0 implements Runnable {
    public final int f37842a;
    public final fi0 f37843b;

    public ei0(fi0 fi0Var, int i10) {
        this.f37842a = i10;
        this.f37843b = fi0Var;
    }

    @Override
    public final void run() {
        switch (this.f37842a) {
            case 0:
                this.f37843b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                this.f37843b.W = null;
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
