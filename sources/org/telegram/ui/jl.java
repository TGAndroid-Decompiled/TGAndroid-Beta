package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class jl implements NotificationCenter.PostponeNotificationCallback {
    public final fo f37087a;

    public jl(fo foVar) {
        this.f37087a = foVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            fo foVar = this.f37087a;
            if (foVar.H6 && longValue == foVar.T5) {
                return true;
            }
        }
        return false;
    }
}
