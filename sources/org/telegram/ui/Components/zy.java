package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zy {
    public final ArrayList f29826a = new ArrayList();
    public final rz f29827b;

    public zy(rz rzVar) {
        this.f29827b = rzVar;
    }

    public final void a(String str, boolean z10) {
        rz rzVar = this.f29827b;
        int i10 = rzVar.f26805c1;
        String p5 = a4.a.p("gif_search_", str, "_");
        if (!z10 || !rzVar.f26832l0.containsKey(p5)) {
            bi.d2 d2Var = new bi.d2(this, str, z10, p5);
            ArrayList arrayList = this.f29826a;
            if (z10) {
                arrayList.add(p5);
                MessagesStorage.getInstance(i10).getBotCache(p5, d2Var);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(p5);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, d2Var, 2);
        }
    }
}
