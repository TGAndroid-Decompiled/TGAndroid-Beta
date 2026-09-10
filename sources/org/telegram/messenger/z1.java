package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class z1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f17112a;
    public final Object f17113b;

    public z1(Object obj, int i10) {
        this.f17112a = i10;
        this.f17113b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f17112a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f17113b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f17113b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
