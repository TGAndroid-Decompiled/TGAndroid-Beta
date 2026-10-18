package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class qj implements Runnable {
    public final int f40450a;
    public final rj f40451b;

    public qj(rj rjVar, int i10) {
        this.f40450a = i10;
        this.f40451b = rjVar;
    }

    @Override
    public final void run() {
        switch (this.f40450a) {
            case 0:
                rj rjVar = this.f40451b;
                rjVar.W = null;
                sn snVar = rjVar.X;
                if (snVar.H9 != -1) {
                    snVar.getNotificationCenter().onAnimationFinish(snVar.H9);
                    snVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                rj rjVar2 = this.f40451b;
                rjVar2.W = null;
                sn snVar2 = rjVar2.X;
                if (snVar2.H9 != -1) {
                    snVar2.getNotificationCenter().onAnimationFinish(snVar2.H9);
                    snVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
