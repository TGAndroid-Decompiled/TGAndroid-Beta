package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ty {
    public final ArrayList f31439a = new ArrayList();
    public final mz f31440b;

    public ty(mz mzVar) {
        this.f31440b = mzVar;
    }

    public final void a(String str, boolean z4) {
        mz mzVar = this.f31440b;
        int i10 = mzVar.Z0;
        String o10 = android.support.v4.media.a.o("gif_search_", str, "_");
        if (!z4 || !mzVar.f29293i0.containsKey(o10)) {
            String str2 = str;
            org.telegram.ui.wd wdVar = new org.telegram.ui.wd(this, str2, z4, o10, 3);
            ArrayList arrayList = this.f31439a;
            if (z4) {
                arrayList.add(o10);
                MessagesStorage.getInstance(i10).getBotCache(o10, wdVar);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(o10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, wdVar, 2);
        }
    }
}
