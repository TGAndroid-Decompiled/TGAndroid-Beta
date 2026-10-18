package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class qj implements Runnable {
    public final int f40416a;
    public final rj f40417b;

    public qj(rj rjVar, int i10) {
        this.f40416a = i10;
        this.f40417b = rjVar;
    }

    @Override
    public final void run() {
        switch (this.f40416a) {
            case 0:
                rj rjVar = this.f40417b;
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
                rj rjVar2 = this.f40417b;
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
