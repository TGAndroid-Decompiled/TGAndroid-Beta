package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class pa0 implements hq {
    public final py f39962a;
    public final int f39963b;

    public pa0(py pyVar, int i10) {
        this.f39962a = pyVar;
        this.f39963b = i10;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        this.f39962a.removeSelfFromStack();
        NotificationCenter.getInstance(this.f39963b).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
