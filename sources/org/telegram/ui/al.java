package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class al implements NotificationCenter.PostponeNotificationCallback {
    public final wn f37792a;

    public al(wn wnVar) {
        this.f37792a = wnVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            wn wnVar = this.f37792a;
            if (wnVar.X6 && longValue == wnVar.f45168j6) {
                return true;
            }
        }
        return false;
    }
}
