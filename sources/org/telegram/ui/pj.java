package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class pj implements Runnable {
    public final int f42558a;
    public final qj f42559b;

    public pj(qj qjVar, int i10) {
        this.f42558a = i10;
        this.f42559b = qjVar;
    }

    @Override
    public final void run() {
        switch (this.f42558a) {
            case 0:
                qj qjVar = this.f42559b;
                qjVar.W = null;
                un unVar = qjVar.X;
                if (unVar.T9 != -1) {
                    unVar.getNotificationCenter().onAnimationFinish(unVar.T9);
                    unVar.T9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                qj qjVar2 = this.f42559b;
                qjVar2.W = null;
                un unVar2 = qjVar2.X;
                if (unVar2.T9 != -1) {
                    unVar2.getNotificationCenter().onAnimationFinish(unVar2.T9);
                    unVar2.T9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
