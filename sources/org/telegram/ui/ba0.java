package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ba0 implements yp {
    public final cy f35561a;
    public final int f35562b;

    public ba0(cy cyVar, int i10) {
        this.f35561a = cyVar;
        this.f35562b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f35561a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f35562b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
