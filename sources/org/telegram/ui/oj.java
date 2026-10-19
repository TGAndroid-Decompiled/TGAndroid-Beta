package org.telegram.ui;

import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
public final class oj implements Runnable {
    public final int f39899a;
    public final pj f39900b;

    public oj(pj pjVar, int i10) {
        this.f39899a = i10;
        this.f39900b = pjVar;
    }

    @Override
    public final void run() {
        switch (this.f39899a) {
            case 0:
                pj pjVar = this.f39900b;
                pjVar.W = null;
                qn qnVar = pjVar.X;
                if (qnVar.H9 != -1) {
                    qnVar.getNotificationCenter().onAnimationFinish(qnVar.H9);
                    qnVar.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
            default:
                pj pjVar2 = this.f39900b;
                pjVar2.W = null;
                qn qnVar2 = pjVar2.X;
                if (qnVar2.H9 != -1) {
                    qnVar2.getNotificationCenter().onAnimationFinish(qnVar2.H9);
                    qnVar2.H9 = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("chatItemAnimator enable notifications");
                    return;
                }
                return;
        }
    }
}
