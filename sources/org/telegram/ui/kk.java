package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class kk implements NotificationCenter.PostponeNotificationCallback {
    public final qn f39853a;

    public kk(qn qnVar) {
        this.f39853a = qnVar;
    }

    @Override
    public final boolean needPostpone(int i9, int i10, Object[] objArr) {
        if (i9 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            qn qnVar = this.f39853a;
            if (qnVar.D6 && longValue == qnVar.P5) {
                return true;
            }
        }
        return false;
    }
}
