package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ga0 implements aq {
    public final fy f38542a;
    public final int f38543b;

    public ga0(fy fyVar, int i10) {
        this.f38542a = fyVar;
        this.f38543b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f38542a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f38543b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
