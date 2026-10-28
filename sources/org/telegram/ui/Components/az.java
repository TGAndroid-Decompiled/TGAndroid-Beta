package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class az {
    public final ArrayList f26695a = new ArrayList();
    public final sz f26696b;

    public az(sz szVar) {
        this.f26696b = szVar;
    }

    public final void a(String str, boolean z10) {
        sz szVar = this.f26696b;
        int i10 = szVar.f32713c1;
        String p10 = a1.g.p("gif_search_", str, "_");
        if (!z10 || !szVar.f32740l0.containsKey(p10)) {
            String str2 = str;
            bi.d4 d4Var = new bi.d4(this, str2, z10, p10, 5);
            ArrayList arrayList = this.f26695a;
            if (z10) {
                arrayList.add(p10);
                MessagesStorage.getInstance(i10).getBotCache(p10, d4Var);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(p10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, d4Var, 2);
        }
    }
}
