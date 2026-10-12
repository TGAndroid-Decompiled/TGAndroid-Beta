package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
public final class jl implements NotificationCenter.PostponeNotificationCallback {
    public final eo f39237a;

    public jl(eo eoVar) {
        this.f39237a = eoVar;
    }

    @Override
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            eo eoVar = this.f39237a;
            if (eoVar.H6 && longValue == eoVar.T5) {
                return true;
            }
        }
        return false;
    }
}
