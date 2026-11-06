package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public interface hp {
    void a(TLRPC.User user);

    void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str);
}
