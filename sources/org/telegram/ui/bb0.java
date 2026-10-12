package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class bb0 implements qq {
    public final yy f34501a;
    public final int f34502b;

    public bb0(yy yyVar, int i10) {
        this.f34501a = yyVar;
        this.f34502b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f34501a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f34502b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
