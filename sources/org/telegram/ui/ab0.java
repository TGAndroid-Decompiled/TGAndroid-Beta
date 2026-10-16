package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ab0 implements qq {
    public final yy f33830a;
    public final int f33831b;

    public ab0(yy yyVar, int i10) {
        this.f33830a = yyVar;
        this.f33831b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f33830a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f33831b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
