package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class oj implements Runnable {
    public final int f40212a;
    public final pj f40213b;

    public oj(pj pjVar, int i10) {
        this.f40212a = i10;
        this.f40213b = pjVar;
    }

    @Override
    public final void run() {
        switch (this.f40212a) {
            case 0:
                pj pjVar = this.f40213b;
                pjVar.W = null;
                sn snVar = pjVar.X;
                if (snVar.T9 != -1) {
                    snVar.getNotificationCenter().onAnimationFinish(snVar.T9);
                    snVar.T9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                pj pjVar2 = this.f40213b;
                pjVar2.W = null;
                sn snVar2 = pjVar2.X;
                if (snVar2.T9 != -1) {
                    snVar2.getNotificationCenter().onAnimationFinish(snVar2.T9);
                    snVar2.T9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
