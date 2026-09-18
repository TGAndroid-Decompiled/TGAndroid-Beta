package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ab0 implements mq {
    public final wy f31784a;
    public final int f31785b;

    public ab0(wy wyVar, int i10) {
        this.f31784a = wyVar;
        this.f31785b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f31784a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f31785b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
