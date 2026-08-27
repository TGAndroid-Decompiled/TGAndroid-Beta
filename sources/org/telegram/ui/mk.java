package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

public final class mk implements NotificationCenter.PostponeNotificationCallback {

    public final rn f40530a;

    public mk(rn rnVar) {
        this.f40530a = rnVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long jLongValue = ((Long) objArr[0]).longValue();
            rn rnVar = this.f40530a;
            if (rnVar.D6 && jLongValue == rnVar.P5) {
                return true;
            }
        }
        return false;
    }
}
