package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class z1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f20189a;
    public final Object f20190b;

    public z1(Object obj, int i10) {
        this.f20189a = i10;
        this.f20190b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f20189a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f20190b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f20190b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
