package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class oa0 implements gq {
    public final oy f36859a;
    public final int f36860b;

    public oa0(oy oyVar, int i10) {
        this.f36859a = oyVar;
        this.f36860b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f36859a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f36860b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
