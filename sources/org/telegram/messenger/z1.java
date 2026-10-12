package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
public final class z1 implements NotificationCenter.NotificationCenterDelegate {
    public final int f19126a;
    public final Object f19127b;

    public z1(Object obj, int i10) {
        this.f19126a = i10;
        this.f19127b = obj;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
        switch (this.f19126a) {
            case 0:
                ContactsLoadingObserver.a((ContactsLoadingObserver) this.f19127b, i10, i11, objArr);
                return;
            default:
                ((TelegramMediaSession) this.f19127b).lambda$new$0(i10, i11, objArr);
                return;
        }
    }
}
