package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bz {
    public final ArrayList f25060a = new ArrayList();
    public final tz f25061b;

    public bz(tz tzVar) {
        this.f25061b = tzVar;
    }

    public final void a(String str, boolean z10) {
        tz tzVar = this.f25061b;
        int i10 = tzVar.f30726c1;
        String p5 = a1.g.p("gif_search_", str, "_");
        if (!z10 || !tzVar.f30753l0.containsKey(p5)) {
            String str2 = str;
            ai.i4 i4Var = new ai.i4(this, str2, z10, p5, 5);
            ArrayList arrayList = this.f25060a;
            if (z10) {
                arrayList.add(p5);
                MessagesStorage.getInstance(i10).getBotCache(p5, i4Var);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(p5);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, i4Var, 2);
        }
    }
}
