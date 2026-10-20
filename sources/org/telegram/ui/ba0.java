package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ba0 implements yp {
    public final cy f35556a;
    public final int f35557b;

    public ba0(cy cyVar, int i10) {
        this.f35556a = cyVar;
        this.f35557b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f35556a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f35557b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
