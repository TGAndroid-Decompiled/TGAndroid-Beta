package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class ha0 implements aq {

    public final gy f38764a;

    public final int f38765b;

    public ha0(gy gyVar, int i10) {
        this.f38764a = gyVar;
        this.f38765b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f38764a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f38765b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
