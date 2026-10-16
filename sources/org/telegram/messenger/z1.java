package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class z1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f18828a;
    public final Object f18829b;

    public z1(Object obj, int i10) {
        this.f18828a = i10;
        this.f18829b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f18828a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f18829b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f18829b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
