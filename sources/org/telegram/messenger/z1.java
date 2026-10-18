package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class z1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f20186a;
    public final Object f20187b;

    public z1(Object obj, int i10) {
        this.f20186a = i10;
        this.f20187b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f20186a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f20187b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f20187b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
