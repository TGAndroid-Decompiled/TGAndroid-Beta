package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hz {
    public final ArrayList f27157a = new ArrayList();
    public final a00 f27158b;

    public hz(a00 a00Var) {
        this.f27158b = a00Var;
    }

    public final void a(String str, boolean z10) {
        a00 a00Var = this.f27158b;
        int i10 = a00Var.f24401c1;
        String q6 = a1.g.q("gif_search_", str, "_");
        if (!z10 || !a00Var.f24429l0.containsKey(q6)) {
            ci.s1 s1Var = new ci.s1(this, str, z10, q6);
            ArrayList arrayList = this.f27157a;
            if (z10) {
                arrayList.add(q6);
                MessagesStorage.getInstance(i10).getBotCache(q6, s1Var);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(q6);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, s1Var, 2);
        }
    }
}
