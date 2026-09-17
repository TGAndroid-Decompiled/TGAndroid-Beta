package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ab0 implements mq {
    public final wy f31780a;
    public final int f31781b;

    public ab0(wy wyVar, int i10) {
        this.f31780a = wyVar;
        this.f31781b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f31780a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f31781b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
