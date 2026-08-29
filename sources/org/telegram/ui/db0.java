package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public interface db0 {
    void a(TLRPC.TL_chatInviteExported tL_chatInviteExported);

    void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, TLObject tLObject);

    void c(TLObject tLObject);
}
