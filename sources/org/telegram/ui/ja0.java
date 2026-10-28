package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ja0 implements fq {
    public final ey f40497a;
    public final int f40498b;

    public ja0(ey eyVar, int i10) {
        this.f40497a = eyVar;
        this.f40498b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f40497a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f40498b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
