package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ab0 implements kq {
    public final uy f32025a;
    public final int f32026b;

    public ab0(uy uyVar, int i10) {
        this.f32025a = uyVar;
        this.f32026b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f32025a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f32026b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
