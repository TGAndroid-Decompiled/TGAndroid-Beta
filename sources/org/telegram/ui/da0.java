package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class da0 implements aq {
    public final ey f36113a;
    public final int f36114b;

    public da0(ey eyVar, int i10) {
        this.f36113a = eyVar;
        this.f36114b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f36113a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f36114b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
