package org.telegram.ui.Components;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class aw0 extends org.telegram.messenger.b3 {
    @Override
    public final void f(int i10, Object obj, long j10, org.telegram.messenger.a3 a3Var) {
        TLRPC.TL_messages_searchCustomEmoji tL_messages_searchCustomEmoji = new TLRPC.TL_messages_searchCustomEmoji();
        tL_messages_searchCustomEmoji.emoticon = (String) obj;
        tL_messages_searchCustomEmoji.hash = j10;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchCustomEmoji, new yv0(a3Var, 1));
    }
}
