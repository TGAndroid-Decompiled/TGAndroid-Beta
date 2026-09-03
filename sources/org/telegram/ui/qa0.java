package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class qa0 implements iq {
    public final qy f37368a;
    public final int f37369b;

    public qa0(qy qyVar, int i10) {
        this.f37368a = qyVar;
        this.f37369b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f37368a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f37369b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
