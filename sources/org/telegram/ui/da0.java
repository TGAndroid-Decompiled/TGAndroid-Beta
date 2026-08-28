package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class da0 implements yp {
    public final dy f37486a;
    public final int f37487b;

    public da0(dy dyVar, int i9) {
        this.f37486a = dyVar;
        this.f37487b = i9;
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f37486a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f37487b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
