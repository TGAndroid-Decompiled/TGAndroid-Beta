package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public interface aq {
    void a(TLRPC.User user);

    void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str);
}
