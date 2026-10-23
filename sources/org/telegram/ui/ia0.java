package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ia0 implements aq {
    public final ey f38132a;
    public final int f38133b;

    public ia0(ey eyVar, int i10) {
        this.f38132a = eyVar;
        this.f38133b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f38132a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f38133b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
