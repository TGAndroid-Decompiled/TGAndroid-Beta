package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class fl implements NotificationCenter.PostponeNotificationCallback {
    public final zn f37629a;

    public fl(zn znVar) {
        this.f37629a = znVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            zn znVar = this.f37629a;
            if (znVar.H6 && longValue == znVar.T5) {
                return true;
            }
        }
        return false;
    }
}
