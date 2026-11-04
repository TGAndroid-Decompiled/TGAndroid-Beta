package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public interface fp {
    void a(TLRPC.User user);

    void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str);
}
