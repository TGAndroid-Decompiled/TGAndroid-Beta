package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class nk implements NotificationCenter.PostponeNotificationCallback {
    public final tn f40826a;

    public nk(tn tnVar) {
        this.f40826a = tnVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            tn tnVar = this.f40826a;
            if (tnVar.D6 && longValue == tnVar.P5) {
                return true;
            }
        }
        return false;
    }
}
