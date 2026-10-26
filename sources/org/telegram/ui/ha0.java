package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ha0 implements dq {
    public final cy f39969a;
    public final int f39970b;

    public ha0(cy cyVar, int i10) {
        this.f39969a = cyVar;
        this.f39970b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f39969a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f39970b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
