package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ab0 implements kq {
    public final uy f32046a;
    public final int f32047b;

    public ab0(uy uyVar, int i10) {
        this.f32046a = uyVar;
        this.f32047b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f32046a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f32047b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
