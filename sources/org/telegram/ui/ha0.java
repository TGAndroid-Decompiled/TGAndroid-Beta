package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ha0 implements dq {
    public final cy f39966a;
    public final int f39967b;

    public ha0(cy cyVar, int i10) {
        this.f39966a = cyVar;
        this.f39967b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f39966a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f39967b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
